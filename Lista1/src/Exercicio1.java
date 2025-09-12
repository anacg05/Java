import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String nome, sobrenome, data_nasc, escolaridade, cargo_pretendido, cnh;
        double pretensao_sal;

        System.out.print("Informe seu nome: ");
        nome = scan.nextLine();

        System.out.print("Informe seu sobrenome: ");
        sobrenome = scan.nextLine();

        System.out.print("Informe sua data de nascimento (dd/mm/aaaa): ");
        data_nasc = scan.nextLine();

        System.out.print("Informe sua pretensão salarial: ");
        pretensao_sal = scan.nextDouble();
        scan.nextLine();

        System.out.print("Informe seu nivel de escolaridade: ");
        escolaridade = scan.nextLine();

        System.out.print("Informe o cargo pretendido: ");
        cargo_pretendido = scan.nextLine();

        System.out.print("Possui CNH tipo B (Sim / Não): ");
        cnh = scan.nextLine();

        System.out.println("Todos os dados inseridos:\n");
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Sobrenome: %s\n", sobrenome);
        System.out.printf("Data de Nascimento: %s\n", data_nasc);
        System.out.printf("Pretensão Salarial: %.2f\n", pretensao_sal);
        System.out.printf("Escolaridade: %s\n", escolaridade);
        System.out.printf("Cargo Pretendido: %s\n", cargo_pretendido);
        System.out.printf("CNH: %s\n", cnh);


        scan.close();

    }
}
