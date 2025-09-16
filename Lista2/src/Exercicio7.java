import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int perguntaEscolhida = 0;
        String respostaUsuario;

        // Validação Pergunta
        while (perguntaEscolhida != 1 && perguntaEscolhida != 2) {
            System.out.print("Qual pergunta deseja responder? (1 ou 2): ");
            perguntaEscolhida = scanner.nextInt();

            if (perguntaEscolhida != 1 && perguntaEscolhida != 2) {
                System.out.println("Opção inválida! Digite 1 ou 2.");
            }
        }

        scanner.nextLine();

        // Switch Case Perguntas e Alternativas
        switch (perguntaEscolhida) {
            case 1:
                System.out.println("Pergunta 1: Qual é a capital da França?");
                System.out.println("a) Paris");
                System.out.println("b) Londres");
                System.out.println("c) Roma");

                System.out.print("Digite sua resposta (a, b ou c): ");
                respostaUsuario = scanner.nextLine().toLowerCase();

                if (respostaUsuario.equals("a")) {
                    System.out.println("Você acertou, pode retirar seu bônus na Shostners and Shostners!");
                } else {
                    System.out.println("Você não acertou, mas tente novamente numa próxima.");
                }
                break;

            case 2:
                System.out.println("Pergunta 2: Qual é o maior planeta do sistema solar?");
                System.out.println("a) Marte");
                System.out.println("b) Saturno");
                System.out.println("c) Júpiter");

                System.out.print("Digite sua resposta (a, b ou c): ");
                respostaUsuario = scanner.nextLine().toLowerCase();

                if (respostaUsuario.equals("c")) {
                    System.out.println("Você acertou, pode retirar seu bônus na Shostners and Shostners!");
                } else {
                    System.out.println("Você não acertou, mas tente novamente numa próxima.");
                }
                break;
        }

        scanner.close();
    }

}
