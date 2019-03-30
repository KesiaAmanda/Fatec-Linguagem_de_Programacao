import javax.swing.JOptionPane;

/*
Objetivo:		Criar e carregar uma matriz [4][4] com valores aleatórios, sendo que a
				diagonal principal terá seus dados carregados no programa segundo:
Programador:	Kesia Amanda
Data: 			28/03/2019
*/

public class Lt01_MatEx09 {
	public static void main (String[] args) {
		double matValores[][] = new double [4][4];
		matValores=CarregaMatriz(matValores);
		MostraMatriz(matValores);
	}

	static double[][] CarregaMatriz(double mat[][]){
		for (int linha=0;linha<=3;linha++) {
			for (int coluna=0;coluna<=3;coluna++) {
				if (linha==coluna) {
					mat[linha][coluna]=Math.pow(4, linha);
				}else {
					mat[linha][coluna]=Integer.parseInt(JOptionPane.showInputDialog("Informe um valor:"));
				}
			}
		}
		return mat;
	}
	
	static void MostraMatriz(double matValores[][]) {
		for (int linha=0;linha<=3;linha++) {
			for (int coluna=0;coluna<=3;coluna++) {
				System.out.print(" "+ matValores[linha][coluna]);
			}
			System.out.print("\n");
		}
	}
}