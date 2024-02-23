package bank.repository;

import bank.model.Cliente;

public interface ClienteDAO {

	public void inserir(Cliente cliente);
	
	public Cliente get(String cpf);
	
	
}
