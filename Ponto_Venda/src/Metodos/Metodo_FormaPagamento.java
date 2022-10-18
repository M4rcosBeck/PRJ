package Metodos;

import Modelos.Modelo_FormaPagamento;
import Conexoes.Conexao;
import java.util.ArrayList;
/**
*
* @author MarcosBeck
*/
public class Metodo_FormaPagamento extends Conexao {

    /**
    * grava FormaPagamento
    * @param pModelFormaPagamento
    * @return int
    */
    public int salvarFormaPagamentoDAO(Modelo_FormaPagamento pModelFormaPagamento){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tb_forma_pagamento ("
                    + "id_forma_pagamento,"
                    + "descricao_for_pag,"
                    + "desconto_for_pag,"
                    + "parcelas_for_pag,"
                    + "situacao_for_pag"
                + ") VALUES ("
                    + "'" + pModelFormaPagamento.getIdForPag() + "',"
                    + "'" + pModelFormaPagamento.getDescricaoForPag() + "',"
                    + "'" + pModelFormaPagamento.getDescontoForPag() + "',"
                    + "'" + pModelFormaPagamento.getParcelasForPag() + "',"
                    + "'" + pModelFormaPagamento.getSituacaoForPag() + "'"
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
    * recupera FormaPagamento
    * @param pIdForPag
    * @return Modelo_FormaPagamento
    */
    public Modelo_FormaPagamento getFormaPagamentoDAO(int pIdForPag){
        Modelo_FormaPagamento modelFormaPagamento = new Modelo_FormaPagamento();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_forma_pagamento,"
                    + "descricao_for_pag,"
                    + "desconto_for_pag,"
                    + "parcelas_for_pag,"
                    + "situacao_for_pag"
                 + " FROM"
                     + " tb_forma_pagamento"
                 + " WHERE"
                     + " id_forma_pagamento = '" + pIdForPag + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFormaPagamento.setIdForPag(this.getResultSet().getInt(1));
                modelFormaPagamento.setDescricaoForPag(this.getResultSet().getString(2));
                modelFormaPagamento.setDescontoForPag(this.getResultSet().getFloat(3));
                modelFormaPagamento.setParcelasForPag(this.getResultSet().getInt(4));
                modelFormaPagamento.setSituacaoForPag(this.getResultSet().getInt(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelFormaPagamento;
    }

    /**
    * recupera uma lista de FormaPagamento
        * @return ArrayList
    */
    public ArrayList<Modelo_FormaPagamento> getListaFormaPagamentoDAO(){
        ArrayList<Modelo_FormaPagamento> listamodelFormaPagamento = new ArrayList();
        Modelo_FormaPagamento modelFormaPagamento = new Modelo_FormaPagamento();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_forma_pagamento,"
                    + "descricao_for_pag,"
                    + "desconto_for_pag,"
                    + "parcelas_for_pag,"
                    + "situacao_for_pag"
                 + " FROM"
                     + " tb_forma_pagamento"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFormaPagamento = new Modelo_FormaPagamento();
                modelFormaPagamento.setIdForPag(this.getResultSet().getInt(1));
                modelFormaPagamento.setDescricaoForPag(this.getResultSet().getString(2));
                modelFormaPagamento.setDescontoForPag(this.getResultSet().getFloat(3));
                modelFormaPagamento.setParcelasForPag(this.getResultSet().getInt(4));
                modelFormaPagamento.setSituacaoForPag(this.getResultSet().getInt(5));
                listamodelFormaPagamento.add(modelFormaPagamento);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelFormaPagamento;
    }

    /**
    * atualiza FormaPagamento
    * @param pModelFormaPagamento
    * @return boolean
    */
    public boolean atualizarFormaPagamentoDAO(Modelo_FormaPagamento pModelFormaPagamento){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tb_forma_pagamento SET "
                    + "id_forma_pagamento = '" + pModelFormaPagamento.getIdForPag() + "',"
                    + "descricao_for_pag = '" + pModelFormaPagamento.getDescricaoForPag() + "',"
                    + "desconto_for_pag = '" + pModelFormaPagamento.getDescontoForPag() + "',"
                    + "parcelas_for_pag = '" + pModelFormaPagamento.getParcelasForPag() + "',"
                    + "situacao_for_pag = '" + pModelFormaPagamento.getSituacaoForPag() + "'"
                + " WHERE "
                    + "id_forma_pagamento = '" + pModelFormaPagamento.getIdForPag() + "'"
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
    * exclui FormaPagamento
    * @param pIdForPag
    * @return boolean
    */
    public boolean excluirFormaPagamentoDAO(int pIdForPag){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tb_forma_pagamento "
                + " WHERE "
                    + "id_forma_pagamento = '" + pIdForPag + "'"
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