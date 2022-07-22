import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número para compararmos com outro: ");
        int numero1 = scan.nextInt();
        System.out.println("Digite outro número: ");
        int numero2 = scan.nextInt();

        if (numero1 > numero2){
            System.out.println("O número "+ numero1 +" é maior que o segundo número digitado");
        }
        else{
            System.out.println("O número "+ numero2 +" é maior que o primeiro número digitado");
        }


    }
}