public class OperLogicos {

    public static void main(String[] args) {
        // Preço do produto
        int priceProduct = 15;

        // Comprar semente entre $10 e $15
        // Corrigido: O operador lógico correto é '&&', e a comparação deve ser feita corretamente
        boolean buy = priceProduct >= 10 && priceProduct <= 15;

        // Imprime se o produto deve ser comprado ou não
        System.out.println(buy); // Verifica se o preço está entre $10 e $15
    }
    
    /*
     Lista de operadores lógicos e suas funções:
     
        &&  : E lógico (AND) - Retorna true se ambas as condições forem verdadeiras.
        ||  : Ou lógico (OR) - Retorna true se pelo menos uma das condições for verdadeira.
        !   : Negação lógica (NOT) - Retorna true se a condição for falsa.
        ^   : Ou exclusivo lógico (XOR) - Retorna true se exatamente uma das condições for verdadeira.
     
     Exemplos:
     
        A && B: Retorna true se A for true e B for true.
        A || B: Retorna true se A for true ou B for true.
        !A    : Retorna true se A for false.
        A ^ B : Retorna true se A e B forem diferentes.
        
     */
}
