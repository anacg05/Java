import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao;
        int qtdOtimo = 0;
        int qtdBom = 0;
        int qtdRuim = 0;
        int total = 0;
        int somaNotas = 0;

        char continuar = 'S';

        while (continuar == 'S') {

            System.out.println("Opinião sobre o filme:");
            System.out.println("1 - Ótimo");
            System.out.println("2 - Bom");
            System.out.println("3 - Ruim");
            System.out.print("Digite sua opção: ");
            opcao = scanner.nextInt();

            while (opcao < 1 || opcao > 3) {
                System.out.print("Opção inválida. Digite 1, 2 ou 3: ");
                opcao = scanner.nextInt();
            }

            if (opcao == 1) {
                qtdOtimo++;
            } else if (opcao == 2) {
                qtdBom++;
            } else {
                qtdRuim++;
            }

            total++;
            somaNotas += opcao;

            System.out.print("Deseja continuar? (S/N): ");
            continuar = scanner.next().toUpperCase().charAt(0);

            while (continuar != 'S' && continuar != 'N') {
                System.out.print("Resposta inválida. Digite S ou N: ");
                continuar = scanner.next().toUpperCase().charAt(0);
            }

            System.out.println("----------------------");
        }

        // Cálculo dos percentuais
        double percOtimo = (qtdOtimo * 100.0) / total;
        double percBom = (qtdBom * 100.0) / total;
        double percRuim = (qtdRuim * 100.0) / total;

        double media = (double) somaNotas / total;

        // Resultados
        System.out.println("Resultados da pesquisa:");
        System.out.println("Ótimo: " + qtdOtimo + " (" + percOtimo + "%)");
        System.out.println("Bom: " + qtdBom + " (" + percBom + "%)");
        System.out.println("Ruim: " + qtdRuim + " (" + percRuim + "%)");
        System.out.println("Total de respondentes: " + total);
        System.out.println("Média das notas do filme: " + media);

        scanner.close();
    }
}
