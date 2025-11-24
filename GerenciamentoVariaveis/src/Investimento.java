public class Investimento {
    String nomeInvestidor;
    double saldoAtual;
    static double taxaRentabilidade = 0.02;

    public Investimento(String nomeInvestidor, double saldoAtual) {
        this.nomeInvestidor = nomeInvestidor;
        this.saldoAtual = saldoAtual;
    }

    void rentabilizar(){
        this.saldoAtual = this.saldoAtual * (1 + taxaRentabilidade);
    }
}
