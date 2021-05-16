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
		
		visualizacoes = valorInicial * 30; //Visualiza��es geradas pelo primeiro pagamento
		
		for(sequencia = 1; sequencia <= 4; sequencia++) { //O mesmo an�ncio � compartilhado no m�ximo 4 vezes em sequ�ncia
			if(visualizacoesAux > 0) { //Se j� existir visualiza��es geradas por compartilhamento
				if(visualizacoesAux >= 100) { //Se j� existir mais de 100 visualiza��es geradas por compartilhamento
					cliquesAux = (visualizacoes / 100) * 12; //F�rmula de cliques para uma sequ�ncia de compartilhamento
				}
				if(cliques >= 20) {  //Se j� existir cliques gerados por compartilhamento
					compartilhamentoAux = (cliques / 20) * 3; //F�rmula de compartilhamento para uma sequ�ncia de compartilhamento
				}
				if(compartilhamentoAux >= 1) { //Se j� existir compartilhamento gerados por outros compartilhamentos 
					visualizacoesAux = compartilhamentoAux * 40; //F�rmula de visualiza��es ao final de uma sequ�ncia de compartilhamento
				}
				
				visualizacoes += visualizacoesAux; //Alimentando as visualiza��es Totais
				cliques += cliquesAux;   //Alimentando os cliques Totais
				if(sequencia != 4) { //So se alimenta compartilhamentos at� a terceira sequ�ncia de compartilhamentos
					compartilhamento += compartilhamentoAux; //Alimentando os compartilhamentos Totais
				}
				
			}else {
				if(visualizacoes >= 100) { //Se as visualiza��es geradas por pagamento forem maior ou igual a 100
					cliquesAux = (visualizacoes / 100) * 12; //F�rmula de cliques para uma sequ�ncia de compartilhamento
				}
				if(cliquesAux >= 20) { //Se j� existir cliques gerados por pagamento
					compartilhamentoAux = (cliquesAux / 20) * 3; //F�rmula de compartilhamento para uma sequ�ncia de compartilhamento
				}
				if(compartilhamentoAux >= 1) { //Se j� existir compartilhamento gerados por pagamento
					visualizacoesAux = compartilhamentoAux * 40; //F�rmula de visualiza��es ao final de uma sequ�ncia de compartilhamento
				}
				
				visualizacoes += visualizacoesAux; //Alimentando as visualiza��es Totais
				cliques += cliquesAux; //Alimentando os cliques Totais
				compartilhamento += compartilhamentoAux; //Alimentando os compartilhamentos Totais
			}
			
		}
		System.out.println("Visualiza��es: "+ visualizacoes);
		System.out.println("Cliques: " + cliques);
		System.out.println("Compartilhamentos: " + compartilhamento);
	}
}

