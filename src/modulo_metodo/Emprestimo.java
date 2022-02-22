package modulo_metodo;

public class Emprestimo {

	public static double calculoJuros(double valor, int meses, double taxa) {
		return valor + (valor * (taxa / 100) * meses);
	}
}
