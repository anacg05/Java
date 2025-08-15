import java.util.Scanner;

public class aulaFOR {
    public static void main(String[] args) {

        /*
        externo:
        for (int i = 0; i < 3; i++) {
            System.out.println("Banana");

            for (int j = 0; j < 2 ; j++) {
                System.out.println("Maçã");
                break externo;
            }
        */



        /*

        * Toda vez que o usuario digitar algo diferente de sair, o código continua.
        * Quando ele digitar a palavra "sair", o código encerra.
        *

        Scanner scan  = new Scanner(System.in);
        String valor = "";


        while(!valor.equalsIgnoreCase("sair")){    // método equals é usado para STRINGS e não ==
            System.out.println("Digite algo: ");
            valor = scan.nextLine();

        }

        scan.close();

         */

        Scanner scan = new Scanner(System.in);
        int contador = 0, acumulador = 0;

        while (contador < 5){
            System.out.println(contador);
            contador++;

            System.out.println("Digite um numero: ");

            acumulador+=scan.nextInt();
            scan.nextLine();

            System.out.printf("Contador está em %d e " +
                    "o acumulador está em %d\n", contador, acumulador);
        }
        scan.close();
    }
}
