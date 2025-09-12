import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int idade;

        System.out.print("Informe a idade: ");
        idade = scan.nextInt();

        if (idade >= 0 && idade <= 14) {
            System.out.println("Classificação: Criança");
        } else if (idade <= 17) {
            System.out.println("Classificação: Adolescente");
        } else if (idade < 30) {
            System.out.println("Classificação: Adulto jovem");
        } else {
            System.out.println("Classificação: Adulto");
        }

        scan.close();
    }
}
