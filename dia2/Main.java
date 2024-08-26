// Importa a classe Arrays da biblioteca java.util para operações úteis com arrays
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Declara e inicializa um array de inteiros chamado valores com os elementos 10, 20, 15, 30, 40
        int[] valores = {10, 20, 15, 30, 40};

        // Ordena o array valores em ordem crescente usando o método sort da classe Arrays
        Arrays.sort(valores);

        // Converte o array valores em uma representação de string e a exibe no console
        // Arrays.toString converte o array para uma string formatada como [10, 15, 20, 30, 40]
        System.out.println(Arrays.toString(valores));

        // Exibe o comprimento do array valores no console
        // valores.length retorna o número de elementos no array
        System.out.println(valores.length);
    }
}
