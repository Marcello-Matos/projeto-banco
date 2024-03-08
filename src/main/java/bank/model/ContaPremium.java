package bank.model;

import java.util.Date;

public class ContaPremium extends Conta {
	
	
	
	public ContaPremium(String cpf, String numeroConta, double saldo, Date dataAbertura) {
		super(cpf, numeroConta, saldo, dataAbertura);
	}

	@Override
	public TipoConta getTipoConta() {
		return TipoConta.PREMIUM;
	}
	
	public String toString() {
		return "Benefícios: " + getBeneficio();
	}

	@Override
	public double getBeneficio() {
		
		return 2;
	}

}
