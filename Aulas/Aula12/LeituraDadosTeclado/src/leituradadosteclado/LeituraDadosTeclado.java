/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leituradadosteclado;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class LeituraDadosTeclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in); /*Ele vai scanear o que vc vai digitar, se é número ou letra */
        
        
        
        
        
        /*Aqui vamos ler tudo em uma linha só */  /*para preencher coloca espaço:  Lucas 17 99  1,999  true*/
        System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem bichinho de estimação: ");
        String prinome = scan.next();
        int idadee = scan.nextInt();
        byte qtdeFilhos = scan.nextByte();
        float alturaa = scan.nextFloat();
        boolean temPet = scan.nextBoolean();
        
        System.out.println("Você digitou os seguintes valores: ");
        System.out.println("Primeiro nome: "+ prinome);
        System.out.println("Idade: " + idadee);
        System.out.println("Quantidade de filhos: " + qtdeFilhos);
        System.out.println("Altura: "+ alturaa);
        System.out.println("Tem Pet: "+ temPet);
        
    }
}
