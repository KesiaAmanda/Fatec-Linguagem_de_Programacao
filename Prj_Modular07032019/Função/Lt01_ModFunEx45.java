package Função;
/*
Objetivo:		Calcule e mostre a série 1 - 2/4 + 3/9 - 4/16 + 5/25 - ... + 15/225
Programador:	Kesia Amanda
Data: 			02/03/2019
*/

public class Lt01_ModFunEx45 
{
	public static void main (String[] args)
	{
		System.out.println(Serie());
	}
	
	static String Serie()
	{
		double valorResul=1;
		String result = "1";
		
		for (int contLaco=2;contLaco<=15;contLaco++)
		{
			if (contLaco%2==0)
			{
				valorResul-=contLaco/Math.pow(contLaco, 2);
				result+=" - " + contLaco + "/" + Math.pow(contLaco, 2);
			}
			else
			{
				valorResul+=contLaco/Math.pow(contLaco, 2);
				result+=" + " + contLaco + "/" + Math.pow(contLaco, 2);
			}
		}
		result+= " = " + valorResul;
		return result;
	}
}
