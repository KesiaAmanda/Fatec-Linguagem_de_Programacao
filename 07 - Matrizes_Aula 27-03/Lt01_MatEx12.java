import javax.swing.JOptionPane;

/*
Objetivo:		Carregar códigos das peças em um tabuleiro de xadrez, onde:
				[1]Peão,[2]Torre,[3]Bispo,[4]Cavalo,[5]Rainha,[6]Rei,[7]Vazio.
				Calcular e mostrar a soma das peças do tabuleiro.
				Não pode utilizar estrutura de decisão e Escolha Caso na contagem das peça
Programador:	Kesia Amanda
Data: 			28/03/2019
*/

public class Lt01_MatEx12 {
	public static void main (String[] args) {
		int matXadres[][] = new int[8][8];
		int vetTotPecas[] = new int [7];
		
		for (int linha=0;linha<=7;linha++) {
			for (int coluna=0;coluna<=7;coluna++) {
				matXadres[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Informe o código da peça de 1 a 7: "));
				vetTotPecas[(matXadres[linha][coluna]-1)]++;
			}
		}
		
		for (int cont=0;cont<=6;cont++) {
			System.out.println(vetTotPecas[cont]);
		}
	}

}
