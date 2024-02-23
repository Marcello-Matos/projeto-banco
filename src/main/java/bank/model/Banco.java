package bank.model;

public class Banco {
	private String nomeBanco;
	private int agencia;
	private String endereco;
	private int telefone;
	
	public Banco(String nomeBanco, int agencia, String endereco, int telefone) {
		this.nomeBanco = nomeBanco;
		this.agencia = agencia;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	public String getNomeBanco() {
		return nomeBanco;
	}
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String toString() {
		return "nome Banco: " + nomeBanco + "Agencia: " + agencia + "Endereço: " + endereco + "Telefone: " + telefone;
	}
			
}
