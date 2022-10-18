/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Metodos.Metodo_VendasClientes;
import Modelos.Modelo_VendasCliente;
import java.util.ArrayList;

/**
 *
 * @author Faculdade
 */
public class Controlador_VendasCliente {

    private Metodo_VendasClientes metodoVendasClientes = new Metodo_VendasClientes();
    
    public ArrayList<Modelo_VendasCliente> getListaVendasCliente() {
        return  this.metodoVendasClientes.getListaVendasClientes();
    }
    
}
