package Função;

/*
Objetivo: 		Calcule e mostre o quadrado dos numeros entre 10 e 150.
Programador:	Kesia Amanda
Data:			07/03/2019
*/

public class Lt01_ModFunEx31 {
	public static void main (String[] args)
	{
		for (int cta=10 ; cta<=150 ; cta++) 
		{
			System.out.println(cta + "² = " + FuncQuadrado(cta));;
		}
	}
	
	static int FuncQuadrado(int num)
	{
		return num*num;
	}
}
