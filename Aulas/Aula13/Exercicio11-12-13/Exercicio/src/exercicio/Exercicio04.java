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
public class Exercicio04 {
    public static void main(String[] args){
    Scanner scan = new Scanner (System.in);
    System.out.println("Vamos fazer a sua média de notas, pf informe as suas quatro notas: ");
    float n1 = scan.nextFloat();     
    float n2 = scan.nextFloat();    
    float n3 = scan.nextFloat();    
    float n4 = scan.nextFloat();    
    float notaFinal = (n1 + n2 + n3 + n4)/4;
    
    System.out.println("A sua média final é "+notaFinal);
    
    }
}