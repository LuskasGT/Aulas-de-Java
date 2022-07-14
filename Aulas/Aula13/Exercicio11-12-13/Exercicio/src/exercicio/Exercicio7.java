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
public class Exercicio7 {
        public static void main(String[] args){
            Scanner scan = new Scanner (System.in);
            
            System.out.println("Digite um número para achar o dobro da área do quadrado: ");
            int area = scan.nextInt();
            area = area * area *2;
            System.out.println("A area é "+area);
            
    }
}
