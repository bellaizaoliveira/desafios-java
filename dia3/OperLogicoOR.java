public class OperLogicoOR {

    public static void main(String[] args) { // Método principal onde a execução do programa começa

        // Definição das variáveis
        boolean temEmprego = true;   // Declara uma variável booleana 'temEmprego' e a inicializa com 'true'
        boolean temEmpresa = false;  // Declara uma variável booleana 'temEmpresa' e a inicializa com 'false'
        boolean tem50k = false;      // Declara uma variável booleana 'tem50k' e a inicializa com 'false'

        // Verifica se pode financiar com base nas condições
        // 'podeFinanciar' será verdadeiro se:
        // 1. 'temEmprego' é verdadeiro OU 'temEmpresa' é verdadeiro (operador ||)
        // E, ao mesmo tempo, 'tem50k' deve ser verdadeiro (operador &&)
        boolean podeFinanciar = (temEmprego || temEmpresa) && tem50k;

        // Imprime o resultado da condição
        // A expressão 'podeFinanciar' será 'false' porque 'tem50k' é 'false'
        System.out.print(podeFinanciar); // Exibe se é possível financiar, no caso 'false'
    }
}
