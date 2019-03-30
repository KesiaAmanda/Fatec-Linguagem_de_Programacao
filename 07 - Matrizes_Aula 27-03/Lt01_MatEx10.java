/*
Objetivo:		Criar uma matriz [8][8] onde o programa irá carregar segundo:
Programador:	Kesia Amanda
Data: 			28/03/2019
*/

public class Lt01_MatEx10 {
	public static void main (String[] args) {
		long matValores[][] = new long[8][8];
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
			if (linha%2==0) {
				System.out.print("Casa: ");
			}else {
				System.out.print("Valor: ");
			}
			for (int coluna=0;coluna<=7;coluna++) {
				System.out.print(" "+ matValores[linha][coluna]);
			}
			System.out.print("\n");
		}
	}

}
