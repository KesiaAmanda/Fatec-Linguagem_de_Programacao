/*
Objetivo:		Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99.
Programador:	Kesia Amanda
Data: 			22/02/2019
*/

public class Lt01_EstRep42 
{
	public static void main (String[] args)
	{
		int cont; 
		double soma=1;
		
		for (cont=2;cont<=50;cont++)
		{
			System.out.println(cont+"/"+(2*cont-1));
			
			if (cont!=50) System.out.println(" + ");
			else System.out.println(" = ");
			
			soma+=cont/(2*cont-1);
		}
		
		System.out.println(soma);
	}
}