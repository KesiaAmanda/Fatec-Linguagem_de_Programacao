package Função;
/*
Objetivo:		Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
				Casa: 1 2 3 4 ... 64
				Qdte: 1 2 4 8 ... N
Programador:	Kesia Amanda
Data: 			02/03/2019
*/

public class Lt01_ModFunEx39 
{
	public static void main (String[] args)
	{
		System.out.println(FuncTabu());
	}
	
	static String FuncTabu() 
	{
		long valorQtd=1;
		String Casa = "Casa: ", Qdte = "Qdte: ";
		
		for (int valorCasa=1;valorCasa<=64;valorCasa++)
		{
			Casa+=valorCasa + " ";
			Qdte+=valorQtd + " ";
			valorQtd+=valorQtd;
		}
		
		Casa+="\n"+Qdte;
		return Casa;
	}
}
