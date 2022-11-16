package metodos.Banco;

import java.util.Scanner;

public class Ordenacao {
	Scanner leia = new Scanner(System.in);

	// Algoritimo de ordenacao

	public static void ordenacao(int contas[], double saldos[]) {
		for (int i = 0; i < contas.length; i++) {
			for (int j = i + 1; j < contas.length; j++) {
				if (contas[i] > contas[j]) {
					int aux1 = 0;
					double aux2 = 0;

					aux1 = contas[i];
					contas[i] = contas[j];
					contas[j] = aux1;

					aux2 = saldos[i];
					saldos[i] = saldos[j];
					saldos[j] = aux2;
				}
			}
		}
	}
}
