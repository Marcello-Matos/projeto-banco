package bank.model;

public class ContaPoupanca extends Conta {

	@Override
	public TipoConta getTipoConta() {
		return TipoConta.POUPANCA;
	}

}
