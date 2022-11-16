package metodos.Banco;

public class Consulta {

	public void consultar(int contas[], double saldos[]) {
       //Loop que faz a demonstracao dos ativos bancarios
		for (int i = 0; i < contas.length; i++) {
			System.out.println("Numero da " + (i + 1) + " ° conta : " + contas[i] + ", e o valor do saldo da " + (i + 1)
					+ " conta : " + saldos[i]);
		}
	}
}
