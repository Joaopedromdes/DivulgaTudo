package projetoCampgemini;

import java.util.Date;
import java.time.LocalDate;
import java.util.Calendar;

public class VisCadastro {

	public static void main(String[] args) {

		LocalDate dataInicial = LocalDate.now();

		LocalDate dataFinal = dataInicial.plusDays(30);  //A data que o an�ncio ficar� ativo

		Cadastro cd = new Cadastro(); // Est�nciando o cadastro
		cd.cadastroAnuncio("An�ncio do novo Honda Civic", "Honda", dataInicial, dataFinal, 1); // Chamando o m�todo
																								// cadastroAnuncio com
																								// seus par�metros
	}
}
