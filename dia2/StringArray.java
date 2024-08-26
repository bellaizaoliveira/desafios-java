// Importa a classe Arrays da biblioteca java.util para operações úteis com arrays
import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {

        // Declara e inicializa um array de Strings chamado 'cars' com os valores "BMW", "Tesla", "Jeep" e "Fiat"
        String[] cars = {"BMW", "Tesla", "Jeep", "Fiat"};

        // Converte o array 'cars' em uma representação de string e a exibe no console
        // Arrays.toString converte o array para uma string formatada como [BMW, Tesla, Jeep, Fiat]
        System.out.println(Arrays.toString(cars));

        // Acessa o elemento na posição 2 do array 'cars' (que é "Jeep") e o exibe no console
        // Os índices em arrays começam em 0, então o índice 2 corresponde ao terceiro elemento
        System.out.println(cars[2]);
    }
}
