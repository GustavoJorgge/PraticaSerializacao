package leitordecontas;

public class Conta {
	String agencia;
	String numero;
	Double saldo;
	
	public Conta(String agencia, String numero, Double saldo) {
		super();
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
}
