package Controlador;

import Modelos.Modelo_Vendas;
import Metodos.Metodo_Vendas;
import java.util.ArrayList;

/**
*
* @author MarcosBeck
*/
public class Controlador_Vendas {

    private Metodo_Vendas metodoVendas = new Metodo_Vendas();

    /**
    * grava Vendas
    * @param pModelVendas
    * @return int
    */
    public int salvarVendasController(Modelo_Vendas pModelVendas){
        return this.metodoVendas.salvarVendasDAO(pModelVendas);
    }

    /**
    * recupera Vendas
    * @param pIdVendas
    * @return Modelo_Vendas
    */
    public Modelo_Vendas getVendasController(int pIdVendas){
        return this.metodoVendas.getVendasDAO(pIdVendas);
    }

    /**
    * recupera uma lista deVendas
    * @param pIdVendas
    * @return ArrayList
    */
    public ArrayList<Modelo_Vendas> getListaVendasController(){
        return this.metodoVendas.getListaVendasDAO();
    }

    /**
    * atualiza Vendas
    * @param pModelVendas
    * @return boolean
    */
    public boolean atualizarVendasController(Modelo_Vendas pModelVendas){
        return this.metodoVendas.atualizarVendasDAO(pModelVendas);
    }

    /**
    * exclui Vendas
    * @param pIdVendas
    * @return boolean
    */
    public boolean excluirVendasController(int pIdVendas){
        return this.metodoVendas.excluirVendasDAO(pIdVendas);
    }
}