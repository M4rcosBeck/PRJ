/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import java.util.ArrayList;
import Metodos.Metodo_Produtos;
import ponto_venda.Modelo_Produto;

/**
 *
 * @author Faculdade
 */
public class Controlador_Produto {
    private Metodo_Produtos metodo_produto = new Metodo_Produtos();
    
    /**
     * CONTROLADOR PARA SALVAR O PRODUTO
     * @param modelo_produtos
     * @return int
     */
    public int salvarProdutoControlador(Modelo_Produto modelo_produtos){
        return this.metodo_produto.salvarProdutos(modelo_produtos);
    }
    
    /**
     * CONTROLADOR PARA EXCLUIR O PRODUTO
     * @param id_produto
     * @return boolean
     */
    public boolean excluirProdutoControlador(int id_produto){
        return this.metodo_produto.excluirProduto(id_produto);
    }
    
    /**
     * CONTROLADOR PARA ALTERAR O PRODUTO
     * @param modelo_produto
     * @return 
     */
    public boolean alterarProdutoControlador(Modelo_Produto modelo_produto){
        return this.metodo_produto.alterarProduto(modelo_produto);
    }
    
    /**
     * CONTROLADOR PARA RETORNAR O PRODUTO
     * @param codigo
     * @return modelo_produto
     */
    public Modelo_Produto retornarProdutoControlador(int codigo){
        return this.metodo_produto.retorarProduto(codigo);
    }
    
    /**
     * CONTROLADOR PARA RETORNAR O PRODUTO
     * @param codigoCod
     * @return modelo_produto
     */
    public Modelo_Produto retornarProdutoCodControlador(int codigoCod){
        return this.metodo_produto.retorarProdutoCod(codigoCod);
    }
    
    /**
     * CONTROLADOR PARA RETORNAR A LISTA DE PRODUTOS
     * @return lista Modelo_Produto
     */
    public ArrayList<Modelo_Produto> retornarListaProdutoControlador(){
        return this.metodo_produto.retornaListaProdutos();
    }

    /**
     * ALTERA A LISTA DE PRODUTOS NO BANCO
     * @param listaModeloProduto
     * @return 
     */
    public boolean alterarEstoqueProdutoControlador(ArrayList<Modelo_Produto> listaModeloProduto) {
        return this.metodo_produto.alterarEstoqueProdutoControlador(listaModeloProduto);
    }
   
}
