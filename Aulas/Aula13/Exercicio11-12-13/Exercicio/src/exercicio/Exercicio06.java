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
public class Exercicio06 {
    public static void  main (String[] args){ 
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite o raio do circulo para podermos calcular a sua área: ");
        double raio = scan.nextFloat();
        double area = Math.PI  * Math.pow (raio , 2);
        System.out.println("A area é de "+ area);
        
    }
}
