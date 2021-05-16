package projetoCampgemini;

public class Calculadora {
	public static int valorInicial;
	public static int visualizacoes;
	public static int compartilhamento;
	public static int cliques;
	public static int visualizacoesAux;
	public static int compartilhamentoAux;
	public static int cliquesAux;
	public static int sequencia;
	
	public void calcular(int valorInicial) {
		
		visualizacoes = valorInicial * 30; //Visualizações geradas pelo primeiro pagamento
		
		for(sequencia = 1; sequencia <= 4; sequencia++) { //O mesmo anúncio é compartilhado no máximo 4 vezes em sequência
			if(visualizacoesAux > 0) { //Se já existir visualizações geradas por compartilhamento
				if(visualizacoesAux >= 100) { //Se já existir mais de 100 visualizações geradas por compartilhamento
					cliquesAux = (visualizacoes / 100) * 12; //Fórmula de cliques para uma sequência de compartilhamento
				}
				if(cliques >= 20) {  //Se já existir cliques gerados por compartilhamento
					compartilhamentoAux = (cliques / 20) * 3; //Fórmula de compartilhamento para uma sequência de compartilhamento
				}
				if(compartilhamentoAux >= 1) { //Se já existir compartilhamento gerados por outros compartilhamentos 
					visualizacoesAux = compartilhamentoAux * 40; //Fórmula de visualizações ao final de uma sequência de compartilhamento
				}
				
				visualizacoes += visualizacoesAux; //Alimentando as visualizações Totais
				cliques += cliquesAux;   //Alimentando os cliques Totais
				if(sequencia != 4) { //So se alimenta compartilhamentos até a terceira sequência de compartilhamentos
					compartilhamento += compartilhamentoAux; //Alimentando os compartilhamentos Totais
				}
				
			}else {
				if(visualizacoes >= 100) { //Se as visualizações geradas por pagamento forem maior ou igual a 100
					cliquesAux = (visualizacoes / 100) * 12; //Fórmula de cliques para uma sequência de compartilhamento
				}
				if(cliquesAux >= 20) { //Se já existir cliques gerados por pagamento
					compartilhamentoAux = (cliquesAux / 20) * 3; //Fórmula de compartilhamento para uma sequência de compartilhamento
				}
				if(compartilhamentoAux >= 1) { //Se já existir compartilhamento gerados por pagamento
					visualizacoesAux = compartilhamentoAux * 40; //Fórmula de visualizações ao final de uma sequência de compartilhamento
				}
				
				visualizacoes += visualizacoesAux; //Alimentando as visualizações Totais
				cliques += cliquesAux; //Alimentando os cliques Totais
				compartilhamento += compartilhamentoAux; //Alimentando os compartilhamentos Totais
			}
			
		}
		System.out.println("Visualizações: "+ visualizacoes);
		System.out.println("Cliques: " + cliques);
		System.out.println("Compartilhamentos: " + compartilhamento);
	}
}

