import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite as suas duas notas: ");
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7 && media < 10){
            System.out.println("Aprovado");
        }else if (media < 7){
            System.out.println("Reprovado");
        }
        else if (media == 10){
            System.out.println("Aprovado com Distinção");
        }
        else{
            System.out.println ("Digita certo ai");
        }
    }
}