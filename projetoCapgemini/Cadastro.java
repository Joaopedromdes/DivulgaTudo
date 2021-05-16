package projetoCampgemini;

import java.util.Date;
import java.io.File; // Import the File class
import java.io.FileWriter;
import java.io.IOException; // Import the IOException class to handle errors
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Cadastro {

	// O construtor ir� ser inicializado com os par�metros nomeAnuncio, cliente,
	// dataInicio, dataFinal e investimentoDia
	public void cadastroAnuncio(String nomeAnuncio, String cliente, LocalDate dataInicio, LocalDate dataFinal,
			int investimentoDia) {

		try { // Se tudo estiver correto na conex�o, ir� executar o try
				// Ir� ser criado um novo arquivo no caminho selecionado abaixo
			File myObj = new File("C:\\cadastroAnuncio\\anuncios.txt");

			if (myObj.createNewFile()) {
				// Ir� escrever no arquivo, todos os par�metros listados abaixo.
				FileWriter myWriter = new FileWriter("C:\\cadastroAnuncio\\anuncios.txt");
				myWriter.write("nome do an�ncio: " + nomeAnuncio + "\n");
				myWriter.write("nome do Cliente: " + cliente + "\n");
				myWriter.write("Data In�cio: " + dataInicio + "\n");
				myWriter.write("Data final: " + dataFinal + "\n");
				myWriter.write("Investimento por dia: " + investimentoDia + "\n");

				// Para termos a quantidade de dias que o an�ncio esteve ativo, teremos que ter
				// a diferen�a entre a dataInicio e a dataFinal
				// (dataFinal - dataInicio)
				Long diasAnuncio = ChronoUnit.DAYS.between(dataInicio, dataFinal);
				Calculadora c = new Calculadora(); // Est�nciando uma nova Calculadora
				// Para sabermos o total gasto no an�ncio, teremos a quantidade de dias que o
				// an�ncio esteve ativo vezes o investimento di�rio
				c.calcular(diasAnuncio.intValue() * investimentoDia);
				myWriter.write("Valor total investido: " + diasAnuncio.intValue() * investimentoDia + "\n");
				myWriter.write("Visualiza��es: " + c.visualizacoes + "\n");// As 3 linhas abaixo ir� printar o total de
																			// Visualiza��es,
				myWriter.write("Cliques: " + c.cliques + "\n"); // cliques e compartilhamentos que o an�ncio ter�,
				myWriter.write("Compartilhamentos: " + c.compartilhamento); // considerando o valor total investido.
				myWriter.close();
				System.out.println("File created: " + myObj.getName());
			} else { // se o arquivo n�o for criado, ir� informar que o arquivo j� existe
				System.out.println("File already exists.");
				FileWriter myWriter = new FileWriter("C:\\cadastroAnuncio\\anuncios.txt");
				myWriter.write("nome do an�ncio: " + nomeAnuncio + "\n");
				myWriter.write("nome do Cliente: " + cliente + "\n");
				myWriter.write("Data In�cio: " + dataInicio + "\n");
				myWriter.write("Data final: " + dataFinal + "\n");
				myWriter.write("Investimento por dia: " + investimentoDia + "\n");

				// Para termos a quantidade de dias que o an�ncio esteve ativo, teremos que ter
				// a diferen�a entre a dataInicio e a dataFinal
				// (dataFinal - dataInicio)
				Long diasAnuncio = ChronoUnit.DAYS.between(dataInicio, dataFinal);
				Calculadora c = new Calculadora(); // Est�nciando uma nova Calculadora
				// Para sabermos o total gasto no an�ncio, teremos a quantidade de dias que o
				// an�ncio esteve ativo vezes o investimento di�rio
				c.calcular(diasAnuncio.intValue() * investimentoDia);
				myWriter.write("Valor total investido: " + diasAnuncio.intValue() * investimentoDia + "\n");
				myWriter.write("Visualiza��es: " + c.visualizacoes + "\n");// As 3 linhas abaixo ir� printar o total de visualiza��es,																			
				myWriter.write("Cliques: " + c.cliques + "\n"); // cliques e compartilhamentos que o an�ncio ter�,
				myWriter.write("Compartilhamentos: " + c.compartilhamento); // considerando o valor total investido.
				myWriter.close();
			}
		} catch (IOException e) { // Se houver algum erro na conex�o, ir� executar o catch (informando que algum erro ocorreu)									
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
