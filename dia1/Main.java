// Importa a classe Scanner da biblioteca java.util para permitir a leitura de entrada do usuário
import java.util.Scanner;

// Declaração da classe Main
public class Main {
    // Método principal, onde a execução do programa começa
    public static void main(String[] args) {

        // Cria um objeto Scanner chamado scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite o primeiro número
        System.out.println("Digite o primeiro número: ");
        // Lê o número digitado pelo usuário e o armazena na variável numero1
        double numero1 = scanner.nextDouble();

        // Solicita ao usuário que digite o segundo número
        System.out.println("Digite o segundo número: ");
        // Lê o número digitado pelo usuário e o armazena na variável numero2
        double numero2 = scanner.nextDouble();

        // Calcula a soma dos dois números
        double resultado = numero1 + numero2;
        // Exibe o resultado da soma para o usuário
        System.out.println("O resultado é: " + resultado);

        // Fecha o scanner para liberar os recursos
        scanner.close();
    }
}
