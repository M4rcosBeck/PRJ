package Controlador;

import Modelos.Modelo_Cliente;
import Metodos.Metodo_Clientes;
import java.util.ArrayList;

/**
*
* @author MarcosBeck
*/
public class Controlador_Cliente {

    private Metodo_Clientes daoCliente = new Metodo_Clientes();

    /**
    * grava Cliente
    * @param pModelCliente
    * @return int
    */
    public int salvarClienteController(Modelo_Cliente pModelCliente){
        return this.daoCliente.salvarClienteDAO(pModelCliente);
    }

    /**
    * recupera Cliente
    * @param pIdCliente
    * @return Modelo_Cliente
    */
    public Modelo_Cliente getClienteController(int pIdCliente){
        return this.daoCliente.getClienteDAO(pIdCliente);
    }

    /**
    * recupera Cliente
    * @param pNomeCliente
    * @return Modelo_Cliente
    */
    public Modelo_Cliente getClienteController(String pNomeCliente){
        return this.daoCliente.getClienteDAO(pNomeCliente);
    }
    
    /**
    * recupera uma lista deCliente
    * @param pIdCliente
    * @return ArrayList
    */
    public ArrayList<Modelo_Cliente> getListaClienteController(){
        return this.daoCliente.getListaClienteDAO();
    }

    /**
    * atualiza Cliente
    * @param pModelCliente
    * @return boolean
    */
    public boolean atualizarClienteController(Modelo_Cliente pModelCliente){
        return this.daoCliente.atualizarClienteDAO(pModelCliente);
    }

    /**
    * exclui Cliente
    * @param pIdCliente
    * @return boolean
    */
    public boolean excluirClienteController(int pIdCliente){
        return this.daoCliente.excluirClienteDAO(pIdCliente);
    }
}