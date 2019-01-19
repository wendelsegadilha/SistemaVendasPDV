/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelProduto;

/**
 *
 * @author Wendel
 */
public class DaoProduto extends ConexaoMySql {

    /**
     * Cadastra um produto no banco
     *
     * @param pModelProduto
     * @return int
     */
    public int salvarProdutoDao(ModelProduto pModelProduto) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tbl_produto (pro_nome, pro_valor, pro_estoque) VALUES ("
                    + "'" + pModelProduto.getProNome() + "',"
                    + "'" + pModelProduto.getProValor() + "',"
                    + "'" + pModelProduto.getProEstoque() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }

    }

    /**
     * Exclui um produto do banco
     *
     * @param pIdProduto
     * @return booleaan
     */
    public boolean excluirProdutoDao(int pIdProduto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL("DELETE FROM tbl_produto WHERE pk_id_produto = '" + pIdProduto + "'");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * Altera um produto no banco
     *
     * @param pModelProduto
     * @return boolean
     */
    public boolean alterarProdutoDao(ModelProduto pModelProduto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL("UPDATE tbl_produto SET "
                    + "pro_nome = '" + pModelProduto.getProNome() + "',"
                    + "pro_valor = '" + pModelProduto.getProValor() + "',"
                    + "pro_estoque = '" + pModelProduto.getProEstoque() + "'"
                    + " WHERE pk_id_produto = '" + pModelProduto.getIdProduto() + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * Retorna um produto pelo código
     *
     * @param pIdProduto
     * @return ModelProduto
     */
    public ModelProduto retornarProdutoDao(int pIdProduto) {
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tbl_produto WHERE pk_id_produto = '" + pIdProduto + "'");

            while (this.getResultSet().next()) {
                modelProduto.setIdProduto(this.getResultSet().getInt(1));
                modelProduto.setProNome(this.getResultSet().getString(2));
                modelProduto.setProValor(this.getResultSet().getDouble(3));
                modelProduto.setProEstoque(this.getResultSet().getInt(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelProduto;
    }
    
    /**
     * Retorna um produto pelo código
     *
     * @param pNome
     * @return ModelProduto
     */
    public ModelProduto retornarProdutoDao(String pNome) {
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tbl_produto WHERE pro_nome = '" + pNome + "'");

            while (this.getResultSet().next()) {
                modelProduto.setIdProduto(this.getResultSet().getInt(1));
                modelProduto.setProNome(this.getResultSet().getString(2));
                modelProduto.setProValor(this.getResultSet().getDouble(3));
                modelProduto.setProEstoque(this.getResultSet().getInt(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelProduto;
    }

    /**
     * Retorna uma lista completa de produtos
     *
     * @return listaModelProdutos
     */
    public ArrayList<ModelProduto> retornarListaProdutosDao() {
        ArrayList<ModelProduto> listaModelProdutos = new ArrayList<>();
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL("SELECT * FROM tbl_produto");

            while (this.getResultSet().next()) {
                modelProduto = new ModelProduto();
                modelProduto.setIdProduto(this.getResultSet().getInt(1));
                modelProduto.setProNome(this.getResultSet().getString(2));
                modelProduto.setProValor(this.getResultSet().getDouble(3));
                modelProduto.setProEstoque(this.getResultSet().getInt(4));

                listaModelProdutos.add(modelProduto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelProdutos;
    }

    public boolean alterarEstoqueProdutoDAO(ArrayList<ModelProduto> pListaModelProdutos) {
        try {
            this.conectar();
            for (int i = 0; i < pListaModelProdutos.size(); i++) {
                this.executarUpdateDeleteSQL("UPDATE tbl_produto SET "
                        + "pro_estoque = '" + pListaModelProdutos.get(i).getProEstoque() + "'"
                        + " WHERE pk_id_produto = '" + pListaModelProdutos.get(i).getIdProduto() + "'"
                ); 
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

}
