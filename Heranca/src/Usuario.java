public class Usuario {
    String nome;
    String senha;
    String email;

    Usuario(String nome, String senha, String email){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    void autenticar(){
        System.out.printf("Usuário %s está autenticado.\n", this.nome);
    }

    // Sobreescrita
    // É quando tem a MESMA CLASSE, mas métodos com assinaturas diferentes.
    // Assinatura: quantidade e o tipo de parametros de um método
    void autenticar(String sobrenome){
        System.out.printf("Usuário %s está autenticado.");
    }

    void concederAcessos(){
        System.out.printf("Usuário %s está com acessos regulares.\n", this.nome);
    }

    void configurar(){

    }
}
