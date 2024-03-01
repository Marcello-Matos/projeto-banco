package bank.gui;

import bank.model.Conta;
import bank.model.ContaCorrente;

public class ContaInterface {

	public static void main(String[] args) {
		Conta corrente = new ContaCorrente();
		corrente.setCpf("12345678912");
		corrente.setNumeroConta("123456");
		corrente.setSaldo(7821151);
		
		System.out.println(corrente.toString());

	}

}
