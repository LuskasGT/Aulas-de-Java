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
public class Exercicio05 {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
    
        System.out.println("Digite os metros para transformar em centimetros: ");
        float metros = scan.nextFloat();
        float cm = metros * 100;
        System.out.println("o valor em cm é " + cm);
        
        
    }
}
