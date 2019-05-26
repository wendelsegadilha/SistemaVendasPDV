package DAO;

import model.ModelVenda;
import conexoes.ConexaoMySql;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Wendel Segadilha
 */
public class DAOVenda extends ConexaoMySql {

    /**
     * grava Venda
     *
     * @param pModelVenda return int
     */
    public int salvarVendaDAO(ModelVenda pModelVenda) {
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
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * recupera Venda
     *
     * @param pIdVenda return ModelVenda
     */
    public ModelVenda getVendaDAO(int pIdVenda) {
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

            while (this.getResultSet().next()) {
                modelVenda.setIdVenda(this.getResultSet().getInt(1));
                modelVenda.setCliente(this.getResultSet().getInt(2));
                modelVenda.setVenData(this.getResultSet().getDate(3));
                modelVenda.setVenValorLiquido(this.getResultSet().getDouble(4));
                modelVenda.setVenValorBruto(this.getResultSet().getDouble(5));
                modelVenda.setVenDesconto(this.getResultSet().getDouble(6));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelVenda;
    }

    /**
     * recupera uma lista de Venda return ArrayList
     */
    public ArrayList<ModelVenda> getListaVendaDAO() {
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

            while (this.getResultSet().next()) {
                modelVenda = new ModelVenda();
                modelVenda.setIdVenda(this.getResultSet().getInt(1));
                modelVenda.setCliente(this.getResultSet().getInt(2));
                modelVenda.setVenData(this.getResultSet().getDate(3));
                modelVenda.setVenValorLiquido(this.getResultSet().getDouble(4));
                modelVenda.setVenValorBruto(this.getResultSet().getDouble(5));
                modelVenda.setVenDesconto(this.getResultSet().getDouble(6));
                listamodelVenda.add(modelVenda);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelVenda;
    }

    /**
     * atualiza Venda
     *
     * @param pModelVenda return boolean
     */
    public boolean atualizarVendaDAO(ModelVenda pModelVenda) {
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
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * exclui Venda
     *
     * @param pIdVenda return boolean
     */
    public boolean excluirVendaDAO(int pIdVenda) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_venda "
                    + " WHERE "
                    + "pk_id_venda = '" + pIdVenda + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean gerarRelatorioVenda(int codigoVenda) {
        try {
            this.conectar();
            this.executarSQL("SELECT"
                    + "     tbl_cliente.pk_id_cliente AS tbl_cliente_pk_id_cliente,"
                    + "     tbl_cliente.cli_nome AS tbl_cliente_cli_nome,"
                    + "     tbl_cliente.cli_endereco AS tbl_cliente_cli_endereco,"
                    + "     tbl_cliente.cli_bairro AS tbl_cliente_cli_bairro,"
                    + "     tbl_cliente.cli_cidade AS tbl_cliente_cli_cidade,"
                    + "     tbl_cliente.cli_uf AS tbl_cliente_cli_uf,"
                    + "     tbl_cliente.cli_cep AS tbl_cliente_cli_cep,"
                    + "     tbl_cliente.cli_telefone AS tbl_cliente_cli_telefone,"
                    + "     tbl_venda.pk_id_venda AS tbl_venda_pk_id_venda,"
                    + "     tbl_venda.fk_cliente AS tbl_venda_fk_cliente,"
                    + "     tbl_venda.ven_data AS tbl_venda_ven_data,"
                    + "     tbl_venda.ven_valor_liquido AS tbl_venda_ven_valor_liquido,"
                    + "     tbl_venda.ven_valor_bruto AS tbl_venda_ven_valor_bruto,"
                    + "     tbl_venda.ven_desconto AS tbl_venda_ven_desconto,"
                    + "     tbl_vendas_produtos.pk_id_venda_produto AS tbl_vendas_produtos_pk_id_venda_produto,"
                    + "     tbl_vendas_produtos.fk_produto AS tbl_vendas_produtos_fk_produto,"
                    + "     tbl_vendas_produtos.fk_venda AS tbl_vendas_produtos_fk_venda,"
                    + "     tbl_vendas_produtos.ven_pro_valor AS tbl_vendas_produtos_ven_pro_valor,"
                    + "     tbl_vendas_produtos.ven_pro_quantidade AS tbl_vendas_produtos_ven_pro_quantidade,"
                    + "     tbl_produto.pk_id_produto AS tbl_produto_pk_id_produto,"
                    + "     tbl_produto.pro_nome AS tbl_produto_pro_nome,"
                    + "     tbl_produto.pro_valor AS tbl_produto_pro_valor,"
                    + "     tbl_produto.pro_estoque AS tbl_produto_pro_estoque "
                    + "FROM "
                    + "     tbl_cliente INNER JOIN tbl_venda tbl_venda ON tbl_cliente.pk_id_cliente = tbl_venda.fk_cliente"
                    + "     INNER JOIN tbl_vendas_produtos tbl_vendas_produtos ON tbl_venda.pk_id_venda = tbl_vendas_produtos.fk_venda"
                    + "     INNER JOIN tbl_produto tbl_produto ON tbl_vendas_produtos.fk_produto = tbl_produto.pk_id_produto WHERE tbl_venda.pk_id_venda = '" + codigoVenda + "';");

            JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
            JasperPrint jasperPrint = JasperFillManager.fillReport("reports/relatorioVenda.jasper", new HashMap<>(), jrRS);
            //Exibindo o relatŕorio através da class JasperViewer
            JasperViewer.viewReport(jasperPrint, false);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean gerarRelVendasPeriodo(Date data) {
        try {
            this.conectar();
            this.executarSQL("SELECT"
                    + "     tbl_cliente.pk_id_cliente AS tbl_cliente_pk_id_cliente,"
                    + "     tbl_cliente.cli_nome AS tbl_cliente_cli_nome,"
                    + "     tbl_cliente.cli_endereco AS tbl_cliente_cli_endereco,"
                    + "     tbl_cliente.cli_bairro AS tbl_cliente_cli_bairro,"
                    + "     tbl_cliente.cli_cidade AS tbl_cliente_cli_cidade,"
                    + "     tbl_cliente.cli_uf AS tbl_cliente_cli_uf,"
                    + "     tbl_cliente.cli_cep AS tbl_cliente_cli_cep,"
                    + "     tbl_cliente.cli_telefone AS tbl_cliente_cli_telefone,"
                    + "     tbl_venda.pk_id_venda AS tbl_venda_pk_id_venda,"
                    + "     tbl_venda.fk_cliente AS tbl_venda_fk_cliente,"
                    + "     tbl_venda.ven_data AS tbl_venda_ven_data,"
                    + "     tbl_venda.ven_valor_liquido AS tbl_venda_ven_valor_liquido,"
                    + "     tbl_venda.ven_valor_bruto AS tbl_venda_ven_valor_bruto,"
                    + "     tbl_venda.ven_desconto AS tbl_venda_ven_desconto "
                    + "FROM "
                    + "     tbl_cliente INNER JOIN tbl_venda tbl_venda ON tbl_cliente.pk_id_cliente = tbl_venda.fk_cliente WHERE tbl_venda.ven_data = '" + data + "';");

            JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
            JasperPrint jasperPrint = JasperFillManager.fillReport("reports/todasVenda.jasper", new HashMap<>(), jrRS);
            //Exibindo o relatŕorio através da class JasperViewer
            JasperViewer.viewReport(jasperPrint, false);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
