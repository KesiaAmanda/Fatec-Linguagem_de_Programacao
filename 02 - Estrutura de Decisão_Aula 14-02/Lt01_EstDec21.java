/**
 * Objetivo:        Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. 
 *                  Mostre a mensagem de acordo com a média:
                        a. Se a média for >= 6,0 exibir “APROVADO”;
                        b. Se a média for >= 3,0 ou MENOR; 6,0 exibir “EXAME”;
                        c. Se a média for menor 3,0 exibir “RETIDO”.

 * Programadora:    Kesia
 * Data:            14/02/2019
 */

import javax.swing.JOptionPane;

public class Lt01_EstDec21 
{
    public static void main (String args[])
    {
        double media = 0;
        int cont;
        
        for (cont=0;cont<=3;cont++)
        {
            media+= Integer.parseInt(JOptionPane.showInputDialog("Informe "+(cont+1)+"ª nota:"));
        }
        
        media = media/4;
        
        if (media>=6) 
        {
            JOptionPane.showMessageDialog(null, "APROVADO");
        }
        else if (media>=3)
        {
            JOptionPane.showMessageDialog(null, "EXAME");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "RETIDO");
        }
    }
}
