package Procedimento;
/**
 * Objetivo:        Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). 
 * 					Calcule e mostre a velocidade média em km/h.
 * Programadora:    Kesia Amanda
 * Data:            02/03/2019
 */

import javax.swing.JOptionPane;

public class Lt01_ModProcEx27 
{
	static Integer valorVoltas, valorMetros;
	static Double valorTempo;
	static String result;
	
	public static void main (String[] args)
	{
		valorVoltas = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero de voltas: "));
		valorMetros = Integer.parseInt(JOptionPane.showInputDialog("Informe a extensão do circuito (em metros): "));
		valorTempo = Double.parseDouble(JOptionPane.showInputDialog("Informe o tempo de duração (minutos:)"));
		
		AverageSpeed();
		
		JOptionPane.showMessageDialog(null, result);
	}
	
	static void AverageSpeed()
	{
		result = "A Velocidade média desse circuito foi de " + (((valorMetros*valorVoltas)/(valorTempo*60))*3.6) + " Km/h.";
	}
}
