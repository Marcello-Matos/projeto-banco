package bancoNacional;

public class Cliente extends Banco{
	private int contaCorrente;
	private int contaPoupanca;
	private String investimentos;
	private String cpf;
	private String cliente;

// CONSTRUTOR
	
	public Cliente(String nomeBanco, int agencia, int contaAgencia, String endereco, String estado, int telefone, int contaCorrente, int contaPoupanca, String investimentos, String cpf) {
		 super(nomeBanco, agencia, contaAgencia, endereco, estado, telefone, cpf);
		setContaCorrente(contaCorrente);
		setContaPoupanca(contaPoupanca);
		setInvestimentos(investimentos);
		setCpf(cpf);
	}
		
	
public int getContaCorrente() {
		return contaCorrente;
	}


	public void setContaCorrente(int contaCorrente) {
		this.contaCorrente = contaCorrente;
	}


	public int getContaPoupanca() {
		return contaPoupanca;
	}


	public void setContaPoupanca(int contaPoupanca) {
		this.contaPoupanca = contaPoupanca;
	}


	public String getInvestimentos() {
		return investimentos;
	}


	public void setInvestimentos(String investimentos) {
		this.investimentos = investimentos;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	//MÉTODO TO STRING
	public String toString() {
		return super.toString()+ "Conta Corrente: " + contaCorrente + "Conta Poupança:" + contaPoupanca + contaPoupanca + "Investimentos: " + investimentos + "CPF: " + cpf;
		
	}
}