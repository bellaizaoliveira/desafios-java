import java.text.NumberFormat;  // Importa a classe NumberFormat para formatação de números como moeda

public class NumFormat {  // Define uma classe pública chamada NumFormat
    public static void main(String[] args) {

        // Obtém uma instância do formatador de moeda padrão para a localidade padrão do sistema
        // Isso permite formatar números como valores monetários (ex: R$ 120,80 para o Brasil)
        NumberFormat real = NumberFormat.getCurrencyInstance();

        // Formata o número 120.80 como moeda
        // O método format converte o valor 120.80 para uma string formatada de acordo com o padrão de moeda
        String productValue = real.format(120.80);

        // Imprime o valor formatado como moeda no console
        // A saída será algo como "R$ 120,80" dependendo da localidade padrão do sistema
        System.out.println(productValue);
    }
}
