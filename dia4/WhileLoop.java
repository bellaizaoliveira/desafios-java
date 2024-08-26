public class WhileLoop {
    public static void main(String[] args) {
        int i = 1; // Inicializa a variável 'i' com o valor 1.

        // Laço 'while' para iterar enquanto 'i' for menor ou igual a 100.
        while (i <= 100) { // Continua o laço enquanto 'i' for menor ou igual a 100.
            
            // Verifica se o número atual 'i' é par.
            // Um número é par se o resto da divisão por 2 é igual a 0.
            if (i % 2 == 0) { // Corrige a condição para verificar se 'i' é par.
                
                // Imprime o número par seguido de um espaço.
                // 'System.out.print' é usado para imprimir sem adicionar uma nova linha, 
                // garantindo que todos os números apareçam na mesma linha.
                System.out.print(i + " "); // Exibe o número par atual e um espaço para separá-lo dos próximos números.
            }
            
            // Incrementa o valor de 'i' em 1 após cada iteração.
            // Isso garante que o próximo número seja testado na próxima iteração.
            i++;
        }
        
        // Após o laço terminar, imprime uma nova linha.
        // Isso garante que o cursor vá para a linha seguinte após a impressão de todos os números pares.
        System.out.println(); // Move o cursor para a linha seguinte.
    }
}
