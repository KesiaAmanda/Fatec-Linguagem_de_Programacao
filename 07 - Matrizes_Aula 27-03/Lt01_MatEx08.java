import javax.swing.JOptionPane;

/*
Objetivo:		Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos vendidos em 4 semanas. Calcular e exibir:
				a. A quantidade de cada produto vendido no mês;
				b. A quantidade de produtos vendidos por semana;
				c. O total de produtos vendidos no mês.
Programador:	Kesia Amanda
Data: 			28/03/2019
*/

public class Lt01_MatEx08 {
	public static void main (String[] args) {
		int matProdVendidos[][] = new int[4][3];
		int vetTotProd[] = new int[3];
		int vetTotSemana[] = new int[4];
		int valorTotal = 0;
		
		for (int linha = 0 ; linha<=3 ; linha++) {
			for (int coluna = 0 ; coluna <=2 ; coluna++) {
				matProdVendidos[linha][coluna]=Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do "+(coluna+1)+"º produto vendido na "+(linha+1)+"ª semana:"));
				valorTotal+=matProdVendidos[linha][coluna];
				vetTotProd[coluna]+=matProdVendidos[linha][coluna];
				vetTotSemana[linha]+=matProdVendidos[linha][coluna];
			}
		}
		
		for (int cont=0;cont<=2;cont++) {
			JOptionPane.showMessageDialog(null, "Total do "+(cont+1)+"º produto vendido no mês = "+vetTotProd[cont]);
		}
		
		for (int cont=0;cont<=3;cont++) {
			JOptionPane.showMessageDialog(null, "Total de produtos vendidos na "+(cont+1)+"ª semana = "+vetTotSemana[cont]);
		}
		
		JOptionPane.showMessageDialog(null, "Total de produtos vendidos no mês = "+valorTotal);
	}
}
