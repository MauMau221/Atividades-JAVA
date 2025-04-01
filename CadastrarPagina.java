import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String nomePagina, url;
        int ano, anoAtual;
        String dominioCompleto;

        // Entrada de dados
        nomePagina = JOptionPane.showInputDialog("Digite o nome da página:");
        url = JOptionPane.showInputDialog("Digite a URL da página (ex: /contato.html):");
        ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de criação da página:"));

        // Mostra os dados da página
        mostrarDados(nomePagina, url, ano);

        // Chama método que retorna o domínio completo
        dominioCompleto = gerarDominio(url);
        JOptionPane.showMessageDialog(null, "Endereço completo da página: " + dominioCompleto);

        // Obtém o ano atual
        anoAtual = obterAno();
        JOptionPane.showMessageDialog(null, "O ano atual é: " + anoAtual);
    }
// Método para mostrar os dados da página (não retorna nada)
    private static void mostrarDados(String nome, String url, int ano) {
        JOptionPane.showMessageDialog(null, "Página cadastrada:\nNome: " + nome + "\nURL: " + url + "\nAno de criação: " + ano);
    }

    // Método que retorna o domínio completo
    private static String gerarDominio(String url) {
        return "www.exemplo.com" + url;
    }

    // Método que retorna o ano atual
    private static int obterAno() {
        return 2025;
    }
}