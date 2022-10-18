/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.ArrayList;

/**
 *
 * @author Faculdade
 */
public class Modelo_VendasCliente {
    private Modelo_Vendas modeloVendas;
    private Modelo_Cliente modeloClientes;
    private ArrayList<Modelo_VendasCliente> listaModeloVendasClientes;

    /**
     * @return the modeloVendas
     */
    public Modelo_Vendas getModeloVendas() {
        return modeloVendas;
    }

    /**
     * @param modeloVendas the modeloVendas to set
     */
    public void setModeloVendas(Modelo_Vendas modeloVendas) {
        this.modeloVendas = modeloVendas;
    }

    /**
     * @return the modeloClientes
     */
    public Modelo_Cliente getModeloClientes() {
        return modeloClientes;
    }

    /**
     * @param modeloClientes the modeloClientes to set
     */
    public void setModeloClientes(Modelo_Cliente modeloClientes) {
        this.modeloClientes = modeloClientes;
    }

    /**
     * @return the listaModeloVendasClientes
     */
    public ArrayList<Modelo_VendasCliente> getListaModeloVendasClientes() {
        return listaModeloVendasClientes;
    }

    /**
     * @param listaModeloVendasClientes the listaModeloVendasClientes to set
     */
    public void setListaModeloVendasClientes(ArrayList<Modelo_VendasCliente> listaModeloVendasClientes) {
        this.listaModeloVendasClientes = listaModeloVendasClientes;
    }
}
