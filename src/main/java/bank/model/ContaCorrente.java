package bank.model;

import java.util.Date;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(String cpf, String numeroConta, double saldo, Date dataAbertura) {
		super(cpf, numeroConta, saldo, dataAbertura);
	
	}
	public ContaCorrente() {
		
	}
	
	@Override
	public TipoConta getTipoConta() {
		return TipoConta.CORRENTE;
	}
		@Override
	public double getBeneficio() {
	
		return 10;
	}
	
}
