// Declaração da classe pública chamada ClasseMath
public class ClasseMath {

    // Método principal, onde a execução do programa começa
    public static void main(String[] args) {

        // Gera um número pseudo-aleatório do tipo double entre 0.0 (inclusive) e 1.0 (exclusivo)
        // O método Math.random() retorna um valor do tipo double na faixa [0.0, 1.0), ou seja, maior ou igual a 0.0 e menor que 1.0
        double value = Math.random();

        // Exibe o valor gerado no console
        System.out.println(value);
    }
}
