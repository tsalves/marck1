import javax.swing.*;

public class Calculadora {
    public static void main(String[] args) {
        Integer num1;
        Integer num2;
        Integer opcao;
        Integer novo = 1;


        while (novo <= 1) {
            novo = Integer.parseInt(JOptionPane.showInputDialog("Deseja realizar um calculo? \n [1] SIM\n [0] NÃO"));
            if (novo < 0 || novo > 1) {
                JOptionPane.showMessageDialog(null, "OPS! Opção Invalida!");
                break;
            } else if (novo == 0) {
                JOptionPane.showMessageDialog(null, "Obrigado por usar um de nossos programas");
                break;
            } else {
                num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 1º numero da operação: "));
                num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 2º numero da operação: "));

                opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha a operação que deseja efetuar? \n [0] Soma\n [1] Subtração\n [2] Multiplicação\n [3] Divisão"));

                if (opcao == 0) {
                    sum(num1, num2);
                } else if (opcao == 1) {
                    subtracao(num1, num2);
                } else if (opcao == 2) {
                    multiplicacao(num1, num2);
                } else if (opcao == 3) {
                    divisao(num1, num2);
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possivel efetuar a operação desejada, tente novamente mais tarde");
                }
            }

        }


    }

    public static void sum(int x, int y) {
        JOptionPane.showMessageDialog(null, "O resultado da soma e: " + (x + y));
    }

    public static void subtracao(int x, int y) {
        JOptionPane.showMessageDialog(null, "O resultado da subtração e: " + (x - y));
    }

    public static void multiplicacao(int x, int y) {
        JOptionPane.showMessageDialog(null, "O resultado da multiplicação e: " + (x * y));
    }

    public static void divisao(int x, int y) {
        JOptionPane.showMessageDialog(null, "O resultado da multiplicação e: " + (x / y));
    }

}
