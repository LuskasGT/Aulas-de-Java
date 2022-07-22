import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite qualquer letra e se for uma vogal iremoes avisá-lo: ");
        String letra = scan.next();

        if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")){
            System.out.println("O que vc digitou foi uma vogal");
        }else{
            System.out.println("O que vc digitou foi uma consoante");
        }
    }
}