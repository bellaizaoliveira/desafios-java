// Declaração da classe IfElse
public class IfElse {

    // Método principal, onde a execução do programa começa
    public static void main(String[] args) {

        // Declara e inicializa a variável valorCarro com o valor 100.000
        int valorCarro = 100_000;

        // Verifica se o valorCarro é maior que 100.000
        if (valorCarro > 100_000)
            // Se a condição acima for verdadeira, imprime a mensagem "Não comprar. Acima da da tabela"
            System.out.println("Não comprar. Acima da da tabela");

        // Se a condição do if não for verdadeira, verifica a próxima condição
        else if (valorCarro >= 90_000 && valorCarro <= 100_000)
            // Se valorCarro estiver entre 90.000 e 100.000, inclusive, imprime a mensagem "Comprar o carro"
            System.out.println("Comprar o carro");

        // Se nenhuma das condições anteriores for verdadeira, executa este bloco
        else
            // Imprime a mensagem "Não comprar. Valor abaixo da tabela."
            System.out.println("Não comprar. Valor abaixo da tabela.");
    }
}
