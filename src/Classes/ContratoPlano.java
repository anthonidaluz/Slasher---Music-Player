package Classes;

import javax.swing.*;

public class ContratoPlano {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            String[] opcoes = {"Slasher Basic", "Slasher Premium", "Slasher Gold"};
            int escolha = JOptionPane.showOptionDialog(null, "Selecione um plano:", "Contratar Plano",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

            switch (escolha) {
                case 0:
                    contratarPlanoBasic();
                    break;
                case 1:
                    contratarPlanoPremium();
                    break;
                case 2:
                    contratarPlanoGold();
                    break;
                default:
                    break;
            }
        });
    }

    public static void contratarPlanoBasic() {
        realizarPagamento("Slasher Basic");
        JOptionPane.showMessageDialog(null, "Plano Slasher Basic contratado!");
    }

    public static void contratarPlanoPremium() {
        realizarPagamento("Slasher Premium");
        JOptionPane.showMessageDialog(null, "Plano Slasher Premium contratado!");
    }

    public static void contratarPlanoGold() {
        realizarPagamento("Slasher Gold");
        JOptionPane.showMessageDialog(null, "Plano Slasher Gold contratado!");
    }

    public static void realizarPagamento(String plano) {
        String[] opcoesPagamento = {"Cartão de Crédito", "PIX", "Boleto Bancário"};
        int escolhaPagamento = JOptionPane.showOptionDialog(null, "Selecione a forma de pagamento:", "Slasher - Pagamento",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoesPagamento, opcoesPagamento[0]);

        switch (escolhaPagamento) {
            case 0:
                realizarPagamentoCartao(plano);
                break;
            case 1:
                realizarPagamentoPix(plano);
                break;
            case 2:
                realizarPagamentoBoleto(plano);
                break;
            default:
                break;
        }
    }

    public static void realizarPagamentoCartao(String plano) {
        JOptionPane.showMessageDialog(null, "Pagamento com cartão realizado para o plano: " + plano);
    }

    public static void realizarPagamentoPix(String plano) {
        // Gerar código QR para pagamento via PIX
        JOptionPane.showMessageDialog(null, "Pagamento com Pix realizado para o plano: " + plano);
    }

    public static void realizarPagamentoBoleto(String plano) {
        // Gerar código de barras para pagamento via boleto
        JOptionPane.showMessageDialog(null, "Boleto gerado para o plano: " + plano);
    }
}
