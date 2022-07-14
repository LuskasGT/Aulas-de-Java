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
public class Exercicio9 {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite a temperatura em F° para transformalo em Celsius: ");
        double Fah = scan.nextDouble();
        Fah = 5 *(Fah -32)/9;
        System.out.println("A temperatura é de "+Fah);
    }
    
}
