package metodos.Banco;

import java.util.Scanner;

public class Deposito {
	Scanner leia = new Scanner(System.in);

	int inicio, meio, fim;
	int codigo;
	boolean achou;
	double valor, anterior;
    //Metodo de depositar
	public void depositar(int contas[], double saldos[]) {
	    Busca busca = new Busca();
	    busca.buscar(contas, saldos);

		if (busca.achou == true) {
			System.out.println("Digite o quanto deseja depositar : ");
			valor = leia.nextDouble();
			//Verificao de valor do deposito negativo
			if (valor < 0) {
				System.out.println("Valor invalido");
				busca.achou = false;
			} else {
				// Realizacao do deposito
				double anterior = saldos[busca.meio];
				saldos[busca.meio] += valor;
				System.out.println("A conta : " + contas[busca.meio] + " possuia saldo de : " + anterior
						+ " e agora possui um novo saldo de : " + saldos[busca.meio]);
			}
		}
	}
}
