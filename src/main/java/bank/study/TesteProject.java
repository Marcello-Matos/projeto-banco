package bank.study;

import java.util.Scanner;

import bank.model.Cliente;
import bank.model.Funcionario;
import bank.model.FuncionarioExterno;
import bank.model.Pessoa;

public class TesteProject {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1 para Funcionário\n2 para Cliente\n3 para Funcionário Externo");
		int opcao = scan.nextInt();
		
		Pessoa p = null;
		
		if(opcao == 1) {
			p = new Funcionario();
		}else if(opcao == 2) {
			p = new Cliente();
		}else {
			p = new FuncionarioExterno();
		}
		
		p.setCpf("123456");
		p.setNome("Marcello");
		p.setSexo("M");
		
		System.out.println("criado o " + p.getNome());
		if(p instanceof Cliente) {
			System.out.println("É um cliente");
		}else if(p instanceof Funcionario) {
			System.out.println("É um funcionário");
		}else {
			System.out.println("É um funcionário Externo");
		}
		
		

	}

}
