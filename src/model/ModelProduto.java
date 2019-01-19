/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Wendel
 */
public class ModelProduto {
    
    private int idProduto;
    private String proNome;
    private Double proValor;
    private int proEstoque;

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getProNome() {
        return proNome;
    }

    public void setProNome(String proNome) {
        this.proNome = proNome;
    }

    public Double getProValor() {
        return proValor;
    }

    public void setProValor(Double proValor) {
        this.proValor = proValor;
    }

    public int getProEstoque() {
        return proEstoque;
    }

    public void setProEstoque(int proEstoque) {
        this.proEstoque = proEstoque;
    }

    @Override
    public String toString() {
        return "ModelProduto{" + "idProduto=" + idProduto + ", proNome=" + proNome + ", proValor=" + proValor + ", proEstoque=" + proEstoque + '}';
    }
    
    
    
    
    
}
