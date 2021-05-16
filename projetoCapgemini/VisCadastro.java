package projetoCampgemini;

import java.util.Date;
import java.time.LocalDate;
import java.util.Calendar;

public class VisCadastro {

	public static void main(String[] args) {

		LocalDate dataInicial = LocalDate.now();

		LocalDate dataFinal = dataInicial.plusDays(30);  //A data que o anúncio ficará ativo

		Cadastro cd = new Cadastro(); // Estânciando o cadastro
		cd.cadastroAnuncio("Anúncio do novo Honda Civic", "Honda", dataInicial, dataFinal, 1); // Chamando o método
																								// cadastroAnuncio com
																								// seus parâmetros
	}
}
