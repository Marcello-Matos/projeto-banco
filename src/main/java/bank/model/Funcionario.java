package bank.model;

import java.util.Date;

public class Funcionario extends Pessoa {

	private String cargo;
	private double salario;
	
	public Funcionario(String cpf, String rg, String nome, Date dataNascimento, String endereco, String sexo, String cargo, double salario) {
		super.setCpf(cpf);
		super.setRg(rg);
		super.setNome(nome);
		super.setDataNascimento(dataNascimento);
		super.setEndereco(endereco);
		super.setSexo(sexo);
		setCargo(cargo);
		setSalario(salario);
		
	}
	public Funcionario() {
		
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String toString() {
		return super.toString() + "Cargo: " + cargo + "Salário: " + salario;
	}
	
	
}
