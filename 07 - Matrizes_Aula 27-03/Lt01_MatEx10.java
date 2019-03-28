/*
Objetivo:		Criar uma matriz [8][8] onde o programa irá carregar segundo:
Programador:	Kesia Amanda
Data: 			28/03/2019
*/

public class Lt01_MatEx10 {
	public static void main (String[] args) {
		int matValores[][] = new int[8][8];
		int casa = 0, valor = 1;
		for (int linha=0;linha<=7;linha++) {
			if (linha%2==0) {
				for (int coluna=0;coluna<=7;coluna++) {
					casa++;
					matValores[linha][coluna]=casa;
				}
			}else {
				for (int coluna=0;coluna<=7;coluna++) {
					matValores[linha][coluna]=valor;
					valor+=valor;
				}
			}
			
		}
		
		for (int linha=0;linha<=7;linha++) {
			for (int coluna=0;coluna<=7;coluna++) {
				System.out.println(" "+ matValores[linha][coluna]);
			}
			System.out.println("\n");
		}
	}

}
