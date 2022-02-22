package modulo_metodo;

public class Mensagem {

	public static String mensagem(double valor) {
		if (valor < 12) {
			return "Bom dia";
		} else if (valor >= 12 && valor < 18) {
			return "Boa tarde";
		} else if (valor <= 24){
			return "Boa noite";
		} else {
			return "Horá inválida!";
		}
	}
}
