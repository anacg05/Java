import java.util.Scanner;

public class exponenciacao {
    public static void main(String[] args) {

        /*

        double potencia = Math.pow(2,3);        // exponenciação (2³)
        System.out.println(potencia);

        double raiz = Math.sqrt(4);     //raiz quadrada
        System.out.println(raiz);
         */

        // lendo numero
        int numero;
        Scanner scan = new Scanner(System.in);      //declarando o scanner

        System.out.println("Digite um número: ");
        numero = scan.nextInt();                    // lendo o numero

        System.out.println("O numero que voce digitou foi: " + numero);


        // lendo palavra
        String palavra;

        scan.nextLine();        //limpa o buffer, pq o nextLine depois do nextInt dá erro

        System.out.print("Digite uma palavra: ");
        palavra = scan.nextLine();

        System.out.println("A palavra que voce digitou foi: " + palavra);



        // nome e sobrenome
        String nome, sobrenome;

        System.out.print("Digite seu nome:");
        nome = scan.nextLine();

        System.out.print("Digite seu sobrenome: ");
        sobrenome = scan.nextLine();

        System.out.printf("O meu nome é %s %s", nome, sobrenome);
        scan.close();


    }
}
