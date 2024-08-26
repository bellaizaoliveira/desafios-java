public class Operadores {
    public static void main(String[] args) {

        // Linha comentada:
        // double a = (double)4 / (double)3;
        // Esta linha converte os inteiros 4 e 3 para double e realiza a divisão, resultando em 1.3333333333333333.
        // O resultado seria armazenado na variável 'a' do tipo double, mas a linha está comentada, então não é executada.

        // Declara uma variável do tipo inteiro chamada 'a' e a inicializa com o valor 4
        int a = 4;

        // Linhas comentadas:
        // a++; // Incrementa o valor de 'a' em 1, tornando-o 5.
        // a--; // Decrementa o valor de 'a' em 1, retornando-o ao valor inicial de 4.
        // As linhas estão comentadas, então as operações não são executadas e o valor de 'a' permanece 4.

        // Exibe o valor atual da variável 'a' no console, que é 4
        System.out.println(a); // Imprime: 4

        // Declara uma variável do tipo inteiro chamada 'b' e a inicializa com o valor da expressão 6 + 2 * 2
        int b = 6 + 2 * 2;

        // A expressão 6 + 2 * 2 é avaliada conforme a precedência dos operadores:
        // 1º Multiplicação (2 * 2 = 4)
        // 2º Soma (6 + 4 = 10)
        // Portanto, a variável 'b' é inicializada com o valor 10.

        // Exibe o valor atual da variável 'b' no console
        System.out.println(b); // Imprime: 10

        // Comentário sobre a precedência dos operadores:
        // 1º Parênteses (): Controlam a ordem das operações, mas não são usados na expressão fornecida.
        // 2º Multiplicação e Divisão: São executados antes da adição e subtração. Na expressão, 2 * 2 é calculado antes de 6 +.
        // 3º Soma e Subtração: Executados após multiplicação e divisão. Na expressão, 6 + 4 é o resultado final.
    }
}
