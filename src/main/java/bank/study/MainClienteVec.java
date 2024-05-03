package bank.study;

import java.util.ArrayList;
import java.util.List;

import bank.model.Cliente;
import bank.model.Pessoa;

public class MainClienteVec {

	public static void main(String[] args) {
		Pessoa[] clientes = new Pessoa[100];
		
		Cliente c1 = new Cliente();
		c1.setNome("Antonio");
		c1.setRenda(1000);
		
		Cliente c2 = new Cliente();
		c2.setNome("Marcello");
		c2.setRenda(2000);
		
		clientes[0] = c1;
		clientes[1] = c2;
		
		for(int i = 0; i < clientes.length; i++) {
			if(clientes[i] == null)
				break;
			
			Pessoa cliente = clientes[i];
			System.out.println(cliente.getNome());
		}
		
	}
}
