/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfBody;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.ModelProdutos;

/**
 *
 * @author Usuario
 */
public class ControllerRelatorio {
    
    ControllerProdutos controllerProdutos = new ControllerProdutos();

    public void gerarRelatorio() {
        Document documento = new Document();

        try {
            PdfWriter.getInstance(documento, new FileOutputStream("C:\\Users\\Usuario\\Desktop\\Backup Valdineis Moreira\\Usuario\\Downloads\\PDF_TESTE.pdf"));

            documento.open();

            documento.setPageSize(PageSize.A4);

            documento.add(new Paragraph("GERANDO PDF TESTE - 1\nOLA\nNome - Sexo - Idade"));
            documento.newPage();
            documento.add(new Paragraph(this.carregarProdutos()));

        } catch (DocumentException e) {
            e.printStackTrace();

        } catch (IOException ioe) {
            ioe.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            documento.close();
        }
    }
    
    public String carregarProdutos() {
        ArrayList<ModelProdutos> listaModelProdutos = controllerProdutos.retornarListaProdutoController();
        
        //inserir produtos na tabela
        int count = listaModelProdutos.size(); //pega o tamanho da lista pra percorrer todos os dados dela
        String listaDados = "";
        for (int i = 0; i < count; i++) {
            listaDados += listaModelProdutos.get(i).getProNome() + " - ";
            listaDados += listaModelProdutos.get(i).getProEstoque() + " - ";
            listaDados += listaModelProdutos.get(i).getProValor() + "\n";
        }
        
        return listaDados;
    }

}
