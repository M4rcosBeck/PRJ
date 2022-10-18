package Metodos;

import Modelos.Modelo_VendasProdutos;
import Conexoes.Conexao;
import java.util.ArrayList;

/**
 *
 * @author MarcosBeck
 */
public class Metodo_VendasProdutos extends Conexao {

    /**
     * grava VendasProdutos
     *
     * @param pModelVendasProdutos
     * @return int
     */
    public int salvarVendasProdutosDAO(Modelo_VendasProdutos pModelVendasProdutos) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tb_venda_produtos ("
                    + "fk_produto,"
                    + "fk_venda,"
                    + "ven_pro_valor,"
                    + "ven_pro_quant"
                    + ") VALUES ("
                    + "'" + pModelVendasProdutos.getProduto() + "',"
                    + "'" + pModelVendasProdutos.getVenda() + "',"
                    + "'" + pModelVendasProdutos.getVendaProValor() + "',"
                    + "'" + pModelVendasProdutos.getVendaProQuant() + "'"
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
     * recupera VendasProdutos
     *
     * @param pIdVendaProduto
     * @return Modelo_VendaProdutos
     */
    public Modelo_VendasProdutos getVendasProdutosDAO(int pIdVendaProduto) {
        Modelo_VendasProdutos modelVendasProdutos = new Modelo_VendasProdutos();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "id_venda_produto,"
                    + "fk_produto,"
                    + "fk_venda,"
                    + "ven_pro_valor,"
                    + "ven_pro_quant"
                    + " FROM"
                    + " tb_venda_produtos"
                    + " WHERE"
                    + " id_venda_produto = '" + pIdVendaProduto + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelVendasProdutos.setIdVendaProduto(this.getResultSet().getInt(1));
                modelVendasProdutos.setProduto(this.getResultSet().getInt(2));
                modelVendasProdutos.setVenda(this.getResultSet().getInt(3));
                modelVendasProdutos.setVendaProValor(this.getResultSet().getDouble(4));
                modelVendasProdutos.setVendaProQuant(this.getResultSet().getDouble(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelVendasProdutos;
    }

    /**
     * recupera uma lista de VendasProdutos
     *
     * @return ArrayList
     */
    public ArrayList<Modelo_VendasProdutos> getListaVendasProdutosDAO() {
        ArrayList<Modelo_VendasProdutos> listamodelVendasProdutos = new ArrayList();
        Modelo_VendasProdutos modelVendasProdutos = new Modelo_VendasProdutos();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "id_venda_produto,"
                    + "fk_produto,"
                    + "fk_venda,"
                    + "ven_pro_valor,"
                    + "ven_pro_quant"
                    + " FROM"
                    + " tb_venda_produtos"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelVendasProdutos = new Modelo_VendasProdutos();
                modelVendasProdutos.setIdVendaProduto(this.getResultSet().getInt(1));
                modelVendasProdutos.setProduto(this.getResultSet().getInt(2));
                modelVendasProdutos.setVenda(this.getResultSet().getInt(3));
                modelVendasProdutos.setVendaProValor(this.getResultSet().getDouble(4));
                modelVendasProdutos.setVendaProQuant(this.getResultSet().getDouble(5));
                listamodelVendasProdutos.add(modelVendasProdutos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelVendasProdutos;
    }

    /**
     * atualiza VendasProdutos
     *
     * @param pModelVendasProdutos
     * @return boolean
     */
    public boolean atualizarVendasProdutosDAO(Modelo_VendasProdutos pModelVendasProdutos) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tb_venda_produtos SET "
                    + "id_venda_produto = '" + pModelVendasProdutos.getIdVendaProduto() + "',"
                    + "fk_produto = '" + pModelVendasProdutos.getProduto() + "',"
                    + "fk_venda = '" + pModelVendasProdutos.getVenda() + "',"
                    + "ven_pro_valor = '" + pModelVendasProdutos.getVendaProValor() + "',"
                    + "ven_pro_quant = '" + pModelVendasProdutos.getVendaProQuant() + "'"
                    + " WHERE "
                    + "id_venda_produto = '" + pModelVendasProdutos.getIdVendaProduto() + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * exclui VendasProdutos
     *
     * @param pIdVendaProduto
     * @return boolean
     */
    public boolean excluirVendasProdutosDAO(int pIdVendaProduto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tb_venda_produtos "
                    + " WHERE "
                    + "fk_id_venda = '" + pIdVendaProduto + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean salvarVendasProdutosDAO(ArrayList<Modelo_VendasProdutos> listaModeloVendasProdutos) {
        try {
            this.conectar();
            int cont = listaModeloVendasProdutos.size();

            for (int i = 0; i < cont; i++) {
                this.insertSQL(
                        "INSERT INTO tb_venda_produtos ("
                        + "fk_produto,"
                        + "fk_id_venda,"
                        + "ven_produto_valor,"
                        + "ven_produto_quant"
                        + ") VALUES ("
                        + "'" + listaModeloVendasProdutos.get(i).getProduto() + "',"
                        + "'" + listaModeloVendasProdutos.get(i).getVenda() + "',"        
                        + "'" + listaModeloVendasProdutos.get(i).getVendaProValor() + "',"
                        + "'" + listaModeloVendasProdutos.get(i).getVendaProQuant() + "'"
                        + ");"
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
