package br.com.dio.metodos;

public class Quadrilatero {
	
	//Exercicio de calcular a area dos 3 quadrilateros notaveis
	
	public static void calcularArea(double lado) {
				
		System.out.println("A area do Quadrado e : " + Math.pow(lado,2));
	}
	public static void calcularArea(double lado, double altura) {
				
		System.out.println("A area do Retangulo e : " + lado * altura);
	}
	public static void calcularArea(double Bmaior,double bmenor, double altura) {
				
		System.out.println("A area do Trapezio é : " + ((Bmaior + bmenor)*altura)/2);
	}
	
	
	//Exercicio de calcular a area dos 3 quadrilateros notaveis com return
	
	public static double calcularAreaReturn(double lado) {
		
		 return Math.pow(lado,2);
	}
	public static double calcularAreaReturn(double lado, double altura) {
				
		return lado * altura;
	}
	public static double calcularAreaReturn(double Bmaior,double bmenor, double altura) {
				
		return ((Bmaior + bmenor)*altura)/2;
	}
	

}
