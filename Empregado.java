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
public class Empregado {
    private int CodEmpregado;
    private String Nome;
    private String Sobrenome;
    private String Cpf;
    private String Tipo;
    
    public Empregado(int CodEmpregado,String Nome, String Sobrenome, String Cpf, String Tipo) {
        this.CodEmpregado = CodEmpregado;
        this.Nome = Nome;
        this.Sobrenome = Sobrenome;
        this.Cpf = Cpf;
        this.Tipo = Tipo;
        
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    public String getNome() {
        return Nome;
    }

    public int getCodEmpregado() {
        return CodEmpregado;
    }

    public void setCodEmpregado(int CodEmpregado) {
        this.CodEmpregado = CodEmpregado;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }
    
}
