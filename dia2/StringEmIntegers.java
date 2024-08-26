public class StringEmIntegers {
    public static void main(String[] args) {

        // Declara uma variável do tipo String chamada 'valorProduto' e a inicializa com o valor "10"
        String valorProduto = "10";

        // Converte a String 'valorProduto' para um inteiro usando Integer.parseInt()
        // Em seguida, adiciona 2 ao valor inteiro resultante
        int valorTotal = Integer.parseInt(valorProduto) + 2;

        // Exibe o valor original da String 'valorProduto' no console
        // A saída será "10"
        System.out.println(valorProduto);

        // Para mostrar o valor total resultante da conversão e adição, adicione esta linha:
        // Exibe o valor total calculado no console
        // O valor de 'valorTotal' é 12 (10 + 2)
        System.out.println(valorTotal);
    }
}
