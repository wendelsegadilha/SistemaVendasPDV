package controller;

import model.ModelVenda;
import DAO.DAOVenda;
import java.util.ArrayList;
import java.util.Date;

/**
*
* @author Wendel Segadilha
*/
public class ControllerVenda {

   

    private DAOVenda daoVenda = new DAOVenda();

    /**
    * grava Venda
    * @param pModelVenda
    * return int
    */
    public int salvarVendaController(ModelVenda pModelVenda){
        return this.daoVenda.salvarVendaDAO(pModelVenda);
    }

    /**
    * recupera Venda
    * @param pIdVenda
    * return ModelVenda
    */
    public ModelVenda getVendaController(int pIdVenda){
        return this.daoVenda.getVendaDAO(pIdVenda);
    }

    /**
    * recupera uma lista deVenda
    * @param pIdVenda
    * return ArrayList
    */
    public ArrayList<ModelVenda> getListaVendaController(){
        return this.daoVenda.getListaVendaDAO();
    }

    /**
    * atualiza Venda
    * @param pModelVenda
    * return boolean
    */
    public boolean atualizarVendaController(ModelVenda pModelVenda){
        return this.daoVenda.atualizarVendaDAO(pModelVenda);
    }

    /**
    * exclui Venda
    * @param pIdVenda
    * return boolean
    */
    public boolean excluirVendaController(int pIdVenda){
        return this.daoVenda.excluirVendaDAO(pIdVenda);
    }

    public boolean gerarRelatorioVenda(int codigoVenda) {
        return this.daoVenda.gerarRelatorioVenda(codigoVenda);
    }
    
     public boolean gerarRelVendasPeriodo(Date data) {
        return this.daoVenda.gerarRelVendasPeriodo(data); 
    }
}