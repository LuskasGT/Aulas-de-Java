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
public class Exercicio13 {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite a quantidade que vc ganha por hora, total de horas trabalhadas por mês");
        
        double horas = scan.nextDouble();
        double horasPorMes = scan.nextDouble();
        
        double SalarioBruto = (horas * horasPorMes);  /*Salario bruto*/
        double Ir = (SalarioBruto * 11) /100;   /*Quantidade do desconto do IR*/
        double Inss = (SalarioBruto * 8) /100;  /*Quantidade do desconto do Inss*/
        double Sindicato = (SalarioBruto * 5) /100;  /*Quantidade do desconto do Sindicato*/
        
        double SalarioLiquido = SalarioBruto - Ir - Inss - Sindicato;
        
        System.out.println("O desconto do INSS foi de "+ Inss);
        System.out.println("O desconto do Sindicato foi de "+ Sindicato);
        System.out.println("O seu salario líquido ficou em "+ SalarioLiquido);
        
    }
}
