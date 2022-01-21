package br.com.bytebank.cliente;

import br.com.bytebank.conta.*;

/**
 * Para criar um cliente � obrigatorio passar como parametro uma conta associado ao cliente.
 * @author carlos
 *
 */
public class Cliente {
	private String nome;
	private String cpf;
	private String profissao;
	
	// Seters---------------------------------------------------------------------------------------------
	
		public void seterNome(String nome) {
			this.nome = nome;
		}

		public void seterCpf(String cpf) {
			this.cpf = cpf;
		}

		public void seterProfissao(String profissao) {
			this.profissao = profissao;
		}
		
	public String getNome() {
		return this.nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public String getProfissao() {
		return this.profissao;
	}

	// Geters----------------------------------------------------------------------------------------------
	public void getDadosCliente() {
		System.out.println("---------------------------DADOS CLIENTE---------------------------");
		System.out.println("Nome: " + this.nome);
		System.out.println("Profiss�o: " + this.profissao);
		System.out.println("CPF: " + this.cpf);
	}

}
