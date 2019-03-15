/**
 * Objetivo:        Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. 
 * 					Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. 
 * 					Demais tipos não serão considerados.
 * Programadora:    Kesia Amanda
 * Data:            16/02/2019
 */

import javax.swing.JOptionPane;

public class Lt01_EstDec29 
{
	public static void main (String[] args)
	{
		int tipoInvest;
		
		do
		{
			tipoInvest = Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo do investimento: \n[1] = Poupança \n[2] = Renda Fixa"));
		}
		while ( tipoInvest!=1 && tipoInvest!=2 );
		
		double valorInvest = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do investimento"));
		
		if (tipoInvest==1)
		{
			JOptionPane.showMessageDialog(null, "Valor corrigido em 30 dias [Poupança] " + (valorInvest*1.03));
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Valor corrigido em 30 dias [Renda Fixa]" + (valorInvest*1.05));
		}
	}
}
