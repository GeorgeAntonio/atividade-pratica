package br.ufrn.imd.modelo;

public abstract class ContaCorrente implements Tributavel{
	private String Agencia;
	private String numero;
	private double saldo;
	
	public String getAgencia() {
		return Agencia;
	}
	public void setAgencia(String agencia) {
		Agencia = agencia;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void saca(double valor) {
		if (valor<=saldo) {
			saldo=saldo-valor;
			System.out.println("Saque de :"+valor+" em ["+numero+"] efetuado com sucesso!");
		}else {
			System.out.println("Saldo insuficiente!");
		}
	}
	public void deposita(double valor) {
		saldo=saldo+valor;
		System.out.println("Depósito de :"+valor+" em ["+numero+"] efetuado com sucesso!");
	}
	public boolean transfere(double valor, ContaCorrente cc) {
		if (valor<=saldo) {
			saldo=saldo-valor;
			System.out.println("Transferindo : "+valor+" para ["+cc.numero+"]");
			return true;
		}else {
			System.out.println("Saldo insuficiente!");
			return false;
		}
		
	}
	public double calculaTributos(){
		double tributo = 0;
		tributo = saldo*.38;
		return tributo;
	}
	
}
