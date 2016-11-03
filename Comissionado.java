/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package empresa;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Comissionado {

    private double TotalVenda;
    private double TaxaComissao;

    public Comissionado(double TotalVenda, double TaxaComissao) {
        this.TotalVenda = TotalVenda;
        this.TaxaComissao = TaxaComissao;
    }

    public double getTotalVenda() {
        return TotalVenda;
    }

    public void setTotalVenda(double TotalVenda) {
        this.TotalVenda = TotalVenda;
    }

    public double getTaxaComissao() {
        return TaxaComissao;
    }

    public void setTaxaComissao(double TaxaComissao) {
        this.TaxaComissao = TaxaComissao;
    }
}
