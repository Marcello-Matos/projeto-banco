package bank.model;

import java.util.Date;

public class ContaPoupanca extends Conta {
	
	private double poupancaRendimentos;
	
	public ContaPoupanca(String cpf, String numeroConta, double saldo, Date dataAbertura) {
		super(cpf, numeroConta, saldo, dataAbertura);
		
	}

	public double getPoupancaRendimentos() {
		return poupancaRendimentos;
	}

	public void setPoupancaRendimentos(double poupancaRendimentos) {
		this.poupancaRendimentos = poupancaRendimentos;
	}

	@Override
	public TipoConta getTipoConta() {
		return TipoConta.POUPANCA;
	}
	
	public String toString() {
		return "Poupança Rendimentos: " + poupancaRendimentos;
	}

	@Override
	public double getBeneficio() {
		
		return 15;
	}

}
