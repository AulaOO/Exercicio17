/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio17;

import java.util.Scanner;

/**
 *
 * @author Luis Guilherme
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor do comprimento");
        double comprimento = ler.nextDouble();
        Retangulo retangulo = new Retangulo(comprimento);
        System.out.println("A área do retângulo é: " + retangulo.areaRetangulo());
        System.out.println("O perímetro do retangulo é: " + retangulo.perimetroRetangulo());
        imprimeTesteComprimento(retangulo);
        imprimeTesteLargura(retangulo);
    }

    private static void imprimeTesteComprimento(Retangulo retangulo) {
        if(retangulo.veerificaComprimento() == true){
            System.out.println("O comprimento é um número flutuante entre 0.0 e 20.0");
        }else{
            System.out.println("O comprimento não é um número flutuante entre 0.0 e 20.0");
        }
    }
    
    private static void imprimeTesteLargura(Retangulo retangulo){
        if(retangulo.veerificaLargura() == true){
            System.out.println("A largura é um número flutuante entre 0.0 e 20.0");
        }else{
            System.out.println("A largura não é um número flutuante entre 0.0 e 20.0");
        }
    }
    
    
}
