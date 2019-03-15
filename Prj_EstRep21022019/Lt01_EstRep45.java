/*
Objetivo:		Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
Programador:	Kesia Amanda
Data: 			22/02/2019
*/

public class Lt01_EstRep45 
{
	public static void main (String[] args)
	{
		int contLaco;
		double valorResul=0;
		
		for (contLaco=1;contLaco<=15;contLaco++)
		{
			if (contLaco%2==0)
			{
				valorResul-=contLaco/Math.pow(contLaco, 2);
				System.out.println(" - ");
			}
			else
			{
				valorResul+=contLaco/Math.pow(contLaco, 2);
				if (contLaco!=1) System.out.println(" + ");
			}
			
			System.out.println(contLaco+"/"+(contLaco*contLaco));
		}
		System.out.println(" = "+valorResul);
	}
}
