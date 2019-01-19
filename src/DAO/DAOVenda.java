package DAO;

import model.ModelVenda;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Wendel Segadilha
*/
public class DAOVenda extends ConexaoMySql {

    /**
    * grava Venda
    * @param pModelVenda
    * return int
    */
    public int salvarVendaDAO(ModelVenda pModelVenda){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_venda ("
                    + "fk_cliente,"
                    + "ven_data,"
                    + "ven_valor_liquido,"
                    + "ven_valor_bruto,"
                    + "ven_desconto"
                + ") VALUES ("
                    + "'" + pModelVenda.getCliente() + "',"
                    + "'" + pModelVenda.getVenData() + "',"
                    + "'" + pModelVenda.getVenValorLiquido() + "',"
                    + "'" + pModelVenda.getVenValorBruto() + "',"
                    + "'" + pModelVenda.getVenDesconto() + "'"
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
    * recupera Venda
    * @param pIdVenda
    * return ModelVenda
    */
    public ModelVenda getVendaDAO(int pIdVenda){
        ModelVenda modelVenda = new ModelVenda();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_venda,"
                    + "fk_cliente,"
                    + "ven_data,"
                    + "ven_valor_liquido,"
                    + "ven_valor_bruto,"
                    + "ven_desconto"
                 + " FROM"
                     + " tbl_venda"
                 + " WHERE"
                     + " pk_id_venda = '" + pIdVenda + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVenda.setIdVenda(this.getResultSet().getInt(1));
                modelVenda.setCliente(this.getResultSet().getInt(2));
                modelVenda.setVenData(this.getResultSet().getDate(3));
                modelVenda.setVenValorLiquido(this.getResultSet().getDouble(4));
                modelVenda.setVenValorBruto(this.getResultSet().getDouble(5));
                modelVenda.setVenDesconto(this.getResultSet().getDouble(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelVenda;
    }

    /**
    * recupera uma lista de Venda
        * return ArrayList
    */
    public ArrayList<ModelVenda> getListaVendaDAO(){
        ArrayList<ModelVenda> listamodelVenda = new ArrayList();
        ModelVenda modelVenda = new ModelVenda();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_venda,"
                    + "fk_cliente,"
                    + "ven_data,"
                    + "ven_valor_liquido,"
                    + "ven_valor_bruto,"
                    + "ven_desconto"
                 + " FROM"
                     + " tbl_venda"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVenda = new ModelVenda();
                modelVenda.setIdVenda(this.getResultSet().getInt(1));
                modelVenda.setCliente(this.getResultSet().getInt(2));
                modelVenda.setVenData(this.getResultSet().getDate(3));
                modelVenda.setVenValorLiquido(this.getResultSet().getDouble(4));
                modelVenda.setVenValorBruto(this.getResultSet().getDouble(5));
                modelVenda.setVenDesconto(this.getResultSet().getDouble(6));
                listamodelVenda.add(modelVenda);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelVenda;
    }

    /**
    * atualiza Venda
    * @param pModelVenda
    * return boolean
    */
    public boolean atualizarVendaDAO(ModelVenda pModelVenda){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_venda SET "
                    + "pk_id_venda = '" + pModelVenda.getIdVenda() + "',"
                    + "fk_cliente = '" + pModelVenda.getCliente() + "',"
                    + "ven_data = '" + pModelVenda.getVenData() + "',"
                    + "ven_valor_liquido = '" + pModelVenda.getVenValorLiquido() + "',"
                    + "ven_valor_bruto = '" + pModelVenda.getVenValorBruto() + "',"
                    + "ven_desconto = '" + pModelVenda.getVenDesconto() + "'"
                + " WHERE "
                    + "pk_id_venda = '" + pModelVenda.getIdVenda() + "'"
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
    * exclui Venda
    * @param pIdVenda
    * return boolean
    */
    public boolean excluirVendaDAO(int pIdVenda){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_venda "
                + " WHERE "
                    + "pk_id_venda = '" + pIdVenda + "'"
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