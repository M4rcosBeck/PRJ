package Controlador;

import Modelos.Modelo_FormaPagamento;
import Metodos.Metodo_FormaPagamento;
import java.util.ArrayList;

/**
*
* @author MarcosBeck
*/
public class Controlador_FormaPagamento {

    private Metodo_FormaPagamento metodosFormaPagamento = new Metodo_FormaPagamento();

    /**
    * grava FormaPagamento
    * @param pModelFormaPagamento
    * @return int
    */
    public int salvarFormaPagamentoController(Modelo_FormaPagamento pModelFormaPagamento){
        return this.metodosFormaPagamento.salvarFormaPagamentoDAO(pModelFormaPagamento);
    }

    /**
    * recupera FormaPagamento
    * @param pIdForPag
    * @return Modelo_FormaPagamento
    */
    public Modelo_FormaPagamento getFormaPagamentoController(int pIdForPag){
        return this.metodosFormaPagamento.getFormaPagamentoDAO(pIdForPag);
    }

    /**
    * recupera uma lista deFormaPagamento
    * @param pIdForPag
    * @return ArrayList
    */
    public ArrayList<Modelo_FormaPagamento> getListaFormaPagamentoController(){
        return this.metodosFormaPagamento.getListaFormaPagamentoDAO();
    }

    /**
    * atualiza FormaPagamento
    * @param pModelFormaPagamento
    * @return boolean
    */
    public boolean atualizarFormaPagamentoController(Modelo_FormaPagamento pModelFormaPagamento){
        return this.metodosFormaPagamento.atualizarFormaPagamentoDAO(pModelFormaPagamento);
    }

    /**
    * exclui FormaPagamento
    * @param pIdForPag
    * @return boolean
    */
    public boolean excluirFormaPagamentoController(int pIdForPag){
        return this.metodosFormaPagamento.excluirFormaPagamentoDAO(pIdForPag);
    }
}