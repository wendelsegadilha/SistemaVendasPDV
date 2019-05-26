/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DaoProduto;
import java.util.ArrayList;
import model.ModelProduto;

/**
 *
 * @author Wendel
 */
public class ControllerProduto {
    
    private DaoProduto daoProduto = new DaoProduto();
    
    /**
     * salvar produtos controller
     * @param pModelProduto
     * @return int
     */
    public int salvarProdutoController(ModelProduto pModelProduto){
        return this.daoProduto.salvarProdutoDao(pModelProduto);
    }
    
    /**
     * exclui produto controller
     * @param pCodigo
     * @return boolean
     */
    public boolean excluirProdutoController(int pCodigo){
        return this.daoProduto.excluirProdutoDao(pCodigo);
    }
    
    /**
     * altera produto controller
     * @param pModelProduto
     * @return boolean
     */
    public boolean alteraProdutoController(ModelProduto pModelProduto){
        return this.daoProduto.alterarProdutoDao(pModelProduto);
    }
    
    /**
     * retorna um produto controller
     * @param pCodigo
     * @return ModelProduto
     */
    public ModelProduto retornarProdutoController(int pCodigo){
        return this.daoProduto.retornarProdutoDao(pCodigo);
    }
    
    /**
     * retorna um produto controller
     * @param pNome
     * @return ModelProduto
     */
    public ModelProduto retornarProdutoController(String pNome){
        return this.daoProduto.retornarProdutoDao(pNome);
    }
    
    /**
     * retorna lista de produtos
     * @return array list
     */
    public ArrayList<ModelProduto> retornarListaProdutoController(){
        return this.daoProduto.retornarListaProdutosDao();
    }
    
    /**
     * Altera lista de produtos no banco
     * @param listaModelProdutos
     * @return 
     */
    public boolean alterarEstoqueProdutoController(ArrayList<ModelProduto> pListaModelProdutos) {
        return this.daoProduto.alterarEstoqueProdutoDAO(pListaModelProdutos);
    }

    public boolean gerarRelatorioProdutos() {
       return this.daoProduto.gerarRelatorioProdutos();
    }
    
    
}
