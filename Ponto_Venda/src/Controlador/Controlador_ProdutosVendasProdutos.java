/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Metodos.Metodo_ProdutosVendasProdutos;
import Modelos.Modelo_ProdutosVendasProdutos;
import java.util.ArrayList;

/**
 *
 * @author Faculdade
 */
public class Controlador_ProdutosVendasProdutos {
    private Metodo_ProdutosVendasProdutos metodoProdutosVendasProdutos = new Metodo_ProdutosVendasProdutos();
    
    public ArrayList<Modelo_ProdutosVendasProdutos> getListaProdutosVendasProdutosControlador(int codigoVenda){
        return this.metodoProdutosVendasProdutos.getListaProdutosVendasProdutos(codigoVenda);
    }
}
