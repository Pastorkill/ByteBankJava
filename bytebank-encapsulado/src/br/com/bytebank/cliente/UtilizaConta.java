package br.com.bytebank.cliente;

import java.util.*;

import br.com.bytebank.conta.Conta;
import br.com.bytebank.conta.ContaCorrente;

public class UtilizaConta {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ol� seja bem-vindo ao Byte Bank!");

		Cliente cliente = new Cliente();
		System.out.println("Informe os dados do titular da conta abaixo");
		System.out.print("Informe seu nome completo: ");
		String nomeCliente = entrada.nextLine();
		cliente.seterNome(nomeCliente);

		System.out.print("Informe sua profiss�o: ");
		cliente.seterProfissao(entrada.nextLine());

		System.out.print("Informe seu CPF: ");
		cliente.seterCpf(entrada.nextLine());

		System.out.print("Informe numero da sua conta: ");
		int numeroConta = entrada.nextInt();

		System.out.println("Informe digito da sua conta: ");
		int digitoConta = entrada.nextInt();
		Conta conta = new ContaCorrente(numeroConta, digitoConta, cliente);

		conta.getDadosConta();

	}
}
