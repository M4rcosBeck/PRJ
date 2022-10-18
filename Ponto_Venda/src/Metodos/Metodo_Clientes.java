package Metodos;

import Modelos.Modelo_Cliente;
import Conexoes.Conexao;
import java.util.ArrayList;
/**
*
* @author MarcosBeck
*/
public class Metodo_Clientes extends Conexao {

    /**
    * grava Cliente
    * @param pModelCliente
    * @return int
    */
    public int salvarClienteDAO(Modelo_Cliente pModelCliente){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tb_clientes ("
                    + "nome_cliente,"
                    + "endereco_cliente,"
                    + "numero_cliente,"
                    + "complemento_cliente,"
                    + "bairro_cliente,"
                    + "cidade_cliente,"
                    + "estado_cliente,"
                    + "cep_cliente,"
                    + "telefone_cliente,"
                    + "email_cliente"
                + ") VALUES ("
                    + "'" + pModelCliente.getNomeCliente() + "',"
                    + "'" + pModelCliente.getEnderecoCliente() + "',"
                    + "'" + pModelCliente.getNumeroCliente() + "',"
                    + "'" + pModelCliente.getCompCliente() + "',"
                    + "'" + pModelCliente.getBairroCliente() + "',"
                    + "'" + pModelCliente.getCidadeCliente() + "',"
                    + "'" + pModelCliente.getEstadoCliente() + "',"
                    + "'" + pModelCliente.getCepCliente() + "',"
                    + "'" + pModelCliente.getTelCliente() + "',"
                    + "'" + pModelCliente.getEmailCliente() + "'"
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
    * recupera Cliente
    * @param pIdCliente
    * @return Modelo_Cliente
    */
    public Modelo_Cliente getClienteDAO(int pIdCliente){
        Modelo_Cliente modelCliente = new Modelo_Cliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_cliente,"
                    + "nome_cliente,"
                    + "endereco_cliente,"
                    + "numero_cliente,"
                    + "complemento_cliente,"
                    + "bairro_cliente,"
                    + "cidade_cliente,"
                    + "estado_cliente,"
                    + "cep_cliente,"
                    + "telefone_cliente,"
                    + "email_cliente"
                 + " FROM"
                     + " tb_clientes"
                 + " WHERE"
                     + " id_cliente = '" + pIdCliente + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente.setIdCliente(this.getResultSet().getInt(1));
                modelCliente.setNomeCliente(this.getResultSet().getString(2));
                modelCliente.setEnderecoCliente(this.getResultSet().getString(3));
                modelCliente.setNumeroCliente(this.getResultSet().getInt(4));
                modelCliente.setCompCliente(this.getResultSet().getString(5));
                modelCliente.setBairroCliente(this.getResultSet().getString(6));
                modelCliente.setCidadeCliente(this.getResultSet().getString(7));
                modelCliente.setEstadoCliente(this.getResultSet().getString(8));
                modelCliente.setCepCliente(this.getResultSet().getString(9));
                modelCliente.setTelCliente(this.getResultSet().getString(10));
                modelCliente.setEmailCliente(this.getResultSet().getString(11));
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCliente;
    }
    
    /**
    * recupera Cliente
    * @param pNomeCliente
    * @return Modelo_Cliente
    */
    public Modelo_Cliente getClienteDAO(String pNomeCliente){
        Modelo_Cliente modelCliente = new Modelo_Cliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_cliente,"
                    + "nome_cliente,"
                    + "endereco_cliente,"
                    + "numero_cliente,"
                    + "complemento_cliente,"
                    + "bairro_cliente,"
                    + "cidade_cliente,"
                    + "estado_cliente,"
                    + "cep_cliente,"
                    + "telefone_cliente,"
                    + "email_cliente"
                 + " FROM"
                     + " tb_clientes"
                 + " WHERE"
                     + " nome_cliente = '" + pNomeCliente + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente.setIdCliente(this.getResultSet().getInt(1));
                modelCliente.setNomeCliente(this.getResultSet().getString(2));
                modelCliente.setEnderecoCliente(this.getResultSet().getString(3));
                modelCliente.setNumeroCliente(this.getResultSet().getInt(4));
                modelCliente.setCompCliente(this.getResultSet().getString(5));
                modelCliente.setBairroCliente(this.getResultSet().getString(6));
                modelCliente.setCidadeCliente(this.getResultSet().getString(7));
                modelCliente.setEstadoCliente(this.getResultSet().getString(8));
                modelCliente.setCepCliente(this.getResultSet().getString(9));
                modelCliente.setTelCliente(this.getResultSet().getString(10));
                modelCliente.setEmailCliente(this.getResultSet().getString(11));  
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCliente;
    }

    /**
    * recupera uma lista de Cliente
        * @return ArrayList
    */
    public ArrayList<Modelo_Cliente> getListaClienteDAO(){
        ArrayList<Modelo_Cliente> listamodelCliente = new ArrayList();
        Modelo_Cliente modelCliente = new Modelo_Cliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_cliente,"
                    + "nome_cliente,"
                    + "endereco_cliente,"
                    + "numero_cliente,"
                    + "complemento_cliente,"
                    + "bairro_cliente,"
                    + "cidade_cliente,"
                    + "estado_cliente,"
                    + "cep_cliente,"
                    + "telefone_cliente,"
                    + "email_cliente"
                    
                 + " FROM"
                     + " tb_clientes"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente = new Modelo_Cliente();
                modelCliente.setIdCliente(this.getResultSet().getInt(1));
                modelCliente.setNomeCliente(this.getResultSet().getString(2));
                modelCliente.setEnderecoCliente(this.getResultSet().getString(3));
                modelCliente.setNumeroCliente(this.getResultSet().getInt(4));
                modelCliente.setCompCliente(this.getResultSet().getString(5));
                modelCliente.setBairroCliente(this.getResultSet().getString(6));
                modelCliente.setCidadeCliente(this.getResultSet().getString(7));
                modelCliente.setEstadoCliente(this.getResultSet().getString(8));
                modelCliente.setCepCliente(this.getResultSet().getString(9));
                modelCliente.setTelCliente(this.getResultSet().getString(10));
                modelCliente.setEmailCliente(this.getResultSet().getString(11));
                listamodelCliente.add(modelCliente);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelCliente;
    }

    /**
    * atualiza Cliente
    * @param pModelCliente
    * @return boolean
    */
    public boolean atualizarClienteDAO(Modelo_Cliente pModelCliente){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tb_clientes SET "
                    + "id_cliente = '" + pModelCliente.getIdCliente() + "',"
                    + "nome_cliente = '" + pModelCliente.getNomeCliente() + "',"
                    + "endereco_cliente = '" + pModelCliente.getEnderecoCliente() + "',"
                    + "numero_cliente = '" + pModelCliente.getNumeroCliente() + "',"
                    + "complemento_cliente = '" + pModelCliente.getCompCliente() + "',"
                    + "bairro_cliente = '" + pModelCliente.getBairroCliente() + "',"
                    + "cidade_cliente = '" + pModelCliente.getCidadeCliente() + "',"
                    + "estado_cliente = '" + pModelCliente.getEstadoCliente() + "',"
                    + "cep_cliente = '" + pModelCliente.getCepCliente() + "',"
                    + "telefone_cliente = '" + pModelCliente.getTelCliente() + "',"
                    + "email_cliente = '" + pModelCliente.getEmailCliente() + "'"
                    
                + " WHERE "
                    + "id_cliente = '" + pModelCliente.getIdCliente() + "'"
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
    * exclui Cliente
    * @param pIdCliente
    * @return boolean
    */
    public boolean excluirClienteDAO(int pIdCliente){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tb_clientes "
                + " WHERE "
                    + "id_cliente = '" + pIdCliente + "'"
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