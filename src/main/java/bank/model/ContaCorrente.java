package bank.model;

public class ContaCorrente extends Conta {

	@Override
	public TipoConta getTipoConta() {
		return TipoConta.CORRENTE;
	}
	
}
