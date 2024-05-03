package bank.repository.impl;

import bank.model.Cliente;
import bank.repository.ClienteDAO;

public class ContaDAOImpl implements ClienteDAO {
	
	private Cliente[] baseDados = new Cliente[50];
	private int contadorConta = 0;

	@Override
	public void inserir(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente get(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizar(String cpf, Cliente cliente) {
		// TODO Auto-generated method stub
		
	}
	
}
