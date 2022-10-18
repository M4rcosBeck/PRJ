/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidade;

import Controlador.Controlador_VendasCliente;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

/**
 *
 * @author Faculdade
 */
public class Classe_iText {
    
    public static void main(String[] args){
    //public static void imprimirRelatorio(Controlador_VendasCliente listaModelo){
        
        
        //criação do documento
        Document document = new Document();
        try{
            //cria uma instancia do documento e da o nome ao arquivo pdf gerado
            PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\mp-be\\Desktop\\Relatorio.pdf"));
            
            //abre o documento gerado para edição
            document.open();
            
            //seta o tamanho da página do pdf
            document.setPageSize(PageSize.A4);
            
            //adicionando um parágrafo no documento
            document.add(new Paragraph("Relatório gerado no PDF"));
            document.add(new Paragraph("Relatório gerado no PDF"));
            document.add(new Paragraph("Relatório gerado no PDF"));
            document.add(new Paragraph("Relatório gerado no PDF"));
            document.add(new Paragraph("Relatório gerado no PDF"));
            
        
        }catch(DocumentException de){
            System.err.println(de.getMessage());
        }catch(IOException ioe){
            System.err.println(ioe.getMessage());
        }finally{
            document.close();
        }
        
        
    }
}
