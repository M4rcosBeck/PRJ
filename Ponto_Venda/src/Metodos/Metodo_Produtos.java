package Metodos;

import ponto_venda.Modelo_Produto;
import Conexoes.Conexao;
import java.util.ArrayList;

/**
 *
 * @author Faculdade
 */
public class Metodo_Produtos extends Conexao {

    /**
     * SALVA OS PRODUTOS NO BANCO DE DADOS
     *
     * @param modelo_produto
     * @return
     */
    public int salvarProdutos(Modelo_Produto modelo_produto) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tb_produtos (cod_produto, nome_produto, valor_produto, estoque_produto) VALUES ("
                    + "'" + modelo_produto.getCodigo() + "',"
                    + "'" + modelo_produto.getNome() + "',"
                    + "'" + modelo_produto.getPreco() + "',"
                    + "'" + modelo_produto.getEstoque() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * EXCLUIR UM PRODUTO DO BANCO DE DADOS
     *
     * @param id_produto
     * @return boolean
     */
    public boolean excluirProduto(int id_produto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL("DELETE FROM tb_produtos WHERE id_produto = '" + id_produto + "';");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * ALTERA O PRODUTO NO BANCO DE DADOS
     *
     * @param modelo_produto
     * @return boolean
     */
    public boolean alterarProduto(Modelo_Produto modelo_produto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL("UPDATE tb_produtos SET "
                    + "cod_produto = '" + modelo_produto.getCodigo() + "',"
                    + "nome_produto = '" + modelo_produto.getNome() + "',"
                    + "valor_produto = '" + modelo_produto.getPreco() + "',"
                    + "estoque_produto = '" + modelo_produto.getEstoque() + "'"
                    + " WHERE id_produto = '" + modelo_produto.getId() + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * RETORNA UM PRODUTO PELO ID
     *
     * @param id_produto
     * @return modelo_produto
     */
    public Modelo_Produto retorarProduto(int id_produto) {
        Modelo_Produto modelo_produto = new Modelo_Produto();
        try {
            this.conectar();
            this.executarSQL("SELECT id_produto, cod_produto, nome_produto, valor_produto, estoque_produto "
                    + "FROM tb_produtos WHERE id_produto = '" + id_produto + "';"
            );

            while (this.getResultSet().next()) {
                modelo_produto.setId(this.getResultSet().getInt(1));
                modelo_produto.setCodigo(this.getResultSet().getInt(2));
                modelo_produto.setNome(this.getResultSet().getString(3));
                modelo_produto.setPreco(this.getResultSet().getDouble(4));
                modelo_produto.setEstoque(this.getResultSet().getInt(5));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelo_produto;
    }

    /**
     * RETORNA UM PRODUTO PELO ID
     *
     * @param cod_produto
     * @return modelo_produto
     */
    public Modelo_Produto retorarProdutoCod(int cod_produto) {
        Modelo_Produto modelo_produto = new Modelo_Produto();
        try {
            this.conectar();
            this.executarSQL("SELECT id_produto, cod_produto, nome_produto, valor_produto, estoque_produto "
                    + "FROM tb_produtos WHERE cod_produto = '" + cod_produto + "';"
            );

            while (this.getResultSet().next()) {
                modelo_produto.setId(this.getResultSet().getInt(1));
                modelo_produto.setCodigo(this.getResultSet().getInt(2));
                modelo_produto.setNome(this.getResultSet().getString(3));
                modelo_produto.setPreco(this.getResultSet().getDouble(4));
                modelo_produto.setEstoque(this.getResultSet().getInt(5));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelo_produto;
    }

    /**
     * RETORNA UMA LISTA DE TODOS OS PRODUTOS
     *
     * @return listaModeloProduto
     */
    public ArrayList<Modelo_Produto> retornaListaProdutos() {
        ArrayList<Modelo_Produto> listaModeloProduto = new ArrayList<>();
        Modelo_Produto modelo_produto = new Modelo_Produto();

        try {
            this.conectar();
            this.executarSQL("SELECT id_produto, cod_produto, nome_produto, valor_produto, estoque_produto FROM tb_produtos;");

            while (this.getResultSet().next()) {
                //Zera o modelo para evitar dar erro.
                modelo_produto = new Modelo_Produto();

                modelo_produto.setId(this.getResultSet().getInt(1));
                modelo_produto.setCodigo(this.getResultSet().getInt(2));
                modelo_produto.setNome(this.getResultSet().getString(3));
                modelo_produto.setPreco(this.getResultSet().getDouble(4));
                modelo_produto.setEstoque(this.getResultSet().getInt(5));

                listaModeloProduto.add(modelo_produto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModeloProduto;
    }

    /**
     * ALTERAR O ESTOQUE DE PRODUTOS NO BANCO
     * @param listaModeloProduto
     * @return 
     */
    public boolean alterarEstoqueProdutoControlador(ArrayList<Modelo_Produto> listaModeloProduto) {
        try {
            this.conectar();
            for (int i = 0; i < listaModeloProduto.size(); i++) {
                this.executarUpdateDeleteSQL("UPDATE tb_produtos SET "
                        + "estoque_produto = '" + listaModeloProduto.get(i).getEstoque() + "'"
                        + " WHERE id_produto = '" + listaModeloProduto.get(i).getId() + "'"
                );
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
