/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkgelse;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class IfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
            
        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();
        
        if (idade >= 18){
            System.out.println("Você é maior de idade");
        }
        else if (idade > 25 && idade < 30 ){
            System.out.println("Seila é só para mostrar o else if com && (o && seria o and)");
        }
        else {
            System.out.println("Você é menor de idade");
        }
         
        // TODO code application logic here
    }
    
}
