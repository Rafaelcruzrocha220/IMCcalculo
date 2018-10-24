/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcular_imc.calculoimc;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author 1721513592
 */
@ManagedBean(name="IMCBean")
@RequestScoped
public class IMCBean {

       private double peso;
    private double altura;
    private double imc;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }
    
    public void calcularImc() {
        double novoImc = this.getPeso() / Math.pow(this.getAltura(), 2);
        this.setImc(novoImc);
    }
    
}
