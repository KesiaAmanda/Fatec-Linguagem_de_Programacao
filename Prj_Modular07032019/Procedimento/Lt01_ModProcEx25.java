package Procedimento;
/**
 * Objetivo:        Receba a hora de início e de final de um jogo (HH,MM), calcular o tempo do jogo em horas e minutos, 
 * 					sabendo que o tempo máximo é menor que 24 horas e pode começar num dia e terminar noutro.
 * Programadora:    Kesia Amanda
 * Data:            02/03/2019
 */

import javax.swing.JOptionPane;

public class Lt01_ModProcEx25 
{
	static Integer horaTotal = 0, horaInicio, minInicio, horaFinal, minFinal, minTotal, difHora;
	
	public static void main (String[] args)
	{		
		horaInicio = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora de início do jogo: "));
		minInicio = Integer.parseInt(JOptionPane.showInputDialog("Informe os minutos de inicio do jogo: "));
		horaFinal = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora de termino do jogo: "));
		minFinal = Integer.parseInt(JOptionPane.showInputDialog("Informe os minutos de termino do jogo: "));
		
		
		TotalMinutos();
		TotalHoras();
		
		if (horaTotal>=24)
		{
			JOptionPane.showMessageDialog(null, "O tempo máximo de jogo é menor que 24 horas!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Tempo total de jogo:  " + horaTotal + " hora(s) e " + minTotal + " minuto(s)!");
		}
		
	}
	
	static void TotalMinutos() 
	{
		minTotal = minFinal - minInicio;
		
		if (minTotal<0)
		{
			minTotal=minTotal+60; 
		}
	}
	
	static void TotalHoras()
	{
		horaTotal = horaFinal - horaInicio;
		
		if (horaTotal<0)
		{
			horaTotal=horaTotal+24;
		}
		
	}
}