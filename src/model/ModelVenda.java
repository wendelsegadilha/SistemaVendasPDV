package model;

import java.util.Date;

/**
*
* @author Wendel Segadilha
*/
public class ModelVenda {

    private int idVenda;
    private int cliente;
    private Date venData;
    private double venValorLiquido;
    private double venValorBruto;
    private double venDesconto;

    /**
    * Construtor
    */
    public ModelVenda(){}

    /**
    * seta o valor de idVenda
    * @param pIdVenda
    */
    public void setIdVenda(int pIdVenda){
        this.idVenda = pIdVenda;
    }
    /**
    * return pk_idVenda
    */
    public int getIdVenda(){
        return this.idVenda;
    }

    /**
    * seta o valor de cliente
    * @param pCliente
    */
    public void setCliente(int pCliente){
        this.cliente = pCliente;
    }
    /**
    * return fk_cliente
    */
    public int getCliente(){
        return this.cliente;
    }

    /**
    * seta o valor de venData
    * @param pVenData
    */
    public void setVenData(Date pVenData){
        this.venData = pVenData;
    }
    /**
    * return venData
    */
    public Date getVenData(){
        return this.venData;
    }

    /**
    * seta o valor de venValorLiquido
    * @param pVenValorLiquido
    */
    public void setVenValorLiquido(double pVenValorLiquido){
        this.venValorLiquido = pVenValorLiquido;
    }
    /**
    * return venValorLiquido
    */
    public double getVenValorLiquido(){
        return this.venValorLiquido;
    }

    /**
    * seta o valor de venValorBruto
    * @param pVenValorBruto
    */
    public void setVenValorBruto(double pVenValorBruto){
        this.venValorBruto = pVenValorBruto;
    }
    /**
    * return venValorBruto
    */
    public double getVenValorBruto(){
        return this.venValorBruto;
    }

    /**
    * seta o valor de venDesconto
    * @param pVenDesconto
    */
    public void setVenDesconto(double pVenDesconto){
        this.venDesconto = pVenDesconto;
    }
    /**
    * return venDesconto
    */
    public double getVenDesconto(){
        return this.venDesconto;
    }

    @Override
    public String toString(){
        return "ModelVenda {" + "::idVenda = " + this.idVenda + "::cliente = " + this.cliente + "::venData = " + this.venData + "::venValorLiquido = " + this.venValorLiquido + "::venValorBruto = " + this.venValorBruto + "::venDesconto = " + this.venDesconto +  "}";
    }
}