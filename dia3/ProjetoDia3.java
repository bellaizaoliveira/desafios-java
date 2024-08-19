import java.util.Scanner; // Importa a classe Scanner para leitura de entrada do usuário

public class ProjetoDia3 {

    public static void main(String[] args) {

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner lerNumeros = new Scanner(System.in);
        System.out.println("Digite um número: ");
        
        // Lê um número inteiro fornecido pelo usuário
        int num = lerNumeros.nextInt();

        // O código para determinar a quantidade de dígitos no número fornecido
        if (num >= 1 && num <= 9) {
            // Se o número estiver entre 1 e 9 (inclusive), é um número de 1 dígito
            System.out.println("Este número tem 1 dígito");
        } else if (num >= 10 && num <= 99) {
            // Se o número estiver entre 10 e 99 (inclusive), é um número de 2 dígitos
            System.out.println("Este número tem 2 dígitos");
        } else if (num >= 100 && num <= 999) {
            // Se o número estiver entre 100 e 999 (inclusive), é um número de 3 dígitos
            System.out.println("Este número tem 3 dígitos");
        } else if (num >= 1000 && num <= 9999) {
            // Se o número estiver entre 1000 e 9999 (inclusive), é um número de 4 dígitos
            System.out.println("Este número tem 4 dígitos");
        } else if (num >= 10000) {
            // Se o número for 10000 ou maior, é um número de 5 dígitos ou mais
            System.out.println("Este número tem 5 dígitos ou mais");
        } else {
            // Caso o número seja menor que 1, trata como um número inválido para o contexto
            System.out.println("Número inválido. Digite um número inteiro positivo.");
        }

        // Fecha o Scanner para liberar recursos
        lerNumeros.close();
    }
}
