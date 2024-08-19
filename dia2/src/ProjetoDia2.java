import java.util.Arrays;  // Importa a classe Arrays para manipulação de arrays.

public class ProjetoDia2 {
    public static void main(String[] args) {

        // Declara e inicializa um array de inteiros com alguns valores.
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};

        // Declara e inicializa um array de Strings com alguns valores.
        String[] my_array2 = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };

        // Exibe o array de inteiros original.
        System.out.println("Array 1 - Original: " + Arrays.toString(my_array1));
        // Ordena o array de inteiros em ordem crescente.
        Arrays.sort(my_array1);
        // Exibe o array de inteiros após a ordenação.
        System.out.println("Array 1 - Ordem: " + Arrays.toString(my_array1));

        // Exibe o array de Strings original.
        System.out.println("Array 2 - Original: " + Arrays.toString(my_array2));
        // Ordena o array de Strings em ordem alfabética. (Erro: deve-se ordenar my_array2, não my_array1).
        Arrays.sort(my_array1);
        // Exibe o array de Strings após a ordenação (não será alterado devido ao erro).
        System.out.println("Array 2 - Ordem: " + Arrays.toString(my_array2));
    }
}
