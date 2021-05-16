package projetoCampgemini;

import java.util.Date;
import java.io.File; // Import the File class
import java.io.FileWriter;
import java.io.IOException; // Import the IOException class to handle errors
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Cadastro {

	// O construtor irá ser inicializado com os parâmetros nomeAnuncio, cliente,
	// dataInicio, dataFinal e investimentoDia
	public void cadastroAnuncio(String nomeAnuncio, String cliente, LocalDate dataInicio, LocalDate dataFinal,
			int investimentoDia) {

		try { // Se tudo estiver correto na conexão, irá executar o try
				// Irá ser criado um novo arquivo no caminho selecionado abaixo
			File myObj = new File("C:\\cadastroAnuncio\\anuncios.txt");

			if (myObj.createNewFile()) {
				// Irá escrever no arquivo, todos os parâmetros listados abaixo.
				FileWriter myWriter = new FileWriter("C:\\cadastroAnuncio\\anuncios.txt");
				myWriter.write("nome do anúncio: " + nomeAnuncio + "\n");
				myWriter.write("nome do Cliente: " + cliente + "\n");
				myWriter.write("Data Início: " + dataInicio + "\n");
				myWriter.write("Data final: " + dataFinal + "\n");
				myWriter.write("Investimento por dia: " + investimentoDia + "\n");

				// Para termos a quantidade de dias que o anúncio esteve ativo, teremos que ter
				// a diferença entre a dataInicio e a dataFinal
				// (dataFinal - dataInicio)
				Long diasAnuncio = ChronoUnit.DAYS.between(dataInicio, dataFinal);
				Calculadora c = new Calculadora(); // Estânciando uma nova Calculadora
				// Para sabermos o total gasto no anúncio, teremos a quantidade de dias que o
				// anúncio esteve ativo vezes o investimento diário
				c.calcular(diasAnuncio.intValue() * investimentoDia);
				myWriter.write("Valor total investido: " + diasAnuncio.intValue() * investimentoDia + "\n");
				myWriter.write("Visualizações: " + c.visualizacoes + "\n");// As 3 linhas abaixo irá printar o total de
																			// Visualizações,
				myWriter.write("Cliques: " + c.cliques + "\n"); // cliques e compartilhamentos que o anúncio terá,
				myWriter.write("Compartilhamentos: " + c.compartilhamento); // considerando o valor total investido.
				myWriter.close();
				System.out.println("File created: " + myObj.getName());
			} else { // se o arquivo não for criado, irá informar que o arquivo já existe
				System.out.println("File already exists.");
				FileWriter myWriter = new FileWriter("C:\\cadastroAnuncio\\anuncios.txt");
				myWriter.write("nome do anúncio: " + nomeAnuncio + "\n");
				myWriter.write("nome do Cliente: " + cliente + "\n");
				myWriter.write("Data Início: " + dataInicio + "\n");
				myWriter.write("Data final: " + dataFinal + "\n");
				myWriter.write("Investimento por dia: " + investimentoDia + "\n");

				// Para termos a quantidade de dias que o anúncio esteve ativo, teremos que ter
				// a diferença entre a dataInicio e a dataFinal
				// (dataFinal - dataInicio)
				Long diasAnuncio = ChronoUnit.DAYS.between(dataInicio, dataFinal);
				Calculadora c = new Calculadora(); // Estânciando uma nova Calculadora
				// Para sabermos o total gasto no anúncio, teremos a quantidade de dias que o
				// anúncio esteve ativo vezes o investimento diário
				c.calcular(diasAnuncio.intValue() * investimentoDia);
				myWriter.write("Valor total investido: " + diasAnuncio.intValue() * investimentoDia + "\n");
				myWriter.write("Visualizações: " + c.visualizacoes + "\n");// As 3 linhas abaixo irá printar o total de visualizações,																			
				myWriter.write("Cliques: " + c.cliques + "\n"); // cliques e compartilhamentos que o anúncio terá,
				myWriter.write("Compartilhamentos: " + c.compartilhamento); // considerando o valor total investido.
				myWriter.close();
			}
		} catch (IOException e) { // Se houver algum erro na conexão, irá executar o catch (informando que algum erro ocorreu)									
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
