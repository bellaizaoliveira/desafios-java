// Declaração da classe OperTernario
public class OperTernario {
    
    // Método principal, onde a execução do programa começa
    public static void main(String[] args) {

        // Declara e inicializa uma variável inteira chamada ingresso com o valor 400
        int ingresso = 400;
        
        // Usa o operador ternário para determinar o valor da variável terAcesso
        // O operador ternário é uma forma compacta de escrever uma estrutura condicional
        // A expressão é da forma: condição ? valorSeVerdadeiro : valorSeFalso
        // Neste caso, a condição é ingresso >= 500
        // Se a condição for verdadeira, terAcesso será "VIP"; caso contrário, será "Pista"
        String terAcesso = ingresso >= 500 ? "VIP" : "Pista";
        
        // Imprime o valor da variável terAcesso no console
        // O valor impresso será "Pista", pois ingresso é 400, que é menor que 500
        System.out.println(terAcesso);    
    }
}
