package bancoNacional;

public class Banco {
	private String nomeBanco;
	private int agencia;
	private int contaAgencia;
	private String endereco;
	private String estado;
	private int telefone;
	private String cnpj;
	
	public Banco(String nomeBanco, int agencia, int contaAgencia, String endereco, String estado, int telefone, String cnpj) {
		setNomeBanco(nomeBanco);
		setAgencia(agencia);
		setContaAgencia(contaAgencia);
		setEndereco(endereco);
		setEstado(estado);
		setTelefone(telefone);
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


	public int getContaAgencia() {
		return contaAgencia;
	}


	public void setContaAgencia(int contaAgencia) {
		this.contaAgencia = contaAgencia;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public int getTelefone() {
		return telefone;
	}


	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String toString() {
		return "Nome Banco: " + nomeBanco + "Agencia: " + agencia + "Conta Agencia: " + contaAgencia + "Endereço: " + endereco + "Estado: " + estado + "Telenfone: " + telefone + "CNPJ: " + cnpj;
		
	}
}
