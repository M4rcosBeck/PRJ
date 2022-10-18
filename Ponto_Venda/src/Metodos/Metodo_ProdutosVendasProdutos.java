/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

import Conexoes.Conexao;
import Modelos.Modelo_ProdutosVendasProdutos;
import Modelos.Modelo_VendasProdutos;
import java.util.ArrayList;
import ponto_venda.Modelo_Produto;

/**
 *
 * @author Faculdade
 */
public class Metodo_ProdutosVendasProdutos extends Conexao {

    public ArrayList<Modelo_ProdutosVendasProdutos> getListaProdutosVendasProdutos(int codigoVenda) {
        ArrayList<Modelo_ProdutosVendasProdutos> listaProdutosVendasProdutos = new ArrayList<>();
        Modelo_ProdutosVendasProdutos modeloProdutosVendasProdutos = new Modelo_ProdutosVendasProdutos();
        Modelo_Produto modeloProdutos = new Modelo_Produto();
        Modelo_VendasProdutos modeloVendasProdutos = new Modelo_VendasProdutos();
        try {
            this.conectar();
            this.executarSQL("SELECT tb_produtos.id_produto, "
                    + "tb_produtos.estoque_produto, "
                    + "tb_produtos.nome_produto, "
                    + "tb_produtos.valor_produto, "
                    + "tb_venda_produtos.fk_produto, "
                    + "tb_venda_produtos.fk_id_venda, "
                    + "tb_venda_produtos.id_venda_produto, "
                    + "tb_venda_produtos.ven_produto_quant, "
                    + "tb_venda_produtos.ven_produto_valor "
                    + "FROM tb_venda_produtos "
                    + "INNER JOIN tb_produtos ON tb_produtos.id_produto = tb_venda_produtos.fk_produto "
                    + "WHERE tb_venda_produtos.fk_id_venda = '"+codigoVenda+"';"
            );
            while(this.getResultSet().next()){
                modeloProdutosVendasProdutos = new Modelo_ProdutosVendasProdutos();
                modeloProdutos = new Modelo_Produto();
                modeloVendasProdutos = new Modelo_VendasProdutos();
                
                modeloProdutos.setId(this.getResultSet().getInt(1));
                modeloProdutos.setEstoque(this.getResultSet().getInt(2));
                modeloProdutos.setNome(this.getResultSet().getString(3));
                modeloProdutos.setPreco(this.getResultSet().getDouble(4));
                
                modeloVendasProdutos.setProduto(this.getResultSet().getInt(5));
                modeloVendasProdutos.setVenda(this.getResultSet().getInt(6));
                modeloVendasProdutos.setIdVendaProduto(this.getResultSet().getInt(7));
                modeloVendasProdutos.setVendaProQuant(this.getResultSet().getInt(8));
                modeloVendasProdutos.setVendaProValor(this.getResultSet().getInt(9));
                
                modeloProdutosVendasProdutos.setModeloProdutos(modeloProdutos);
                modeloProdutosVendasProdutos.setModeloVendasProdutos(modeloVendasProdutos);
                
                listaProdutosVendasProdutos.add(modeloProdutosVendasProdutos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listaProdutosVendasProdutos;
    }
}
