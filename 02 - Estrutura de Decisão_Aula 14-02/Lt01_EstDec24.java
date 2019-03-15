/**
 * Objetivo:        Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
 * Programadora:    Kesia Amanda
 * Data:            16/02/2019
 */

import javax.swing.JOptionPane;

public class Lt01_EstDec24 
{
	public static void main (String[] args)
	{
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));
		
		if ( valor%2 == 0 && valor%3 ==0 )
		{
			JOptionPane.showMessageDialog(null, valor + " é divisível por 2 e 3!");
		}
		else if ( valor%2 == 0 )
		{
			JOptionPane.showMessageDialog(null, valor + " é divisível por 2 e não é divisível por 3!");
		}
		else if ( valor%3 == 0 )
		{
			JOptionPane.showMessageDialog(null, valor + " é divisível por 3 e não é divisível por 2!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, valor + " não é divisível por 2 e 3!");
		}
	}
}
