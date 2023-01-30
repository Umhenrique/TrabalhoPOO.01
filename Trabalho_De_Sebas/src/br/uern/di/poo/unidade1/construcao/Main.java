package br.uern.di.poo.unidade1.construcao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Porta portaCliente = new Porta(portasTipo.LUXO, 1.8, 0.7, true);
		Porta portaCliente2 = new Porta();
		Porta portaCliente3 = new Porta(portasTipo.PADRÃO, 2.8, 1.0, true);
		Porta portaCliente4 = new Porta(portasTipo.LUXO, 1.8, 0.7, false);
		Serviços servicoporta = new Serviços();
		System.out.println("Insira qual das portas entre 1-4 você quer visualizar");
		int seletor = scanner.nextInt();
		switch (seletor) {
		case 1: {
			double total = portaCliente.calculaPreco(portaCliente) + servicoporta.instalacao(portaCliente);
			System.out.println("¦————————————————————————————————————————————————————————————¦");
			System.out.println("O custo da porta é " + portaCliente.calculaPreco(portaCliente) + "R$");
			System.out.println(portaCliente.exibePorta(portaCliente));
			System.out.println("Os custos adicionais de serviço são " + servicoporta.instalacao(portaCliente) + "R$");
			System.out.println("O total a ser pago é: " + total);
			System.out.println("¦————————————————————————————————————————————————————————————¦");
			break;
		}
		case 2: {
			double total = portaCliente2.calculaPreco(portaCliente2) + servicoporta.instalacao(portaCliente2);
			System.out.println("¦————————————————————————————————————————————————————————————¦");
			System.out.println("O custo da porta é " + portaCliente2.calculaPreco(portaCliente2) + "R$");
			System.out.println(portaCliente2.exibePorta(portaCliente2));
			System.out.println("Os custos adicionais de serviço são " + servicoporta.instalacao(portaCliente2) + "R$");
			System.out.println("O total a ser pago é: " + total);
			System.out.println("¦————————————————————————————————————————————————————————————¦");
			break;
		}
		case 3: {
			double total = portaCliente3.calculaPreco(portaCliente3) + servicoporta.instalacao(portaCliente3);
			System.out.println("¦————————————————————————————————————————————————————————————¦");
			System.out.println("O custo da porta é " + portaCliente3.calculaPreco(portaCliente3) + "R$");
			System.out.println(portaCliente3.exibePorta(portaCliente3));
			System.out.println("Os custos adicionais de serviço são " + servicoporta.instalacao(portaCliente3) + "R$");
			System.out.println("O total a ser pago é: " + total);
			System.out.println("¦————————————————————————————————————————————————————————————¦");
			break;
		}
		case 4: {
			double total = portaCliente4.calculaPreco(portaCliente4) + servicoporta.instalacao(portaCliente4);
			System.out.println("¦————————————————————————————————————————————————————————————¦");
			System.out.println("O custo da porta é " + portaCliente4.calculaPreco(portaCliente4) + "R$");
			System.out.println(portaCliente4.exibePorta(portaCliente4));
			System.out.println("Os custos adicionais de serviço são " + servicoporta.instalacao(portaCliente4) + "R$");
			System.out.println("O total a ser pago é: " + total);
			System.out.println("¦————————————————————————————————————————————————————————————¦");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + seletor);

		}
	}
}