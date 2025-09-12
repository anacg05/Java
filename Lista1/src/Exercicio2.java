import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n1, n2, soma, sub, mult, resto, div;
        double elevado;

        System.out.println("Informe o primeiro numero: ");
        n1 = scan.nextInt();

        System.out.println("Informe o segundo numero: ");
        n2 = scan.nextInt();

        soma = n1 + n2;
        sub = n1 - n2;
        mult = n1 * n2;
        elevado = Math.pow(n1, n2);


        System.out.printf("Soma: %d\n", soma);
        System.out.printf("Subtração: %d\n", sub);
        System.out.printf("Multiplicação: %d\n", mult);
        System.out.printf("Exponente: %.2f\n", elevado);

        if (n2 == 0){
            System.out.println("A divisão não poderá ser realizada.\n");

        }
        else{
            div = n1 / n2;
            System.out.printf("Divisão: %d\n", div);

            resto = n1 % n2;
            System.out.printf("Resto: %d\n", resto);

        }


        scan.close();


    }
}
