/**
 * Objetivo:        Exemplo de Estrutura de Decisão Composta
 * Programadora:    Kesia
 * Data:            14/02/2019
 */

import javax.swing.JOptionPane;

public class Lt01_EstDecComposta 
{
    public static void main (String args[])
    {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
        
        if (idade >= 18)
        {
            JOptionPane.showMessageDialog(null,"Maior de Idade!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Menor de Idade");
        }
    }
}
