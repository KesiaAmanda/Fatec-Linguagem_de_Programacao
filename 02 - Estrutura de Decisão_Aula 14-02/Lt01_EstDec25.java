/**
 * Objetivo:        Receba a hora de in�cio e de final de um jogo (HH,MM), calcular o tempo do jogo em horas e minutos, 
 * 					sabendo que o tempo m�ximo � menor que 24 horas e pode come�ar num dia e terminar noutro.
 * Programadora:    Kesia Amanda
 * Data:            16/02/2019
 */

import javax.swing.JOptionPane;

public class Lt01_EstDec25 
{
	public static void main (String[] args)
	{
		int horaInicio = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora de in�cio do jogo: "));
		int minInicio = Integer.parseInt(JOptionPane.showInputDialog("Informe os minutos de inicio do jogo: "));
		int horaFinal = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora de termino do jogo: "));
		int minFinal = Integer.parseInt(JOptionPane.showInputDialog("Informe os minutos de termino do jogo: "));

		int minTotal = minFinal - minInicio;
		int horaTotal = horaFinal - horaInicio;
		
		if (minTotal<0)
		{
			minTotal=minTotal+60;
		}
		if (horaTotal<0)
		{
			horaTotal=horaTotal+24;
		}
		
		
		if (horaTotal>=24)
		{
			JOptionPane.showMessageDialog(null, "O tempo m�ximo de jogo � menor que 24 horas!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Tempo total de jogo:  " + horaTotal + " horas e " + minTotal + " minutos!");
		}
		
	}
}