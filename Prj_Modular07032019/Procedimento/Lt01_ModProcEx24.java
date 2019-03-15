package Procedimento;
/**
 * Objetivo:        Receba um valor inteiro. Verifique e mostre se é divisivel por 2 e 3.
 * Programadora:    Kesia Amanda
 * Data:            02/03/2019
 */

import javax.swing.JOptionPane;

public class Lt01_ModProcEx24 
{
	static Integer valorLeitura;
	static String resultado;
	
	public static void main (String[] args)
	{
		valorLeitura = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));
		
		DivPor2();
		DivPor3();
		
		JOptionPane.showMessageDialog(null, resultado);
	}
	
	static void DivPor2()
	{
		if (valorLeitura%2==0)
		{
			resultado = "[" + valorLeitura + "]" + " é divisível por 2 e ";
		}else {
			resultado = "[" + valorLeitura + "]" + " não é divisível por 2 e ";
		}
	}
	
	static void DivPor3() 
	{
		if (valorLeitura%3==0)
		{
			resultado+= "é divisível por 3!";
		}else {
			resultado+= "não é divisível por 3!";
		}
	}
}
