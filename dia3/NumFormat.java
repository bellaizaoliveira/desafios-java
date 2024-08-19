import java.text.NumberFormat;  // Importa a classe NumberFormat para formatação de números como moeda

public class NumFormat {  // Renomeado para evitar colisão de nomes
    public static void main(String[] args) {

        NumberFormat real = NumberFormat.getCurrencyInstance();  // Obtém uma instância do formatador de moeda

        // Formata o número como moeda e o armazena na variável productValue
        String productValue = real.format(120.80);

        // Imprime o valor formatado
        System.out.println(productValue);
    }
}
