package br.ufrn.imd.modelo;

public abstract class Pessoa extends ContaCorrente implements Tributavel{
	private String nome;
	private double salario;
	private ContaCorrente conta;
	private SeguroVida seguro;
	
	
	public ContaCorrente getConta() {
		return conta;
	}
	public void setConta(ContaCorrente conta) {
		this.conta = conta;
	}
	public SeguroVida getSeguro() {
		return seguro;
	}
	public void setSeguro(SeguroVida seguro) {
		this.seguro = seguro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double calculaTributos(){
		double tributo = 0;
		tributo = salario*.11;
		return tributo;
	}
	
	
}
