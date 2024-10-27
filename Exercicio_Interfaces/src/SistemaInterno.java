public class SistemaInterno {
    public void login(Autenticavel autenticavel, String senha) {
        if (autenticavel.autentica(senha)) {
            System.out.println("Login feito com sucesso!");
        } else {
            System.out.println("Login falhou!");
        }
    }
}