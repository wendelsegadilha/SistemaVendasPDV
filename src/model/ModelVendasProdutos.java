package model;
/**
*
* @author Wendel Segadilha
*/
public class ModelVendasProdutos {

    private int idVendaProduto;
    private int produto;
    private int venda;
    private double venProValor;
    private int venProQuantidade;
    private String nomeProduto;

    /**
    * Construtor
    */
    public ModelVendasProdutos(){}

    /**
    * seta o valor de idVendaProduto
    * @param pIdVendaProduto
    */
    public void setIdVendaProduto(int pIdVendaProduto){
        this.idVendaProduto = pIdVendaProduto;
    }
    /**
    * return pk_idVendaProduto
    */
    public int getIdVendaProduto(){
        return this.idVendaProduto;
    }

    /**
    * seta o valor de produto
    * @param pProduto
    */
    public void setProduto(int pProduto){
        this.produto = pProduto;
    }
    /**
    * return fk_produto
    */
    public int getProduto(){
        return this.produto;
    }

    /**
    * seta o valor de venda
    * @param pVenda
    */
    public void setVenda(int pVenda){
        this.venda = pVenda;
    }
    /**
    * return fk_venda
    */
    public int getVenda(){
        return this.venda;
    }

    /**
    * seta o valor de venProValor
    * @param pVenProValor
    */
    public void setVenProValor(double pVenProValor){
        this.venProValor = pVenProValor;
    }
    /**
    * return venProValor
    */
    public double getVenProValor(){
        return this.venProValor;
    }

    /**
    * seta o valor de venProQuantidade
    * @param pVenProQuantidade
    */
    public void setVenProQuantidade(int pVenProQuantidade){
        this.venProQuantidade = pVenProQuantidade;
    }
    /**
    * return venProQuantidade
    */
    public int getVenProQuantidade(){
        return this.venProQuantidade;
    }

    @Override
    public String toString(){
        return "ModelVendasProdutos {" + "::idVendaProduto = " + this.idVendaProduto + "::produto = " + this.produto + "::venda = " + this.venda + "::venProValor = " + this.venProValor + "::venProQuantidade = " + this.venProQuantidade +  "}";
    }

    /**
     * @return the nomeProduto
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * @param nomeProduto the nomeProduto to set
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
}