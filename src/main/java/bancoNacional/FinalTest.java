package bancoNacional;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class FinalTest {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		List<Cliente>clientes = new ArrayList<>();
		System.out.println("Informe o nome do Banco:\n");
		String banco = entrada.next();
		System.out.println("Informe o numero da agencia:\n");
		int agencia = entrada.nextInt();
		System.out.println("Informe a conta da agencia:\n");
		int contaAgencia = entrada.nextInt();
		System.out.println("Informe o endereço da agencia:\n");
		String endereco = entrada.next();
		System.out.println("Informe o estado:\n");
		String estado = entrada.next();
		System.out.println("Informe o telefone da agencia:\n");
		int telefone = entrada.nextInt();
		System.out.println("Informe o CNPJ do Banco:\n");
		String cnpj = entrada.next();
		
		while (true) {
			System.out.println("Informe os dados do cliente:\n");
			System.out.println("Informe o nome:\n");
			String nome = entrada.next();
			System.out.println("Informe o CPF:\n");
			String cpf = entrada.next();
			System.out.println("Informe os dados da Conta Corrente:\n");
			int contaCorrente = entrada.nextInt();
			System.out.println("Informe os dados da Conta Poupanca:\n");
			int contaPoupanca = entrada.nextInt();
			System.out.println("Informe os Investimentos:\n");
			String investimentos = entrada.next();
			
			
            Cliente cliente = new Cliente(banco, agencia, contaAgencia, endereco, estado, telefone, contaCorrente, contaPoupanca, investimentos, cpf);
           
            clientes.add(cliente);

            System.out.println("Deseja cadastrar outro cliente? (S/N)");
            String resposta = entrada.next();
            if (!resposta.equalsIgnoreCase("S")) {
                break;
            }
        }

        System.out.println("Lista de clientes cadastrados:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        entrada.close(); 
    }
}
