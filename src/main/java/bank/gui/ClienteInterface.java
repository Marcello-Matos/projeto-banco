package bank.gui;

import java.util.Scanner;

import bank.model.Cliente;
import bank.repository.ClienteDAO;
import bank.repository.impl.ClienteDAOImpl;

public class ClienteInterface {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Cliente cliente = new Cliente();
		cliente.setCpf("12345678912");
		cliente.setNome("Marcello");
		
		ClienteDAO repository = new ClienteDAOImpl();
		
		repository.inserir(cliente);
		Cliente clientePesquisado = repository.get("12345678912");
		
		System.out.println(clientePesquisado.getNome());
		
		
	}
}
