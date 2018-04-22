/**
 * Created by Carlos Schuenck on 22/04/2018.
 */
import javax.swing.*;
import java.awt.*;

public class Questao8 {
    /**
     * Método responsável por gerar o numbero correspondente a letra C
     * @param a - Valor correspondente a letra A
     * @param b - Valor correspondente a letra B
     * @return int - Retorna um numero inteiro correspondente a letra C
     */
    public static int createNumberC(String a, String b) {
        StringBuilder c = new StringBuilder();
        int maxSize = Math.max(a.length(), b.length());
        for (int i = 0; i <= maxSize; i++) {
            if (i < a.length()) {
                c.append(a.charAt(i));
            }
            if (i < b.length()) {
                c.append(b.charAt(i));
            }
        }
        return c.length() > 6 ? -1 : Integer.valueOf(c.toString());
    }

    /**
     * Método responsável por abrir um popup para o usuário inputar os valores correspondente a letra A e B
     * @param message - Mensagem a ser exibida, solicitando o valor de A ou B
     * @return String
     */
    private static String readNumber(String message) {
        return JOptionPane.showInputDialog(message);
    }

    /**
     * Método responsável por validar os valores informados paara A e B
     * @param a - Valor correspondente a letra A
     * @param b - Valor correspondente a letra B
     * @return boolean - Retorna um boolean onde false corresponde a um erro e true corresponde a nenhum erro.
     */
    private static boolean validateNumbers(String a, String b) {
        if (a == null || b == null) {
            JOptionPane.showMessageDialog(null,"É obrigatório informar o número A e B.");
            return false;
        }

        try {
            Integer.parseInt(a);
            Integer.parseInt(b);
            return true;
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null,"O valor informado em A e/ou B são inválidos.");
            return false;
        }
    }

    public static void main(String[] args) {
        final String a = readNumber(" Informe o numero de A: ");
        final String b = readNumber(" Informe o numero de B: ");

        if (validateNumbers(a, b)) {
            System.out.println("O número C gerado é: " + createNumberC(a, b));
            JOptionPane.showMessageDialog(null, "O número C gerado é: " + createNumberC(a, b));
        }
    }
}
