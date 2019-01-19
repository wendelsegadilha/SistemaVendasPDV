/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOVendaCliente;
import java.util.ArrayList;
import model.ModelVendaCliente;

/**
 *
 * @author Wendel
 */
public class ControllerVendaCliente {
    
    private DAOVendaCliente DAOVendaCliente = new DAOVendaCliente();

    public ArrayList<ModelVendaCliente> getListaVendaClienteController() {
       return this.DAOVendaCliente.getListaVendaClienteDAO();
    }
    
}
