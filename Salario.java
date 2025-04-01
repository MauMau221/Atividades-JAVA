
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String nome, cargo;
        double salario;
        double novoSalario;

        nome = JOptionPane.showInputDialog("Digite sue nome:");
        cargo = JOptionPane.showInputDialog("Digite seu cargo:");

        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salario: "));

        if (cargo.equalsIgnoreCase("gerente")) {
            novoSalario = salario + (salario * 0.15);
            JOptionPane.showMessageDialog(null, nome + " seu salario sofreu um reajuste de: " + salario + " para: " + novoSalario + "  parabens !!!");
        }
        if (cargo.equalsIgnoreCase("vendedor")) {
            novoSalario = salario + (salario * 0.08);
            JOptionPane.showMessageDialog(null, nome + " seu salario sofreu um reajuste de: " + salario + " para: " + novoSalario + "  parabens !!!");
        }else{
            novoSalario = salario + (salario * 0.03);
            JOptionPane.showMessageDialog(null, nome + " seu salario sofreu um reajuste de: " + salario + " para: " + novoSalario + "  parabens !!!");
        }

    }
}


//Crie janelas para solicitar o nome, o salario e o cargo de um funcionario (Pode ser gerente, vendedor ou outros).
//Reajustar conforme os criterios a seguir.
//Se o cargo for gerente, aumentar o salario em 15%.
//Senão, se o cargo for vendedor, aumentar o salario em 8%.
//Senão, se for qualquer outro cargo aumentar o salário em 3%.
//Exibir o salário reajustado em uma janela com o noome do funcionario 




import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        float opcao;
        double result;
        double num1, num2;

        do {
            num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
            num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));

            opcao = Float.parseFloat(JOptionPane.showInputDialog("\n\tMenu de opções "
                    + "\n1.Adicao "
                    + "\n2.Subtracao "
                    + "\n3.Multiplicacao "
                    + "\n4.Divisao " + "\n0.Sair "));
            if(opcao == 1){
                result = num1 + num2; 
                Double.parseDouble(JOptionPane.showInputDialog("A adicao dos numeros resulta em: " + result ));
            }
            if(opcao == 2){
                result = num1 - num2; 
                Double.parseDouble(JOptionPane.showInputDialog("A subtracao dos numeros resulta em: " + result ));
            }
            if(opcao == 3){
                result = num1 * num2; 
                Double.parseDouble(JOptionPane.showInputDialog("A multiplicacao dos numeros resulta em: " + result ));
            }
            if(opcao == 4){
                result = num1 / num2; 
                Double.parseDouble(JOptionPane.showInputDialog("A divisao dos numeros resulta em: " + result ));
            }           
        } while (opcao != 0);
        JOptionPane.showInputDialog("Programa Finalizado");

    }
}

//Desenvolver um programa que implemente uma calculadora com as 4 operações basicas utilizando if e do-while via janelas(JOption)


