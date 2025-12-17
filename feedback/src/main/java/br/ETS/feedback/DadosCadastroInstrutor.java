package br.ETS.feedback;

// record é imutavel
public record DadosCadastroInstrutor(String nome,
                                     String email,
                                     String edv,
                                     Curso curso,
                                     DadosInformacoes informacoes) {


}
