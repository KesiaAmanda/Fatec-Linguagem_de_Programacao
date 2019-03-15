/**
 * Objetivo:        Receba a data de nascimento e atual em ano, mês e dia. Calcule e mostre a 
 * 					idade em anos, meses e dias, considerando os anos bissextos.
 * Programadora:    Kesia Amanda
 * Data:            16/02/2019
 */

import javax.swing.JOptionPane;

public class Lt01_EstDec30 
{
	public static void main (String[] args)
	{		
		int diaAtual = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia atual: "));
		int mesAtual = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês atual: "));
		int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano atual: "));
		int diaNasc = Integer.parseInt(JOptionPane.showInputDialog("Informe o seu dia de nascimento: "));
		int mesNasc = Integer.parseInt(JOptionPane.showInputDialog("Informe o seu mês de nascimento: "));
		int anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Informe o seu ano de nascimento: "));
		
		int difDia = diaAtual - diaNasc;
		int difMes = mesAtual - mesNasc;
		int difAno = anoAtual - anoNasc;
		
		int mesPassado = 0;
		
		if (difDia<0)
		{
			
		}
		
	}
}
