public class UsuarioAdmin extends Usuario{

    public UsuarioAdmin(String nome, String senha, String email) {
        super(nome, senha, email);
    }

    // Sobrecarga.
    // Sobrecarga é sempre quando tem uma relação de herança.
    @Override
    void concederAcessos(){
        super.concederAcessos();
        System.out.printf("Usuário %s está com acessos administrativos.", this.nome);
    }


}
