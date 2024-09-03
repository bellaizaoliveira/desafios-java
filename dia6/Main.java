public class Main {
    public static void main(String[] args) {
        // Cria um novo objeto da classe Clients chamado c001
        Clients c001 = new Clients("Izabella", 17);

        // Cria um novo objeto da classe Clients chamado c002
        Clients c002 = new Clients("Theófilla", 14);

        // Chama o método newAccount para o cliente c001
        c001.newAccount();

        // Chama o método newAccount para o cliente c002
        c002.newAccount();
    }
}
