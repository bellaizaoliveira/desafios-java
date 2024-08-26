public class ProjetoDia4B {
    public static void main(String[] args) {
        // Definição da string que será impressa com espaços entre os caracteres
       
        String frase = "Hello, Love!"; // Define a variável 'frase' com o valor "Hello, Love!"

        // Laço 'for' para iterar sobre cada caractere da string 'frase'
        // 'i' começa em 0 e aumenta até o comprimento da string
        for (int i = 0; i < frase.length(); i++) { // Itera por todos os caracteres da string
            
            // Imprime o caractere na posição 'i' da string 'frase', seguido de um espaço
            // 'frase.charAt(i)' retorna o caractere na posição 'i'
            // 'System.out.print(...)' imprime o caractere e um espaço sem pular para a próxima linha
            System.out.print(frase.charAt(i) + " "); // Exibe o caractere atual e um espaço para separar os caracteres
        }
        
        // Após o laço 'for', imprime uma nova linha
        // Isso garante que o cursor vá para a linha seguinte no console
        // Para que qualquer saída subsequente no console comece em uma nova linha
        System.out.println(); // Move o cursor para a próxima linha após a impressão dos caracteres
    }
}
