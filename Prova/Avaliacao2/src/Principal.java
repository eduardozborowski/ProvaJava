
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) throws Exception {
    /*Crie sistema que simule uma folha de pagamento de uma empresa. Nesta empresa existem 2 tipos de Empregado, o Assalariado (salário fixo por mês) e Horista (
    recebe por horas trabalhadas). Criar uma Classe principal que permita o usuário
    cadastrar vários empregados (4 no mínimo) podendo escolher, a cada novo cadastro
    de empregado, entre assalariado ou horista. Após selecionar o tipo de empregado o
    usuário deve preencher os campos de forma adequada a opção selecionada (nome
    e salário para assalariado / nome, valor por hora e horas trabalhadas para horista).
    Por fim, o sistema deve imprimir o gasto total da empresa com a folha de pagamento dos funcionários.
    */      
        Empregado[] empregados = new Empregado[4];
        int opcao = 0;
        int contador = 0;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Assalariado\n2 - Horista\n3 - Sair"));
            switch (opcao) {
                case 1:
                    String nome = JOptionPane.showInputDialog("Nome");
                    double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário"));
                    empregados[contador] = new Assalariado(nome, salario);
                    contador++;
                    break;
                case 2:
                    nome = JOptionPane.showInputDialog("Nome");
                    double valorHora = Double.parseDouble(JOptionPane.showInputDialog("Valor por hora"));
                    double horasTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog("Horas trabalhadas"));
                    empregados[contador] = new Horista(nome, valorHora, horasTrabalhadas);
                    contador++;
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }
        } while (opcao != 3);
        double total = 0;
        for (int i = 0; i < contador; i++) {
            total += empregados[i].calcularSalario();
        }
        JOptionPane.showMessageDialog(null, "Total: " + total);
    }
}