package br.com.dio.metodos;

import java.util.Scanner;

public class Calculadora {

	// Exercicio de Calculadora, utilizando metodos.

	static Scanner leia = new Scanner(System.in);

	public static void somar(double valor1, double valor2) {
		double soma = valor1 + valor2;
		System.out.println("Resultado da soma de : " + valor1 + " mais " + valor2 + " = " + soma);
	}

	public static void subtrair(double valor1, double valor2) {
		double subtracao = valor1 - valor2;
		System.out.println("Resultado da subtracao de : " + valor1 + " menos " + valor2 + " = " + subtracao);
	}

	public static void multiplicar(double valor1, double valor2) {
		double multiplicacao = valor1 * valor2;
		System.out.println("Resultado da subtracao de : " + valor1 + " vezes " + valor2 + " = " + multiplicacao);
	}

	public static void dividir(double valor1, double valor2) {
		if (valor2 == 0) {
			System.out.println("Valor inválido");
			System.out.println("Digite um novo valor : ");
			valor2 = leia.nextDouble();
		}

		double divisao = valor1 / valor2;

		System.out.println("Resultado da divisão de : " + valor1 + " divido por : " + valor2 + " = " + divisao);
	}

}
