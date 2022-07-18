/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Exercicio12 {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite a sua altura");
        double altura = scan.nextDouble();
        
        double pesoIdeal = (altura  * 72.2) - 58;
        System.out.println("O seu peso ideal é de "+pesoIdeal+" Kg");
         
    }
}
