public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("1234");
        Cliente cliente = new Cliente("abcd");

        SistemaInterno sistema = new SistemaInterno();
        sistema.login(gerente, "1234");
        sistema.login(cliente, "TesteSenha666");
    }
}