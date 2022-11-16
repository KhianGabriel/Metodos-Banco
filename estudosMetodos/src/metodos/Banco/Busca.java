package metodos.Banco;

import java.util.Scanner;

public class Busca {
	Scanner leia = new Scanner(System.in);

	int inicio, meio, fim;
	int codigo;
	boolean achou;
	double valor, anterior;

	// Algoritimo de busca binaria

	public void buscar(int contas[], double saldos[]) {

		System.out.println("Digite o numero da sua conta : ");
		codigo = leia.nextInt();
		inicio = 0;
		meio = 0;
		fim = 3;
		achou = false;
		while (inicio <= fim && !achou) {
			meio = (inicio + fim) / 2;
			if (contas[meio] == codigo) {
				achou = true;
			} else if (codigo < contas[meio]) {
				fim = meio - 1;
			} else {
				inicio = meio + 1;
			}
		}
		if (achou == true) {
			System.out.println("Conta valida!!");
		} else {
			System.out.println("Conta inexistente!");

		}
	}
}
