package Modelos;

import java.util.Date;

/**
*
* @author MarcosBeck
*/
public class Modelo_Vendas {

    private int idVendas;
    private int codCliente;
    private Date vendaDataVenda;
    private double vendaValorLiquido;
    private double vendaValorBruto;
    private double vendaDesconto;

    /**
    * Construtor
    */
    public Modelo_Vendas(){}

    /**
    * seta o valor de idVendas
    * @param pIdVendas
    */
    public void setIdVendas(int pIdVendas){
        this.idVendas = pIdVendas;
    }
    /**
    * @return pk_idVendas
    */
    public int getIdVendas(){
        return this.idVendas;
    }

    /**
    * seta o valor de codCliente
    * @param pCodCliente
    */
    public void setCodCliente(int pCodCliente){
        this.codCliente = pCodCliente;
    }
    /**
    * @return fk_codCliente
    */
    public int getCodCliente(){
        return this.codCliente;
    }

    /**
    * seta o valor de vendaDataVenda
    * @param pVendaDataVenda
    */
    public void setVendaDataVenda(Date pVendaDataVenda){
        this.vendaDataVenda = pVendaDataVenda;
    }
    /**
    * @return vendaDataVenda
    */
    public Date getVendaDataVenda(){
        return this.vendaDataVenda;
    }

    /**
    * seta o valor de vendaValorLiquido
    * @param pVendaValorLiquido
    */
    public void setVendaValorLiquido(double pVendaValorLiquido){
        this.vendaValorLiquido = pVendaValorLiquido;
    }
    /**
    * @return vendaValorLiquido
    */
    public double getVendaValorLiquido(){
        return this.vendaValorLiquido;
    }

    /**
    * seta o valor de vendaValorBruto
    * @param pVendaValorBruto
    */
    public void setVendaValorBruto(double pVendaValorBruto){
        this.vendaValorBruto = pVendaValorBruto;
    }
    /**
    * @return vendaValorBruto
    */
    public double getVendaValorBruto(){
        return this.vendaValorBruto;
    }

    /**
    * seta o valor de vendaDesconto
    * @param pVendaDesconto
    */
    public void setVendaDesconto(double pVendaDesconto){
        this.vendaDesconto = pVendaDesconto;
    }
    /**
    * @return vendaDesconto
    */
    public double getVendaDesconto(){
        return this.vendaDesconto;
    }

    @Override
    public String toString(){
        return "ModelVendas {" + "::idVendas = " + this.idVendas + "::codCliente = " + this.codCliente + "::vendaDataVenda = " + this.vendaDataVenda + "::vendaValorLiquido = " + this.vendaValorLiquido + "::vendaValorBruto = " + this.vendaValorBruto + "::vendaDesconto = " + this.vendaDesconto +  "}";
    }
}