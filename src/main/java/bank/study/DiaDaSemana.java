package bank.study;

public enum DiaDaSemana {
	SEGUNDA("SEG"), TERCA("TER"), QUARTA("QUA"), QUINTA("QUI"), SEXTA("SEX"), SABADO("SAB"), DOMINGO("DOM");
	
	private String nomeAbr;
	
	private DiaDaSemana(String nomeAbr) {
		this.nomeAbr = nomeAbr;
	}

	public String getNomeAbr() {
		return nomeAbr;
	}
	
}
