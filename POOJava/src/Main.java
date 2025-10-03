public class Main {
    public static void main(String[] args) {


//        colaborador.nome = "Ana Clara";
//        colaborador.cargo = "Técnica de Soluções Digitais";
//        colaborador.edv = 01010505;
//
//        System.out.println(colaborador.nome);

        // 1 parametro
//        Colaborador colaborador = new Colaborador("Ana Clara");    // instanciação
//        System.out.println(colaborador.nome);

//        // 2 parametros
//        Colaborador colaborador = new Colaborador("Ana Clara", 12345678);
//        System.out.println(colaborador.nome);
//        System.out.println(colaborador.edv);


//        //3 parametros
//        Colaborador colaborador = new Colaborador("Ana Clara", 12345678, "Técnica de Soluções Digitais");
//        System.out.println(colaborador.nome);
//        System.out.println(colaborador.edv);
//        System.out.println(colaborador.cargo);
//
// --------------------------------------------------------------------------------------------------------------

        Departamento departamento = new Departamento("ETS", 1000000, 500);
//        System.out.println(departamento.nome);
//        departamento.atualizarNome("ETC");
//        System.out.println(departamento.nome);

//        departamento.exibirDetalhes();
//        System.out.println("O orçamento foi de: " + departamento.calcularAumentoDeOrcamento(0.20));

        System.out.printf("O departamento %s tem %.2f funcionarios", departamento.nome, departamento.obterNumeroDeFuncionarios());

    }
}