package bank.study;

public class StaticFinal {
	private static String nome;
	public static final String NOME_FINAL = "Marcello";

	public static String teste() {
		return "nome teste";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
