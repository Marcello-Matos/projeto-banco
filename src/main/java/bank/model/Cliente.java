package bank.model;

public class Cliente extends Pessoa {

	private String profissao;
	private double renda;
	private boolean statusAtivacao;
	
	@Override
	public String toString() {
		return "Cliente [getCpf()=" + getCpf() + ", getNome()=" + getNome() + "]";
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	public boolean isStatusAtivacao() {
		return statusAtivacao;
	}

	public void setStatusAtivacao(boolean statusAtivacao) {
		this.statusAtivacao = statusAtivacao;
	}

	
}
