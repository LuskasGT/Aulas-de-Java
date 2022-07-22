import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número e vamos falar se ele é positivo ou negativo: ");
        int num = scan.nextInt();

        if (num > 0){
            System.out.println("O número digitado é positivo");
        }
        else {
            System.out.println ("O número é negativo");
        }

    }
}