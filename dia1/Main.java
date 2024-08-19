// Importa a classe Scanner da biblioteca java.util para permitir a leitura de entrada do usuário
import java.util.Scanner;

// Declaração da classe Main
public class Main {
    // Método principal, onde a execução do programa começa
    public static void main(String[] args) {

        // Cria um objeto Scanner chamado numero1Scanner para ler a entrada do usuário
        Scanner numero1Scanner = new Scanner(System.in);
        // Solicita ao usuário que digite o primeiro número
        System.out.println("Digite o primeiro número: ");
        // Lê o número digitado pelo usuário e o armazena na variável numero1
        double numero1 = numero1Scanner.nextDouble();

        // Cria um segundo objeto Scanner chamado numero2Scanner para ler a entrada do usuário
        Scanner numero2Scanner = new Scanner(System.in);
        // Solicita ao usuário que digite o segundo número
        System.out.println("Digite o segundo número: ");
        // Lê o número digitado pelo usuário e o armazena na variável numero2
        double numero2 = numero2Scanner.nextDouble();

        // Calcula a soma dos dois números
        double resultado = numero1 + numero2;
        // Exibe o resultado da soma para o usuário
        System.out.println("O resultado é: " + resultado);
    }
}
