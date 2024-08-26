// Importa a classe Arrays da biblioteca java.util para operações úteis com arrays
import java.util.Arrays;

public class ArraysMultidimensionais { // Declaração da classe pública chamada ArraysMultidimensionais
    public static void main(String[] args) { // Método principal, onde a execução do programa começa

        // Declara e inicializa um array bidimensional de Strings chamado cars
        // O array cars tem duas dimensões:
        // A primeira dimensão contém duas linhas: {"BMW", "Tesla"} e {"Jeep", "Fiat"}
        // Cada linha é um array de Strings
        String[][] cars = {{"BMW", "Tesla"}, {"Jeep", "Fiat"}};

        // Usa o método deepToString da classe Arrays para converter o array multidimensional em uma string
        // A função deepToString é útil para arrays multidimensionais, pois imprime o conteúdo de todos os níveis
        // Exibe a representação em string do array cars no console
        System.out.println(Arrays.deepToString(cars));
    }
}
