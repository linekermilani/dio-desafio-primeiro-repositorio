package modulo_metodo;

public class Calculadora {

	public static double soma(double valor1, double valor2) {
		return valor1 + valor2;
	}

	public static double subtracao(double valor1, double valor2) {
		return valor1 - valor2;
	}

	public static double multiplicacao(double valor1, double valor2) {
		return valor1 * valor2;
	}

	public static double divisao(double valor1, double valor2) {
		return valor1 / valor2;
	}

	public static double operacao(char op, double valor1, double valor2) {
		if (op == '+') {
			return soma(valor1, valor2);
		} else if(op == '-') {
			return subtracao(valor1, valor2);
		} else if(op == '*' || op == 'x') {
			return multiplicacao(valor1, valor2);
		} else if(op == '/' || op == '÷') {
			return divisao(valor1, valor2);
		} else {
			return 0;
		}
	}
}
