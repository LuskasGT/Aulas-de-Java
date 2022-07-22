import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite F ou M: ");
        String sexo = scan.next();

        if (sexo.equalsIgnoreCase("F")){   /*Vai pegar o f minusculo tbm*/
            System.out.println("F de Feminino");
        } else if (sexo.equalsIgnoreCase("M")){
            System.out.println("M de Masculino");
        }else {
            System.out.println("Sexo inválido");
        }
    }
}