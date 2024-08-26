public class ForLoopArray { // Define a classe principal do programa.
    public static void main(String[] args) { // Método principal onde a execução do programa começa.
        String[] cars = {"BMW", "Tesla", "Fiat"}; // Cria um array de Strings chamado 'cars' e o inicializa com três valores.

        // Laço 'for' para iterar sobre o array 'cars'.
        for (int i = 0; i < cars.length; i++) { // Inicializa a variável 'i' em 0 e continua enquanto 'i' for menor que o comprimento do array 'cars'.
            System.out.println(cars[i] + " "); // Imprime o elemento atual do array 'cars' seguido de um espaço.
        }
    }
}