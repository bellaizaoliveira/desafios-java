public class NestedLoop { // Define a classe principal do programa.
    
    public static void main(String[] args) { // Método principal onde a execução do programa começa.

        // Laço externo: Itera sobre a variável 'i'.
        // Este laço vai controlar quantas vezes o laço interno será executado.
        for (int i = 0; i < 2; i++) { // Inicializa 'i' com 0 e continua enquanto 'i' for menor que 2.

            // Laço interno: Itera sobre a variável 'j'.
            // Este laço é executado completamente para cada valor de 'i'.
            for (int j = 0; j < 2; j++) { // Inicializa 'j' com 0 e continua enquanto 'j' for menor que 2.

                // Imprime os valores atuais de 'i' e 'j', separados por um espaço.
                // A cada iteração do laço interno, 'i' e 'j' são impressos.
                System.out.println(i + " " + j); // Exibe a combinação atual de 'i' e 'j'.

            } // Fim do laço interno (este laço se repete para todos os valores de 'j' para cada valor de 'i').

        } // Fim do laço externo (este laço se repete para todos os valores de 'i').

    } // Fim do método main.

} // Fim da classe.
