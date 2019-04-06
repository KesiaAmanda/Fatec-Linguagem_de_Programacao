import javax.swing.JOptionPane;

public class Caixa_Eletronico {
	
	static double[][] mEstatisticas = new double[4][4];
	static String[] nBancos = new String[] {"[Banco do Brasil]","[Santander]","[Itaú]","[Caixa]"};
	
	public static void main (String[] args) {
		int[] vNotas = new int[] {2,5,10,20,50,100};
		int[] qNotas = new int[6];
		
		LimparMatriz(3,3);
		
		int opc;
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Menu Principal\n[1] Carregar Notas\n[2] Retirar Notas\n[3] Estatísticas\n[9] Fim"));
			switch (opc){
			case 1:
				qNotas=FunCarregarNotas(qNotas);
				break;
			case 2:
				qNotas=FunRetirarNotas(qNotas,vNotas);
				break;
			case 3:
				MostraEstatisticas(vNotas,qNotas);
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Fim!");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Invalida!");
				break;
			}
		}while(opc!=9);
	}
	
	static int[] FunCarregarNotas (int v[]) {
		for (int i=0;i<=5;i++) {
			v[i]=100;
		}
		JOptionPane.showMessageDialog(null, "Notas carregadas com sucesso!");
		return v;
	}
	
	static int[] FunRetirarNotas (int qNotas[], int vNotas[]) {
		int saque, opcBanco, somaSaque = 0, contRetiradas = 0, sobra;
		do {
			sobra = 0;
			do {
				opcBanco=Integer.parseInt(JOptionPane.showInputDialog("Informe seu banco:\n[1]"+nBancos[0]+"\n[2]"+nBancos[1]+"\n[3]"+nBancos[2]+"\n[4]"+nBancos[3]));
				opcBanco--;
			}while (opcBanco<0 || opcBanco>3);
			
			if (qNotas[2]>=2 && qNotas[3]>=1) {
				int aux = Integer.parseInt(JOptionPane.showInputDialog(null, "[1] 2 x Nota de R$10\n[2] 1 x Nota de R$20"));
				if (aux==1) {
					qNotas[2]-=2;
					somaSaque+=vNotas[2]*2;
				}else {
					qNotas[3]--;
					somaSaque+=vNotas[3];
				}
			}
			
			for (int aux=5;aux>=0;aux--) {
				if (qNotas[aux]>=1) {
					do {
						saque = Integer.parseInt(JOptionPane.showInputDialog("Quantas notas de R$"+vNotas[aux]+",00?\nDisponivel:"+qNotas[aux]+"x notas."));
						if (saque>qNotas[aux]) {
							JOptionPane.showMessageDialog(null, "EXCEDEU O LIMITE DO CAIXA");
						}
					}while(saque>qNotas[aux] || saque<0);
					qNotas[aux]-=saque;
					somaSaque+=vNotas[aux]*saque;
					int opcSaque = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar?\n[1] Sim\n[2] Não"));
					if (opcSaque==2) aux=-1;
				}else if (qNotas[aux]==0) {
					JOptionPane.showMessageDialog(null, "Caixa sem notas de"+vNotas[aux]+",00!");
				}
			}
			if (somaSaque>0) Estatisticas(opcBanco,somaSaque);
			
			contRetiradas++;
			for (int cont=0;cont<=5;cont++) {
				sobra+=(vNotas[cont]*qNotas[cont]);
			}
		}while(contRetiradas<=100 && sobra>0);
		return qNotas;
	}
	
	static void LimparMatriz(int qLinha, int qColuna) {
		for (int linha=0;linha<=qLinha;linha++) {
			for (int coluna=0;coluna<=qColuna;coluna++) {
				mEstatisticas[linha][coluna]=0;
			}
		}
	}
	
	static void Estatisticas (int banco, int saque) {
		if (mEstatisticas[banco][2]==0) {
			mEstatisticas[banco][0]=saque;
		}
		if (mEstatisticas[banco][0]>saque)		{
			mEstatisticas[banco][0]=saque;
		}
		if (mEstatisticas[banco][1]<saque)		{
			mEstatisticas[banco][1]=saque;
		}
		mEstatisticas[banco][2]++;
		mEstatisticas[banco][3]+=saque;
	}
	
	static void MostraEstatisticas(int vNotas[],int qNotas[]) {
		String sEstatisticas = "Banco | Maior Saque | Menor Saque | Média dos Saque | Valor Total dos Saques\n";
		int sobra = 0;
		for (int linha=0;linha<=3;linha++) {
			sEstatisticas+=nBancos[linha];
			for (int coluna=0;coluna<=3;coluna++) {
				if (coluna==2) {
					sEstatisticas+=" R$"+(mEstatisticas[linha][3]/mEstatisticas[linha][2]);
				}else{
					sEstatisticas+=" R$"+mEstatisticas[linha][coluna];
				}
			}
			sEstatisticas+="\n";
		}
		sEstatisticas+="Sobra do Caixa: ";
		for (int cont=0;cont<=5;cont++) {
			sobra+=(vNotas[cont]*qNotas[cont]);
		}
		sEstatisticas+=sobra+",00";
		
		JOptionPane.showMessageDialog(null, sEstatisticas);
	}
}
