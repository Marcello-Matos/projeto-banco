package bank.model;

import java.util.Date;

public abstract class Conta {

	private String cpf;
	private String numeroConta;
	private double saldo;
	private Date dataAbertura;
	
	
	public Conta(String cpf, String numeroConta, double saldo, Date dataAbertura) {
		this.cpf = cpf;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.dataAbertura = dataAbertura;		
	}
	public Conta() {
		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
	public abstract double getBeneficio();
	
	public abstract TipoConta getTipoConta();

	@Override
	public String toString() {
		return "Conta [cpf=" + cpf + ", numeroConta=" + numeroConta + ", saldo=" + saldo + ", dataAbertura="
				+ dataAbertura + "], tipo Conta: " + getTipoConta();
	}
	
	

}
