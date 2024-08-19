public class OperLogicoOR {

    public static void main(String[] args) { // Método principal deve ser 'main'

        // Definição das variáveis
        boolean temEmprego = true;
        boolean temEmpresa = false;
        boolean tem50k = false; // Corrigido o nome da variável para 'tem50k'

        // Verifica se pode financiar com base nas condições
        boolean podeFinanciar = (temEmprego || temEmpresa) && tem50k;

        // Imprime o resultado da condição
        System.out.print(podeFinanciar); // Exibe se é possível financiar
    }
}
