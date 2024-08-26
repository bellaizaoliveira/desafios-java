public class Metodos { // Define uma classe pública chamada Metodos.

    public static void main(String[] args) { // O ponto de entrada principal para a aplicação Java. É onde o código começa a ser executado.
        
        // Chama o método productList passando os parâmetros na ordem correta.
        productList("Laranja", 12.20); // Corrigido para passar os parâmetros diretamente.
        productList("Morango", 10.50); // Corrigido para passar os parâmetros diretamente.
    }
    
    // Define um método estático chamado productList que recebe dois parâmetros: productName e productValue.
    public static void productList(String productName, Double productValue) { 

        // Exibe o nome e o valor do produto no console.
        System.out.println(productName + " - " + productValue); 
    }
}
