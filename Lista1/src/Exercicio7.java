import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String nome, mes;
        int carrosVendidos;
        double valorTotalVendas, salarioBase, comissaoPorCarro, comissaoSobreVendas, salarioTotal;

        System.out.print("Informe o nome do vendedor: ");
        nome = scan.nextLine();

        System.out.print("Informe o mês: ");
        mes = scan.next();

        System.out.print("Informe o número de carros vendidos: ");
        carrosVendidos = scan.nextInt();

        System.out.print("Informe o valor total das vendas: ");
        valorTotalVendas = scan.nextDouble();

        salarioBase = 1500.00;
        comissaoPorCarro = 350.00 * carrosVendidos;
        comissaoSobreVendas = valorTotalVendas * 0.00001; // 0,001% = 0.00001 em decimal
        salarioTotal = salarioBase + comissaoPorCarro + comissaoSobreVendas;

        System.out.println("\n--- Recibo de Salário ---");
        System.out.printf("Vendedor: %s%n", nome);
        System.out.printf("Mês: %s%n", mes);
        System.out.printf("Carros vendidos: %d%n", carrosVendidos);
        System.out.printf("Valor total das vendas: R$ %.2f%n", valorTotalVendas);
        System.out.printf("Salário base: R$ %.2f%n", salarioBase);
        System.out.printf("Comissão por carro: R$ %.2f%n", comissaoPorCarro);
        System.out.printf("Comissão sobre vendas (0,001%%): R$ %.5f%n", comissaoSobreVendas);
        System.out.printf("Salário total: R$ %.2f%n", salarioTotal);

        scan.close();

    }
}
