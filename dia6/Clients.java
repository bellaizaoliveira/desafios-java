public class Clients {
    // Atributos da classe Clients
    String firstname;
    int age;
    int balance;  // Adicionei o atributo balance aqui para manter a consistência

    // Construtor da classe Clients
    Clients(String firstname, int age) {
        this.firstname = firstname;
        this.age = age;
        this.balance = 0; // Inicializando balance com valor padrão (0)
    }

    // Método para criar uma nova conta
    public void newAccount() {
        System.out.println("Criando nova conta para " + firstname + " com idade " + age);
    }
}
