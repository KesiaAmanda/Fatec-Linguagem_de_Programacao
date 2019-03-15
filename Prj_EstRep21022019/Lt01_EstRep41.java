/*
Objetivo:		Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
Programador:	Kesia Amanda
Data: 			22/02/2019
*/


public class Lt01_EstRep41 
{
	public static void main (String[] args)
	{
		int valorD1, valorD2;
		
		for (valorD1=1;valorD1<=7;valorD1++)
		{
			for (valorD2=1;valorD2<=7;valorD2++)
			{
				if (valorD1+valorD2==7)
				{
					System.out.println(valorD1+" + "+valorD2+" = 7");
				}
			}
		}
	}
}
