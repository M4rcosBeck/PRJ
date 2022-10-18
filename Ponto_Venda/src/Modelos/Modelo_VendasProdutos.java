package Modelos;
/**
*
* @author MarcosBeck
*/
public class Modelo_VendasProdutos {

    private int idVendaProduto;
    private int produto;
    private int venda;
    private double vendaProValor;
    private double vendaProQuant;

    /**
    * Construtor
    */
    public Modelo_VendasProdutos(){}

    /**
    * seta o valor de idVendaProduto
    * @param pIdVendaProduto
    */
    public void setIdVendaProduto(int pIdVendaProduto){
        this.idVendaProduto = pIdVendaProduto;
    }
    /**
    * @return pk_idVendaProduto
    */
    public int getIdVendaProduto(){
        return this.idVendaProduto;
    }

    /**
    * seta o valor de produto
    * @param pProduto
    */
    public void setProduto(int pProduto){
        this.produto = pProduto;
    }
    /**
    * @return fk_produto
    */
    public int getProduto(){
        return this.produto;
    }

    /**
    * seta o valor de venda
    * @param pVenda
    */
    public void setVenda(int pVenda){
        this.venda = pVenda;
    }
    /**
    * @return fk_venda
    */
    public int getVenda(){
        return this.venda;
    }

    /**
    * seta o valor de vendaProValor
    * @param pVendaProValor
    */
    public void setVendaProValor(double pVendaProValor){
        this.vendaProValor = pVendaProValor;
    }
    /**
    * @return vendaProValor
    */
    public double getVendaProValor(){
        return this.vendaProValor;
    }

    /**
    * seta o valor de vendaProQuant
    * @param pVendaProQuant
    */
    public void setVendaProQuant(double pVendaProQuant){
        this.vendaProQuant = pVendaProQuant;
    }
    /**
    * @return vendaProQuant
    */
    public double getVendaProQuant(){
        return this.vendaProQuant;
    }

    @Override
    public String toString(){
        return "ModelVendasProdutos {" + "::idVendaProduto = " + this.idVendaProduto + "::produto = " + this.produto + "::venda = " + this.venda + "::vendaProValor = " + this.vendaProValor + "::vendaProQuant = " + this.vendaProQuant +  "}";
    }
}