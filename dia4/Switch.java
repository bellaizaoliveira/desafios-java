import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário.

public class Switch { // Define a classe principal do programa.
    public static void main(String[] args) { // Método principal onde a execução do programa começa.
        System.out.print("Digite o nome do produto "); // Solicita ao usuário que digite o nome do produto, exibindo uma mensagem sem pular linha.

        Scanner s = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário a partir do console.

        String nomeProduto = s.next().toLowerCase(); // Lê o próximo token da entrada do usuário, converte para minúsculas e o armazena na variável nomeProduto.

        // O comando 'switch' deve estar em minúsculas; 'Switch' está incorreto.
        switch (nomeProduto) { // Compara o valor da variável nomeProduto com os casos definidos.
            case "morango": // Se nomeProduto for "morango":
                System.out.println("R$9,50"); // Imprime o preço do morango.
                break; // Encerra o bloco do caso "morango" para evitar a execução dos casos subsequentes.

            case "manga": // Se nomeProduto for "manga":
                System.out.println("R$12,80"); // Imprime o preço da manga.
                break; // Encerra o bloco do caso "manga".

            case "uva": // Se nomeProduto for "uva":
                System.out.println("R$9,80"); // Imprime o preço da uva.
                break; // Encerra o bloco do caso "uva".

            default: // Opcional, pode ser usado para lidar com casos que não se encaixam em nenhum dos casos definidos.
                System.out.println("Produto não encontrado"); // Mensagem exibida se o produto não estiver em nenhum dos casos.
                break;
        }

        s.close(); // Fecha o Scanner para liberar o recurso.
    }
}
