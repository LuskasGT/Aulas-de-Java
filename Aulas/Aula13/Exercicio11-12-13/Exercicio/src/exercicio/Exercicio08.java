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
public class Exercicio08 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite quantas horas vc trabalha por mês e quanto vc ganha por hora: ");
        int horas = scan.nextInt();
        double dinheiro = scan.nextDouble();
        
        double dinheiroFinal = dinheiro * horas;
        System.out.println("Você irá receber no final do mês "+dinheiroFinal);
    }
}
