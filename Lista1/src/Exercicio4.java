import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero, antecessor, sucessor;

        System.out.print("Digite um numero inteiro: ");
        numero = scan.nextInt();

        antecessor = numero - 1;
        sucessor = numero + 1;

        System.out.printf("O antecessor é: %d\n ", antecessor);
        System.out.printf("O sucessor é: %d ", sucessor);

        scan.close();
    }
}
