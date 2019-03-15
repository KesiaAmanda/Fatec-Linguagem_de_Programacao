package Procedimento;
/**
 * Objetivo:        Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que:
					Venda Mensal		Preço Atual		Preço Novo
					(<500)				(<30)			(+10%)
					(>=500 e <1000)		(>=30 e <80)	(+15%)
					(>= 1000)			(>= 80) 		(- 5%)
					Obs.: para outras condições, preço novo será igual ao preço atual.

 * Programadora:    Kesia Amanda
 * Data:            02/03/2019
 */

import javax.swing.JOptionPane;

public class Lt01_ModProcEx28 
{
	static Double precAtual;
	static Integer medMensal;
	static String result;
	
	public static void main (String[] args)
	{
		precAtual = Double.parseDouble(JOptionPane.showInputDialog("Informe o Preço atual do produto:"));
		medMensal= Integer.parseInt(JOptionPane.showInputDialog("Informe a média de venda mensal do produto: "));
		
		NewPrice();
		
		JOptionPane.showMessageDialog(null, result);

	}
	
	static void NewPrice()
	{
		if (medMensal>=100 && precAtual>=80)
		{
			result = "O novo preço é " + (precAtual*0.95) + "!";
		}
		else if (medMensal>=500 && precAtual>=30)
		{
			result = "O novo preço é " + (precAtual*1.15) + "!";
		}
		else if (medMensal<500 && precAtual<30)
		{
			result = "O novo preço é " + (precAtual*1.1) + "!";
		}
		else
		{
			result = "Não houve alteração do preço!";
		}
	}
}
