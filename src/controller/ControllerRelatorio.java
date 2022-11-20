/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.html.simpleparser.StyleSheet;
import com.itextpdf.text.pdf.PdfBody;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.List;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.ModelClientes;
import model.ModelPagamentos;
import model.ModelProdutos;
import model.ModelRecebimentos;
import util.BLDatas;

/**
 *
 * @author Usuario
 */
public class ControllerRelatorio {

    ControllerRecebimentos controllerRecebimentos = new ControllerRecebimentos();
    ControllerPagamentos controllerPagamentos = new ControllerPagamentos();
    ControllerClientes controllerClientes = new ControllerClientes();
    ControllerProdutos controllerProdutos = new ControllerProdutos();
    BLDatas bLDatas = new BLDatas();
    Date dataAtual = null;

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

    public void gerarPdfProdutos() {
        controllerProdutos = new ControllerProdutos();
        Document doc = new Document();

        ArrayList<ModelProdutos> listaProdutos = controllerProdutos.retornarListaProdutoController();

        try {
            dataAtual = bLDatas.converterDataParaDateUS(new java.util.Date(System.currentTimeMillis()));
            PdfWriter.getInstance(doc, new FileOutputStream("C:\\Users\\Usuario\\Desktop\\Backup Valdineis Moreira\\Usuario\\Downloads\\relatorio-produto-" + dataAtual + ".pdf"));
            doc.open();

            Paragraph paragrafo = new Paragraph(String.valueOf(dataAtual));
            paragrafo.setAlignment(1);
            doc.add(paragrafo);

            paragrafo = new Paragraph("Relatório PDF - Produtos");
            paragrafo.setAlignment(1);
            doc.add(paragrafo);
            paragrafo = new Paragraph("   ");
            doc.add(paragrafo);

            PdfPTable table = new PdfPTable(4);

            PdfPCell cel1 = new PdfPCell(new Paragraph("Id"));
            PdfPCell cel2 = new PdfPCell(new Paragraph("Produto"));
            PdfPCell cel3 = new PdfPCell(new Paragraph("Quantidade"));
            PdfPCell cel4 = new PdfPCell(new Paragraph("Valor"));

            table.addCell(cel1).setBackgroundColor(BaseColor.LIGHT_GRAY);;
            table.addCell(cel2).setBackgroundColor(BaseColor.LIGHT_GRAY);;
            table.addCell(cel3).setBackgroundColor(BaseColor.LIGHT_GRAY);;
            table.addCell(cel4).setBackgroundColor(BaseColor.LIGHT_GRAY);;

            for (ModelProdutos produto : listaProdutos) {
                cel1 = new PdfPCell(new Paragraph(String.valueOf(produto.getIdProduto())));
                cel2 = new PdfPCell(new Paragraph(produto.getProNome()));
                cel3 = new PdfPCell(new Paragraph(String.valueOf(produto.getProEstoque())));
                cel4 = new PdfPCell(new Paragraph(String.valueOf(produto.getProValor())));

                table.addCell(cel1);
                table.addCell(cel2);
                table.addCell(cel3);
                table.addCell(cel4);
            }

            doc.add(table);
            doc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void gerarPdfClientes() {
        controllerClientes = new ControllerClientes();
        Document doc = new Document();

        ArrayList<ModelClientes> listaClientes = controllerClientes.retornarListaClienteController();

        try {
            dataAtual = bLDatas.converterDataParaDateUS(new java.util.Date(System.currentTimeMillis()));
            PdfWriter.getInstance(doc, new FileOutputStream("C:\\Users\\Usuario\\Desktop\\Backup Valdineis Moreira\\Usuario\\Downloads\\relatorio-cliente-" + dataAtual + ".pdf"));
            doc.open();
            
            Paragraph paragrafo = new Paragraph(String.valueOf(dataAtual));
            paragrafo.setAlignment(1);
            doc.add(paragrafo);

            paragrafo = new Paragraph("Relatório PDF - Clientes");
            paragrafo.setAlignment(1);
            doc.add(paragrafo);
            paragrafo = new Paragraph("   ");
            doc.add(paragrafo);
            PdfPTable table = new PdfPTable(8);

            PdfPCell cel1 = new PdfPCell(new Paragraph("Id"));
            PdfPCell cel2 = new PdfPCell(new Paragraph("Nome"));
            PdfPCell cel3 = new PdfPCell(new Paragraph("Cidade"));
            PdfPCell cel4 = new PdfPCell(new Paragraph("Endereço"));
            PdfPCell cel5 = new PdfPCell(new Paragraph("Bairro"));
            PdfPCell cel6 = new PdfPCell(new Paragraph("UF"));
            PdfPCell cel7 = new PdfPCell(new Paragraph("CEP"));
            PdfPCell cel8 = new PdfPCell(new Paragraph("Telefone"));

            table.addCell(cel1).setBackgroundColor(BaseColor.LIGHT_GRAY);
            table.addCell(cel2).setBackgroundColor(BaseColor.LIGHT_GRAY);
            table.addCell(cel3).setBackgroundColor(BaseColor.LIGHT_GRAY);
            table.addCell(cel4).setBackgroundColor(BaseColor.LIGHT_GRAY);
            table.addCell(cel5).setBackgroundColor(BaseColor.LIGHT_GRAY);
            table.addCell(cel6).setBackgroundColor(BaseColor.LIGHT_GRAY);
            table.addCell(cel7).setBackgroundColor(BaseColor.LIGHT_GRAY);
            table.addCell(cel8).setBackgroundColor(BaseColor.LIGHT_GRAY);

            for (ModelClientes cliente : listaClientes) {
                cel1 = new PdfPCell(new Paragraph(String.valueOf(cliente.getIdCliente())));
                cel2 = new PdfPCell(new Paragraph(cliente.getCliNome()));
                cel3 = new PdfPCell(new Paragraph(String.valueOf(cliente.getCliCidade())));
                cel4 = new PdfPCell(new Paragraph(String.valueOf(cliente.getCliEndereco())));
                cel5 = new PdfPCell(new Paragraph(String.valueOf(cliente.getCliBairro())));
                cel6 = new PdfPCell(new Paragraph(String.valueOf(cliente.getCliUf())));
                cel7 = new PdfPCell(new Paragraph(String.valueOf(cliente.getCliCep())));
                cel8 = new PdfPCell(new Paragraph(String.valueOf(cliente.getCliTelefone())));

                table.addCell(cel1);
                table.addCell(cel2);
                table.addCell(cel3);
                table.addCell(cel4);
                table.addCell(cel5);
                table.addCell(cel6);
                table.addCell(cel7);
                table.addCell(cel8);
            }

            doc.add(table);
            doc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void gerarPdfPagamento() {
        controllerPagamentos = new ControllerPagamentos();
        Document doc = new Document();

        ArrayList<ModelPagamentos> listaPagamentos = controllerPagamentos.retornarListaPagamentoController();

        try {
            dataAtual = bLDatas.converterDataParaDateUS(new java.util.Date(System.currentTimeMillis()));
            PdfWriter.getInstance(doc, new FileOutputStream("C:\\Users\\Usuario\\Desktop\\Backup Valdineis Moreira\\Usuario\\Downloads\\relatorio-pagamento-" + dataAtual + ".pdf"));
            doc.open();

            Paragraph paragrafo = new Paragraph(String.valueOf(dataAtual));
            paragrafo.setAlignment(1);
            doc.add(paragrafo);

            paragrafo = new Paragraph("Relatório PDF - Pagamentos");
            paragrafo.setAlignment(1);
            doc.add(paragrafo);
            paragrafo = new Paragraph("   ");
            doc.add(paragrafo);

            PdfPTable table = new PdfPTable(5);

            PdfPCell cel1 = new PdfPCell(new Paragraph("Id"));
            PdfPCell cel2 = new PdfPCell(new Paragraph("Data"));
            PdfPCell cel3 = new PdfPCell(new Paragraph("Empresa"));
            PdfPCell cel4 = new PdfPCell(new Paragraph("Método"));
            PdfPCell cel5 = new PdfPCell(new Paragraph("Valor"));

            table.addCell(cel1).setBackgroundColor(BaseColor.LIGHT_GRAY);;
            table.addCell(cel2).setBackgroundColor(BaseColor.LIGHT_GRAY);;
            table.addCell(cel3).setBackgroundColor(BaseColor.LIGHT_GRAY);;
            table.addCell(cel4).setBackgroundColor(BaseColor.LIGHT_GRAY);;
            table.addCell(cel5).setBackgroundColor(BaseColor.LIGHT_GRAY);;

            for (ModelPagamentos pagamentos : listaPagamentos) {
                cel1 = new PdfPCell(new Paragraph(String.valueOf(pagamentos.getPagId())));
                cel2 = new PdfPCell(new Paragraph(String.valueOf(pagamentos.getPagData())));
                cel3 = new PdfPCell(new Paragraph(String.valueOf(pagamentos.getPagEmpresa())));
                cel4 = new PdfPCell(new Paragraph(String.valueOf(pagamentos.getPagMetodo())));
                cel5 = new PdfPCell(new Paragraph(String.valueOf(pagamentos.getPagValor())));

                table.addCell(cel1);
                table.addCell(cel2);
                table.addCell(cel3);
                table.addCell(cel4);
                table.addCell(cel5);
            }

            doc.add(table);
            doc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void gerarPdfRecebimento() {
        controllerRecebimentos = new ControllerRecebimentos();
        Document doc = new Document();

        ArrayList<ModelRecebimentos> listaRecebimentos = controllerRecebimentos.retornarListaRecebimentosController();

        try {
            dataAtual = bLDatas.converterDataParaDateUS(new java.util.Date(System.currentTimeMillis()));
            PdfWriter.getInstance(doc, new FileOutputStream("C:\\Users\\Usuario\\Desktop\\Backup Valdineis Moreira\\Usuario\\Downloads\\relatorio-recebimento-" + dataAtual + ".pdf"));
            doc.open();

            Paragraph paragrafo = new Paragraph(String.valueOf(dataAtual));
            paragrafo.setAlignment(1);
            doc.add(paragrafo);

            paragrafo = new Paragraph("Relatório PDF - Recebimentos");
            paragrafo.setAlignment(1);
            doc.add(paragrafo);
            paragrafo = new Paragraph("   ");
            doc.add(paragrafo);

            PdfPTable table = new PdfPTable(6);

            PdfPCell cel1 = new PdfPCell(new Paragraph("Id"));
            PdfPCell cel2 = new PdfPCell(new Paragraph("Código da Venda"));
            PdfPCell cel3 = new PdfPCell(new Paragraph("Cliente"));
            PdfPCell cel4 = new PdfPCell(new Paragraph("Data"));
            PdfPCell cel5 = new PdfPCell(new Paragraph("Método"));
            PdfPCell cel6 = new PdfPCell(new Paragraph("Valor"));

            table.addCell(cel1).setBackgroundColor(BaseColor.LIGHT_GRAY);;
            table.addCell(cel2).setBackgroundColor(BaseColor.LIGHT_GRAY);;
            table.addCell(cel3).setBackgroundColor(BaseColor.LIGHT_GRAY);;
            table.addCell(cel4).setBackgroundColor(BaseColor.LIGHT_GRAY);;
            table.addCell(cel5).setBackgroundColor(BaseColor.LIGHT_GRAY);;
            table.addCell(cel6).setBackgroundColor(BaseColor.LIGHT_GRAY);;

            for (ModelRecebimentos recebimentos : listaRecebimentos) {
                cel1 = new PdfPCell(new Paragraph(String.valueOf(recebimentos.getRecId())));
                cel2 = new PdfPCell(new Paragraph(String.valueOf(recebimentos.getRecVenda())));
                cel3 = new PdfPCell(new Paragraph(String.valueOf(controllerClientes.retornarClienteController(recebimentos.getRecCliente()).getCliNome())));
                cel4 = new PdfPCell(new Paragraph(String.valueOf(recebimentos.getRecData())));
                cel5 = new PdfPCell(new Paragraph(String.valueOf(recebimentos.getRecMetodo())));
                cel6 = new PdfPCell(new Paragraph(String.valueOf(recebimentos.getRecValor())));

                table.addCell(cel1);
                table.addCell(cel2);
                table.addCell(cel3);
                table.addCell(cel4);
                table.addCell(cel5);
                table.addCell(cel6);
            }

            doc.add(table);
            doc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
