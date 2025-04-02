public class ProdutoDAO {

    public String salvarProduto() {
        String mensagem;
        mensagem = ("Produto salvo com sucesso");
        return mensagem;
    }
    
    public String mostrarProduto(String nome, double preco) {
        
        return ("O nome do produto e: " +nome+ "  | E preco do produto e : " + preco);
    }

}
