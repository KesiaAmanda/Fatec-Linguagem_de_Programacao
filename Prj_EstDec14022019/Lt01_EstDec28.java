/**
 * Objetivo:        Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que:
					Venda Mensal		Preço Atual		Preço Novo
					(<500)				(<30)			(+10%)
					(>=500 e <1000)		(>=30 e <80)	(+15%)
					(>= 1000)			(>= 80) 		(- 5%)
					Obs.: para outras condições, preço novo será igual ao preço atual.

 * Programadora:    Kesia Amanda
 * Data:            16/02/2019
 */

import javax.swing.JOptionPane;

public class Lt01_EstDec28 
{
	public static void main (String[] args)
	{
		Double precAtual = Double.parseDouble(JOptionPane.showInputDialog("Informe o Preço atual do produto:"));
		int medMensal= Integer.parseInt(JOptionPane.showInputDialog("Informe a média de venda mensal do produto: "));
		
		if (medMensal>=100 && precAtual>=80)
		{
			JOptionPane.showMessageDialog(null, "O novo preço é " + (precAtual*0.95) + "!");
		}
		else if (medMensal>=500 && precAtual>=30)
		{
			JOptionPane.showMessageDialog(null, "O novo preço é " + (precAtual*1.15) + "!");
		}
		else if (medMensal<500 && precAtual<30)
		{
			JOptionPane.showMessageDialog(null, "O novo preço é " + (precAtual*1.1) + "!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Não houve alteração do preço!");
		}
	}
}
