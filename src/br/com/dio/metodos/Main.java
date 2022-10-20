package br.com.dio.metodos;

public class Main {

	public static void main(String[] args) {
		
		//Calculadora
		System.out.println("Exercicio Calculadora : ");
		Calculadora.somar(3, 6);
		Calculadora.subtrair(10,5);
		Calculadora.multiplicar(5, 5);
		Calculadora.dividir(10,5);
		System.out.println();
		
		//Mensagem
		System.out.println("Exercicio Mensagem : ");
		Mensagem.obterMensagem(8);
		Mensagem.obterMensagem(14);
		Mensagem.obterMensagem(20);
		System.out.println();
		
		//Emprestimo
		System.out.println("Exercicio Emprestimo : ");
		Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
		Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
		Emprestimo.calcular(1000,5);
		System.out.println();
		
		//Quadrilatero
		System.out.println("Exercicio Quadrilatero : ");
		Quadrilatero.calcularArea(3);
		Quadrilatero.calcularArea(5, 5);
		Quadrilatero.calcularArea(7, 8, 9);
		System.out.println();
		
		//Quadrilatero com return 
		System.out.println("Exercicio Quadrilatero com return : ");
		System.out.println("Area do Quadrado : " + Quadrilatero.calcularAreaReturn(3));
		System.out.println("Area do Retangulo : " + Quadrilatero.calcularAreaReturn(5, 5));
		System.out.println("Area do Trapezio : " + Quadrilatero.calcularAreaReturn(7, 8, 9));
		

	}

}
