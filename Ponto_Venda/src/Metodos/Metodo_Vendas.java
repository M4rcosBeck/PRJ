package Metodos;

import Modelos.Modelo_Vendas;
import Conexoes.Conexao;
import java.util.ArrayList;
/**
*
* @author MarcosBeck
*/
public class Metodo_Vendas extends Conexao {

    /**
    * grava Vendas
    * @param pModelVendas
    * @return int
    */
    public int salvarVendasDAO(Modelo_Vendas pModelVendas){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tb_vendas ("
                    + "fk_cod_cliente,"
                    + "ven_data_venda,"
                    + "ven_valor_liquido,"
                    + "ven_valor_bruto,"
                    + "ven_desconto"
                + ") VALUES ("
                    + "'" + pModelVendas.getCodCliente() + "',"
                    + "'" + pModelVendas.getVendaDataVenda() + "',"
                    + "'" + pModelVendas.getVendaValorLiquido() + "',"
                    + "'" + pModelVendas.getVendaValorBruto() + "',"
                    + "'" + pModelVendas.getVendaDesconto() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera Vendas
    * @param pIdVendas
    * @return Modelo_Vendas
    */
    public Modelo_Vendas getVendasDAO(int pIdVendas){
        Modelo_Vendas modelVendas = new Modelo_Vendas();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_vendas,"
                    + "fk_cod_cliente,"
                    + "ven_data_venda,"
                    + "ven_valor_liquido,"
                    + "ven_valor_bruto,"
                    + "ven_desconto"
                 + " FROM"
                     + " tb_vendas"
                 + " WHERE"
                     + " id_vendas = '" + pIdVendas + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendas.setIdVendas(this.getResultSet().getInt(1));
                modelVendas.setCodCliente(this.getResultSet().getInt(2));
                modelVendas.setVendaDataVenda(this.getResultSet().getDate(3));
                modelVendas.setVendaValorLiquido(this.getResultSet().getDouble(4));
                modelVendas.setVendaValorBruto(this.getResultSet().getDouble(5));
                modelVendas.setVendaDesconto(this.getResultSet().getDouble(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelVendas;
    }

    /**
    * recupera uma lista de Vendas
        * @return ArrayList
    */
    public ArrayList<Modelo_Vendas> getListaVendasDAO(){
        ArrayList<Modelo_Vendas> listamodelVendas = new ArrayList();
        Modelo_Vendas modelVendas = new Modelo_Vendas();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_vendas,"
                    + "fk_cod_cliente,"
                    + "ven_data_venda,"
                    + "ven_valor_liquido,"
                    + "ven_valor_bruto,"
                    + "ven_desconto"
                 + " FROM"
                     + " tb_vendas"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendas = new Modelo_Vendas();
                modelVendas.setIdVendas(this.getResultSet().getInt(1));
                modelVendas.setCodCliente(this.getResultSet().getInt(2));
                modelVendas.setVendaDataVenda(this.getResultSet().getDate(3));
                modelVendas.setVendaValorLiquido(this.getResultSet().getDouble(4));
                modelVendas.setVendaValorBruto(this.getResultSet().getDouble(5));
                modelVendas.setVendaDesconto(this.getResultSet().getDouble(6));
                listamodelVendas.add(modelVendas);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelVendas;
    }

    /**
    * atualiza Vendas
    * @param pModelVendas
    * @return boolean
    */
    public boolean atualizarVendasDAO(Modelo_Vendas pModelVendas){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tb_vendas SET "
                    + "id_vendas = '" + pModelVendas.getIdVendas() + "',"
                    + "fk_cod_cliente = '" + pModelVendas.getCodCliente() + "',"
                    + "ven_data_venda = '" + pModelVendas.getVendaDataVenda() + "',"
                    + "ven_valor_liquido = '" + pModelVendas.getVendaValorLiquido() + "',"
                    + "ven_valor_bruto = '" + pModelVendas.getVendaValorBruto() + "',"
                    + "ven_desconto = '" + pModelVendas.getVendaDesconto() + "'"
                + " WHERE "
                    + "id_vendas = '" + pModelVendas.getIdVendas() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui Vendas
    * @param pIdVendas
    * @return boolean
    */
    public boolean excluirVendasDAO(int pIdVendas){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tb_vendas "
                + " WHERE "
                    + "id_vendas = '" + pIdVendas + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}