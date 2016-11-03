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
public class Horista {
private double PrecoHora;
private double HorasTrabalhadas;

    public Horista(double PrecoHora, double HorasTrabalhadas) {
        this.PrecoHora = PrecoHora;
        this.HorasTrabalhadas = HorasTrabalhadas;
    }

    public double getPrecoHora() {
        return PrecoHora;
    }

    public void setPrecoHora(double PrecoHora) {
        this.PrecoHora = PrecoHora;
    }

    public double getHorasTrabalhadas() {
        return HorasTrabalhadas;
    }

    public void setHorasTrabalhadas(double HorasTrabalhadas) {
        this.HorasTrabalhadas = HorasTrabalhadas;
    }
}
