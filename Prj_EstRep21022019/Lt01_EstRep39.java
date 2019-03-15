/*
Objetivo:		Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
				Casa: 1 2 3 4 ... 64
				Qdte: 1 2 4 8 ... N
Programador:	Kesia Amanda
Data: 			22/02/2019
*/

public class Lt01_EstRep39 
{
	public static void main (String[] args)
	{
		int valorCasa; 
		long valorQtd=1;
		
		for (valorCasa=1;valorCasa<=64;valorCasa++)
		{
			System.out.println("Casa :"+valorCasa+" Qtd: "+ valorQtd);
			valorQtd+=valorQtd;
		}
	}
}
