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
public class Exercicio10 {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite a temperatura em C° para transformalo em fahrenheit: ");
        double Cel = scan.nextDouble();
        Cel = (Cel *9 /5 )+32;
        System.out.println("A temperatura é de "+Cel);
    }  
}
