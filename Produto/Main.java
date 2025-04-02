import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        Produto dados = new Produto();

        dados.nome = JOptionPane.showInputDialog("Digite o nome do produto: ");
        dados.preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco do produto"));

        ProdutoDAO pedido = new ProdutoDAO();
        pedido.mostrarProduto(dados.nome, dados.preco);

        JOptionPane.showMessageDialog(null, pedido.mostrarProduto(dados.nome, dados.preco));

    }
}

//Crie um programa em java que simule o cadastro de um produto em um "banco de dados" ficticio, com as seguintes regras:
//O programa deve ter 3 classes:
//Produto: Com os atributos nome e preco publicos (sem nenhum metodo)
//ProdutoDAO: com dois métodos:
//salvarProduto: Simula o salvamento (exibe uma mensagem) não ser static
//listarProduto: Exibe os dados do produto (exibe os dados do produto) não ser static
//Principal: onde está o metodo main, que pergunta os dados do Produto ao usuário e chama os métodos da DAO

//Não use this, getters ou setters. Use apenas instâncias, atributos públicos e métodos simples

