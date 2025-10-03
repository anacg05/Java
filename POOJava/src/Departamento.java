public class Departamento {
    String nome;
    double orcamento;
    int numFuncionarios;

    public Departamento(String nome, double orcamento, int numFuncionarios){
        this.nome = nome;
        this.orcamento = orcamento;
        this.numFuncionarios = numFuncionarios;
    }

    void atualizarNome(String nome){
        // void são métodos que não possuem retorno.
        this.nome = nome;
    }

    void exibirDetalhes(){
        // nome de métodos seguem o padrão camelCase
        System.out.printf("O departamento de %s está com %d funcionarios e com o orçamento de %.2f\n", this.nome, this.numFuncionarios, this.orcamento);
    }

    double calcularAumentoDeOrcamento(double percentual){
        return (orcamento * percentual)+ orcamento;
    }

    double obterNumeroDeFuncionarios(){
        return numFuncionarios;
    }
}
