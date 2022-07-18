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
public class Exercicio03 {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite dois valores para fazer a soma entre eles (pf coloca número inteiro): ");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int valorTotal = n1 + n2;
        System.out.println("A soma dos dois valores é " + valorTotal);
    }
}
