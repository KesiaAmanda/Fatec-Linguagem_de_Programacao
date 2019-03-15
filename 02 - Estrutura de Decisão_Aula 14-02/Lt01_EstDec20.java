/**
 * Objetivo:        20)	Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0. 
 *                  Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
 * Programadora:    Kesia
 * Data:            14/02/2019
 */

import javax.swing.JOptionPane;

public class Lt01_EstDec20 
{
    public static void main (String args[])
    {
        int coefA = Integer.parseInt(JOptionPane.showInputDialog("Informe o coeficiente A:"));
        int coefB = Integer.parseInt(JOptionPane.showInputDialog("Informe o coeficiente B:"));
        int coefC = Integer.parseInt(JOptionPane.showInputDialog("Informe o coeficiente C:"));
        
        int valorDelta = ((coefB*coefB)-4*coefA*coefC);
        
        if (valorDelta>0)
        {
            JOptionPane.showMessageDialog(null,"Existem duas raizes reais e elas são: " + ((-coefB)+Math.sqrt(valorDelta)/2*coefA) + "e" + ((-coefB)-Math.sqrt(valorDelta)/2*coefA) );
        }
        else if (valorDelta==0)
        {
            JOptionPane.showMessageDialog(null,"Existe apanas uma raiz e ela é :" + ((-coefB)+Math.sqrt(valorDelta)/2*coefA));
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Delta Negativo, não existem raizes!");
        }
        
    }
}
