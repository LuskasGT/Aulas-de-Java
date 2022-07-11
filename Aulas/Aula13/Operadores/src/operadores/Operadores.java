/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

/**
 *
 * @author lucas
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultado = 1 + 2;
        System.out.println(resultado);
        
        resultado = resultado - 1;
        System.out.println(resultado);
         
        resultado = resultado * 2;
        System.out.println(resultado);
        
        resultado = resultado / 2;
        System.out.println(resultado);
        
        resultado = resultado + 8;
        System.out.println(resultado);
        
        resultado = resultado % 7;
        System.out.println(resultado);
        
        String primeiroNome = "Esta é ";
        String segundoNome = "uma String concatenada";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println (terceiroNome);
        
        //resultado final é 4
        resultado = resultado + 1;
        System.out.println(resultado);
        
        
        
        
        //vai ficar com 5
        System.out.println(resultado++);
        // com o ++ na frente da variavel, seria a mesma coisa que 
        //System.out.println(resultado);
        //resultado = resultado + 1;
        //resultado +=1;
                                                            //só muda a forma que vai ser construido
    
        // vai ficar com 7
        System.out.println(++resultado);
        //com o ++ antes da variavel, seria a mesma coisa que 
        //resultado +=1
        //System.out.println(resultado)
        
        
        resultado--;
        System.out.println(resultado);
        
        System.out.println(resultado--);
        System.out.println(--resultado);
        
        
        
        
        
        
        
        //Operadores Logicos, daqui em diante
        
        int valor1 = 1;
        int valor2 = 2;
        
        System.out.println("valor1 == valor2: " + (valor1 == valor2));
        System.out.println("valor1 != valor2: " + (valor1 != valor2));
        System.out.println("valor1 > valor2: " + (valor1 > valor2));
        System.out.println("valor1 < valor2: " + (valor1 < valor2));
        System.out.println("valor1 >= valor2: " + (valor1 >= valor2));
        System.out.println("valor1 <= valor2: " + (valor1 <= valor2));
        
        
        
        
        
        
        
        
        
        //Operadores relacionais
        int valor3 = 1;
        int valor4 =2;
        
        boolean resultado1 = (valor3 ==1) && (valor4 ==2);
        System.out.println("valor é 1 AND valor2 é 2 - resultado: "+ resultado1);
        
           
        boolean resultado2 = (valor3 ==1) || (valor4 ==2);
         System.out.println("valor é 1 AND valor2 é 2 - resultado: "+ resultado2);
    }

}
