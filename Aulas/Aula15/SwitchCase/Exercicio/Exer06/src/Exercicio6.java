import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite três números e vamos mostrar o maior entre eles: ");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();

        if (n1 > n2 && n1 > n3){
            System.out.println("O n1 é o maior de todos");
        }else if (n2 > n1 && n2 > n3) {
            System.out.println("O n2 é o maior de todos");
        }else if (n3 > n1 && n3 > n2) {
            System.out.println("O n3 é o maior de todos");
        }else{
            System.out.println("Todos são iguais");
        }
    }
}