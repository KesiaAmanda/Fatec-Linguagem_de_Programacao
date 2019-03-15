/**
 * Objetivo:        Exemplo de Estrutura de Decisão Encadeada
 * Programadora:    Kesia
 * Data:            14/02/2019
 */

import javax.swing.JOptionPane;

public class Lt01_EstDecEncadeada 
{
    public static void main (String args[])
    {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade"));
        
        if (idade>=18)
        {
            JOptionPane.showMessageDialog(null, "Pode Votar e dirigir!");
        }
        else if (idade>=16)
        {
            JOptionPane.showMessageDialog(null, "Pode Votar, \nPorem não dirigir!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Não pode votar e dirigir!");
        }
    }
}
