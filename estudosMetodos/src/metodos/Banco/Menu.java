package metodos.Banco;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		try (Scanner leia = new Scanner(System.in)) {
			int menu = 0;
			int contas[] = new int[4];
			double saldos[] = new double[4];

//Declaração de objetos, para chamada de metodos de outras classes
			Consulta consulta = new Consulta();
			Deposito deposito = new Deposito();
			Saque saque = new Saque();
			Ordenacao ordenacao = new Ordenacao();

			// Cadastro de contas

			System.out.println("Bem vindo ao Banco !!\n");
			for (int i = 0; i < contas.length; i++) {
				System.out.println("Digite a " + (i + 1) + " ° conta :");
				contas[i] = leia.nextInt();

				// Verificação se a conta já existe e foi cadastrada
				if (i > 0) {
					for (int j = 0; j < i; j++) {
						while (contas[i] == contas[j]) {
							System.out.println("Codigo ja existe");
							System.out.println("Digite a " + (i + 1) + " ° conta :");
							contas[i] = leia.nextInt();
						}
					}
				}
				// Validação se o valor da conta for negativo

				while (contas[i] < 0) {
					System.out.println("Valor invalido, digite novamente!!");
					System.out.println("Digite a " + (i + 1) + " ° conta :");
					contas[i] = leia.nextInt();
				}

				// Fechamento do cadastro de contas

				// Cadastro de saldos

				System.out.println("Digite o saldo da " + (i + 1) + " ° conta : ");
				saldos[i] = leia.nextInt();

				// Validação se o valor do saldo for negativo

				while (saldos[i] < 0) {
					System.out.println("Valor invalido, digite novamente!!");
					System.out.println("Digite o " + (i + 1) + " ° saldo :");
					saldos[i] = leia.nextInt();
				}
				// Fechamento do cadastro de saldos

			} // Fechamento do cadastro de saldos e contas

			// Criação do menu
			do {
				System.out.println();
				System.out.println("--------Banco---------\n" 
				        + "1 - Efetuar Deposito\n" 
						+ "2 - Efetuar Saque\n"
						+ "3 - Consultar o ativo bancario \n" 
						+ "4 - Sair");
				        menu = leia.nextInt();

				if (menu < 1 || menu > 4) {
					System.out.println("Valor invalido, digite novamente!!");
					continue;
				}
				// Odenacao do arrays de contas e saldos
				Ordenacao.ordenacao(contas, saldos);

				switch (menu) {// selecao das opcoes do banco
				case 1:

					deposito.depositar(contas, saldos);
					break;
				case 2:
					saque.sacar(contas, saldos);
					break;
				case 3:
					consulta.consultar(contas, saldos);
					break;
				case 4:
					System.out.println("Muito obrigado por utilizar esse banco !!");
					menu = 4;
				}
			} while (menu != 4);
		}
	}
}
