/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Wendel
 */
public class ModelVendaCliente {
    
    private ModelVenda modelVenda;
    private ModelCliente modelCliente;
    private ArrayList<ModelVendaCliente> listaModelVendaClientes;

    public ModelVenda getModelVenda() {
        return modelVenda;
    }

    public void setModelVenda(ModelVenda modelVenda) {
        this.modelVenda = modelVenda;
    }

    public ModelCliente getModelCliente() {
        return modelCliente;
    }

    public void setModelCliente(ModelCliente modelCliente) {
        this.modelCliente = modelCliente;
    }

    public ArrayList<ModelVendaCliente> getListaModelVendaClientes() {
        return listaModelVendaClientes;
    }

    public void setListaModelVendaClientes(ArrayList<ModelVendaCliente> listaModelVendaClientes) {
        this.listaModelVendaClientes = listaModelVendaClientes;
    }
    
    
    
}
