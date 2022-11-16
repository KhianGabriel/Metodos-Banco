package metodos.Banco;

import java.util.Scanner;

public class Saque {
	Scanner leia = new Scanner(System.in);

	int inicio, meio, fim;
	int codigo, cont;
	boolean achou;
	double valor, anterior;
    //Metodo para sacar os saldos 
	public void sacar(int contas[], double saldos[]) {
		Busca busca = new Busca();
		busca.buscar(contas, saldos);
		if (busca.achou == true) {
			System.out.println("Digite o quanto deseja sacar : ");
			valor = leia.nextDouble();
			// Verificacao de erro
			if (valor < 0 || valor > saldos[busca.meio]) {
				System.out.println("Valor invalido ou saldo insuficiente");
				busca.achou = false;
			} else {
				// Realizacao do saque
				double anterior = saldos[busca.meio];
				saldos[busca.meio] -= valor;
				System.out.println("A conta : " + contas[busca.meio] + " possuia saldo de : " + anterior
						+ " e agora possui um novo saldo de : " + saldos[busca.meio]);
			}

		}

	}

}
