/**
 * Objetivo:        Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). 
 * 					Calcule e mostre a velocidade média em km/h.
 * Programadora:    Kesia Amanda
 * Data:            16/02/2019
 */

import javax.swing.JOptionPane;

public class Lt01_EstDec27 
{
	public static void main (String[] args)
	{
		int valorVoltas = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero de voltas: "));
		int valorMetros = Integer.parseInt(JOptionPane.showInputDialog("Informe a extensão do circuito (em metros): "));
		Double valorTempo = Double.parseDouble(JOptionPane.showInputDialog("Informe o tempo de duração (minutos:)"));
		
		JOptionPane.showMessageDialog(null, "A Velocidade media desse circuito foi de " + (((valorMetros*valorVoltas)/(valorTempo*60))*3.6) + " Km/h.");
	}
}
