package bank.model;

public class ContaPremium extends Conta {

	@Override
	public TipoConta getTipoConta() {
		return TipoConta.PREMIUM;
	}

}
