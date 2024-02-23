package bank.repository.impl;

import bank.model.Cliente;
import bank.repository.ClienteDAO;

public class ClienteDAOImpl implements ClienteDAO {
	
	private Cliente[] baseDados = new Cliente[50];
	private int contadorClientes = 0;
	

	@Override
	public void inserir(Cliente cliente) {
		this.baseDados[contadorClientes] = cliente;
		this.contadorClientes++;
		
	}

	@Override
	public Cliente get(String cpf) {
		for(int i = 0; i < this.contadorClientes; i++) {
			Cliente clientePesquisa = baseDados[i];
			if(cpf.equals(clientePesquisa.getCpf())) {
				return clientePesquisa;
			}
		}
		return null;
	}

}
