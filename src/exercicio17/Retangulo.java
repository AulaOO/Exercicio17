/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio17;

/**
 *
 * @author Luis Guilherme
 */
public class Retangulo {
    private double altura;
    private double largura;
    private double comprimento;


    public Retangulo(double comprimento) {
        this.altura = 1;
        this.largura = 1;
        this.comprimento = comprimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
    
    public double areaRetangulo(){
        return comprimento * largura;
    }
    
    public double perimetroRetangulo(){
        return 2 * (comprimento + largura);
    }
    
    public boolean veerificaComprimento(){
        if((comprimento > 0.0) && (comprimento < 20.0)){
            return true;
        }
        return false;
    }
    
    public boolean veerificaLargura(){
        if((largura > 0.0) && (largura < 20.0)){
            return true;
        }
        return false;
    }    
}
