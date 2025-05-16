import java.util.Scanner;

public class exercicioCondicional {

    public static void main(String[] args) {

        /*

        // EXERCICIO DE CONDICIONAL DE ALUNO

        double media = 3.1;
        int faltas = 30;
        boolean postura = true;


        String situacao;

        //caso seja verdadeiro
        if (media >= 5.0 && faltas <25 && postura== true){
            situacao = "Aprovado";
        }

        else if (media<5.0 && faltas<25 && postura){
            situacao = "Recuperação";
        }

        else if(faltas>=25 && media>=5.0 && postura){
            situacao = "Sem férias";
        }

        else if(media >= 5.0 && faltas <25 && postura==false){
            situacao = "Chamar para conversar";
        }

        else{
            situacao= "Reprovado";
        }

        System.out.println(situacao);




        // BLOCO DE CÓDIGOS SEPARADOS

        double tempo = 90;


        if (tempo > 90) {
            System.out.println("O tempo foi maior que 90");
        }

        if (tempo > 60) {
            System.out.println("O tempo foi maior que 60");
        }




        // EXERCICIO NUMERO PAR OU IMPAR

        int num;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        num = scan.nextInt();

        if(num % 2 == 0){
            System.out.println("Número par");
        }

        else{
            System.out.println("Número ímpar");
        }


         */


        // EXERCICIO 2

        int num;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        num = scan.nextInt();

        if(num%2==0 && num % 5==0){
            System.out.println("FizzBuzz");
        }

        else if (num % 2==0){
            System.out.println("Fizz");
        }

        else if(num%5==0){
            System.out.println("Buzz");
        }

        else{
            System.out.println("Erro");
        }
    }
}
