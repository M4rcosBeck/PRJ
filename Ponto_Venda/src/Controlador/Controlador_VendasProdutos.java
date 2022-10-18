package Controlador;

import Modelos.Modelo_VendasProdutos;
import Metodos.Metodo_VendasProdutos;
import java.util.ArrayList;

/**
*
* @author MarcosBeck
*/
public class Controlador_VendasProdutos {

    private Metodo_VendasProdutos metodoVendasProdutos = new Metodo_VendasProdutos();

    /**
    * grava VendasProdutos
    * @param pModelVendasProdutos
    * @return int
    */
    public int salvarVendasProdutosController(Modelo_VendasProdutos pModelVendasProdutos){
        return this.metodoVendasProdutos.salvarVendasProdutosDAO(pModelVendasProdutos);
    }

    /**
    * recupera VendasProdutos
    * @param pIdVendaProduto
    * @return Modelo_VendaProdutos
    */
    public Modelo_VendasProdutos getVendasProdutosController(int pIdVendaProduto){
        return this.metodoVendasProdutos.getVendasProdutosDAO(pIdVendaProduto);
    }

    /**
    * recupera uma lista deVendasProdutos
    * @param pIdVendaProduto
    * @return ArrayList
    */
    public ArrayList<Modelo_VendasProdutos> getListaVendasProdutosController(){
        return this.metodoVendasProdutos.getListaVendasProdutosDAO();
    }

    /**
    * atualiza VendasProdutos
    * @param pModelVendasProdutos
    * @return boolean
    */
    public boolean atualizarVendasProdutosController(Modelo_VendasProdutos pModelVendasProdutos){
        return this.metodoVendasProdutos.atualizarVendasProdutosDAO(pModelVendasProdutos);
    }

    /**
    * exclui VendasProdutos
    * @param pIdVendaProduto
    * @return boolean
    */
    public boolean excluirVendasProdutosController(int pIdVendaProduto){
        return this.metodoVendasProdutos.excluirVendasProdutosDAO(pIdVendaProduto);
    }

    /**
     * SALVA UMA LISTA DE PRODUTOS DA VENDA
     * @param listaModeloVendasProdutos
     * @return 
     */
    public boolean salvarVendasProdutosController(ArrayList<Modelo_VendasProdutos> listaModeloVendasProdutos) {
        return this.metodoVendasProdutos.salvarVendasProdutosDAO(listaModeloVendasProdutos);
    }
}