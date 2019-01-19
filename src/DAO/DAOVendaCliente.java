/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelCliente;
import model.ModelVenda;
import model.ModelVendaCliente;

/**
 *
 * @author Wendel
 */
public class DAOVendaCliente extends ConexaoMySql{
    
    /**
    * recupera uma lista de Venda
        * return ArrayList
    */
    public ArrayList<ModelVendaCliente> getListaVendaClienteDAO(){
        ArrayList<ModelVendaCliente> listaModelVendaCliente = new ArrayList();
        ModelVenda modelVenda = new ModelVenda();
        ModelCliente modelCliente = new ModelCliente();
        ModelVendaCliente modelVendaCliente = new ModelVendaCliente();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tbl_venda INNER JOIN tbl_cliente on tbl_cliente.pk_id_cliente = tbl_venda.fk_cliente;");

            while(this.getResultSet().next()){
                //Criando novos instâncias de objetos
                modelVenda = new ModelVenda();
                modelCliente = new ModelCliente();
                modelVendaCliente = new ModelVendaCliente();
                
                // Recuperando dados da venda
                modelVenda.setIdVenda(this.getResultSet().getInt(1));
                modelVenda.setCliente(this.getResultSet().getInt(2));
                modelVenda.setVenData(this.getResultSet().getDate(3));
                modelVenda.setVenValorLiquido(this.getResultSet().getDouble(4));
                modelVenda.setVenValorBruto(this.getResultSet().getDouble(5));
                modelVenda.setVenDesconto(this.getResultSet().getDouble(6));
                
                //Recuperando os dados do cliente
                modelCliente.setIdCliente(this.getResultSet().getInt(7));
                modelCliente.setCliNome(this.getResultSet().getString(8));
                modelCliente.setCliEndereco(this.getResultSet().getString(9));
                modelCliente.setCliBairro(this.getResultSet().getString(10));
                modelCliente.setCliCidade(this.getResultSet().getString(11));
                modelCliente.setCliUf(this.getResultSet().getString(12));
                modelCliente.setCliCep(this.getResultSet().getString(13));
                modelCliente.setCliTelefone(this.getResultSet().getString(14));
                
                //Definindo atributos aos modelos
                modelVendaCliente.setModelVenda(modelVenda);
                modelVendaCliente.setModelCliente(modelCliente);
                
                listaModelVendaCliente.add(modelVendaCliente);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listaModelVendaCliente;
    }
}
