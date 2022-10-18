/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

import Conexoes.Conexao;
import Modelos.Modelo_Cliente;
import Modelos.Modelo_Vendas;
import Modelos.Modelo_VendasCliente;
import java.util.ArrayList;

/**
 *
 * @author Faculdade
 */
public class Metodo_VendasClientes extends Conexao {
    public ArrayList<Modelo_VendasCliente> getListaVendasClientes(){
        ArrayList<Modelo_VendasCliente> listaModelVendasCliente = new ArrayList();
            
        Modelo_Vendas modelVendas = new Modelo_Vendas();
        Modelo_Cliente modelCliente = new Modelo_Cliente();
        Modelo_VendasCliente modeloVendasCliente = new Modelo_VendasCliente();
        
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "tb_vendas.id_vendas,"
                    + "tb_vendas.fk_cod_cliente,"
                    + "tb_vendas.ven_data_venda,"
                    + "tb_vendas.ven_valor_liquido,"
                    + "tb_vendas.ven_valor_bruto,"
                    + "tb_vendas.ven_desconto,"
                    + "tb_clientes.id_cliente,"
                    + "tb_clientes.nome_cliente,"
                    + "tb_clientes.endereco_cliente,"
                    + "tb_clientes.numero_cliente,"
                    + "tb_clientes.complemento_cliente,"
                    + "tb_clientes.bairro_cliente,"
                    + "tb_clientes.cidade_cliente,"
                    + "tb_clientes.estado_cliente,"
                    + "tb_clientes.cep_cliente,"
                    + "tb_clientes.telefone_cliente,"
                    + "tb_clientes.email_cliente"
                 + " FROM "
                     + " tb_vendas INNER JOIN tb_clientes "
                        + "ON tb_clientes.id_cliente = tb_vendas.fk_cod_cliente;"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendas = new Modelo_Vendas();
                modelCliente = new Modelo_Cliente();
                modeloVendasCliente = new Modelo_VendasCliente();
                
                modelVendas.setIdVendas(this.getResultSet().getInt(1));
                modelVendas.setCodCliente(this.getResultSet().getInt(2));
                modelVendas.setVendaDataVenda(this.getResultSet().getDate(3));
                modelVendas.setVendaValorLiquido(this.getResultSet().getDouble(4));
                modelVendas.setVendaValorBruto(this.getResultSet().getDouble(5));
                modelVendas.setVendaDesconto(this.getResultSet().getDouble(6));
                
                modelCliente.setIdCliente(this.getResultSet().getInt(7));
                modelCliente.setNomeCliente(this.getResultSet().getString(8));
                modelCliente.setEnderecoCliente(this.getResultSet().getString(9));
                modelCliente.setNumeroCliente(this.getResultSet().getInt(10));
                modelCliente.setCompCliente(this.getResultSet().getString(11));
                modelCliente.setBairroCliente(this.getResultSet().getString(12));
                modelCliente.setCidadeCliente(this.getResultSet().getString(13));
                modelCliente.setEstadoCliente(this.getResultSet().getString(14));
                modelCliente.setCepCliente(this.getResultSet().getString(15));
                modelCliente.setTelCliente(this.getResultSet().getString(16));
                modelCliente.setEmailCliente(this.getResultSet().getString(17));
                
                modeloVendasCliente.setModeloVendas(modelVendas);
                modeloVendasCliente.setModeloClientes(modelCliente);
                
                listaModelVendasCliente.add(modeloVendasCliente);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listaModelVendasCliente;
    }
}
