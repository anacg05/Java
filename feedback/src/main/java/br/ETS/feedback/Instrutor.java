import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Instrutor {
    private String nome;
    private String email;
    private String edv;
    private Curso curso;

    public Instrutor (DadosCadastroInstrutor dadosCadastroInstrutor){
        this.nome = dadosCadastroInstrutor.nome();
        this.email = dadosCadastroInstrutor.email();
        this.edv = dadosCadastroInstrutor.edv();
        this.curso = dadosCadastroInstrutor.curso();

    }
}