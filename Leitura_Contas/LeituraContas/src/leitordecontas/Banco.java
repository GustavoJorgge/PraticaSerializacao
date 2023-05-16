package leitordecontas;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Banco {
	public String nome;
	ArrayList<Conta> conta = new ArrayList<>();
	Double saldoTotal=0.0;
	
	public Banco() {
	}
	
	public Banco(String nome, ArrayList<Conta> conta) {
		super();
		this.nome = nome;
		this.conta = conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Conta> getConta() {
		return conta;
	}

	public void setConta(ArrayList<Conta> conta) {
		this.conta = conta;
	}

	public double SaldoTotal() {
		
		for(Conta aux : conta) {
			saldoTotal+= aux.getSaldo();
		}	
		return saldoTotal;
	}
	
	public void imprimirSaldoTotal()throws IOException{
		String arquivo = "C:\\Users\\gusta\\OneDrive\\Área de Trabalho\\programas\\programas original\\Linguagem\\Leitura_Contas\\resultado.txt";
		FileWriter escreve = new FileWriter(arquivo);
		escreve.write("Nome:" + getNome() + "\n Saldo total:" + saldoTotal);
		escreve.close();
	}
}
