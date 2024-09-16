import java.util.Scanner;

class Produto {
    String nome;
    float preco;
    int qtdEstoque;

    public Produto(String nome, float preco, int qtdEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public int alteraPreco(float porcentagem) {
        if (porcentagem > -100) {
            float temp = 1 + porcentagem / 100;
            this.preco = this.preco * temp;
            return 0;
        } else {
            return -1;
        }
    }

    public void exibirProduto() {
        System.out.println("Produto: " + this.nome);
        System.out.println("Preço: R$ " + this.preco);
        System.out.println("Estoque: " + this.qtdEstoque);
    }
}

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto[] produtos = new Produto[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("\nInforme o nome, o preço e a quantidade em estoque do produto " + (i + 1) + ":");
            String nome = scanner.next();
            float preco = scanner.nextFloat();
            int qtdEstoque = scanner.nextInt();
            produtos[i] = new Produto(nome, preco, qtdEstoque);
        }

        System.out.println("\nAumentando o preço em 10% do produto 1 e 3");
        if (produtos[0].alteraPreco(-110) == -1) {
            System.out.println("\nErro: preço do produto 1 não alterado. Porcentagem inválida");
        }
        produtos[2].alteraPreco(10);

        System.out.println("\nReduzindo o preço em 5% do produto 2");
        if (produtos[1].alteraPreco(-5) == -1) {
            System.out.println("\nErro: preço do produto 2 não alterado. Porcentagem inválida");
        } else {
            System.out.println("\nPreço do produto 2 alterado com sucesso");
        }

        System.out.println("\nAlterando o preço do produto 4");
        if (produtos[3].alteraPreco(-110) == -1) {
            System.out.println("\nErro: preço do produto 4 não alterado. Porcentagem inválida");
        }

        System.out.println("\nProdutos Cadastrados:");
        for (Produto produto : produtos) {
            produto.exibirProduto();
            System.out.println();
        }
    }
}
