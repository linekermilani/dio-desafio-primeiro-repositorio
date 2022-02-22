package modulo_metodo;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		System.out.println("==== MENU ====");
		System.out.println("1 - Calculadora");
		System.out.println("2 - Mensagem do dia");
		System.out.println("3 - Empréstimo");
		System.out.println("0 - Sair");
		System.out.println();
		System.out.print("Informe a opção: ");
		int opcao = scanner.nextInt();
		
		switch (opcao) {
		case 1:
			double valor1 = scanner.nextDouble();
			char operacao = scanner.next().charAt(0);
			double valor2 = scanner.nextDouble();
			System.out.println(Calculadora.operacao(operacao, valor1, valor2));
			break;
		case 2:
			System.out.print("Informe a hora do dia: "); 
			double horas = scanner.nextDouble();
			System.out.println(Mensagem.mensagem(horas));
			break;
		case 3:
			System.out.print("Informe o valor do empréstimo: ");
			double valorEmprestimo = scanner.nextDouble();
			System.out.print("Em quantos meses deseja pagar: ");
			int meses = scanner.nextInt();
			System.out.print("Qual a taxa em %: ");
			double taxa = scanner.nextDouble();
			System.out.println("Valor final do Empréstimo com juros simples: " 
			+ String.format("%.2f", Emprestimo.calculoJuros(valorEmprestimo, meses, taxa))  + " Reais");
		default:
			break;
		}
		
		scanner.close();
	}
}
