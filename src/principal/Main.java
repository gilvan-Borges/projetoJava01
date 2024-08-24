package principal;

import java.util.UUID;

import javax.swing.JOptionPane;

import entities.Cliente;
import repositories.ClienteRepository;

/*
	* Classe principal responsável por executar o projeto
	*/

public class Main {

	/*
	 * Método / função padrão do java utilizado para executarmos a classe principal
	 * do projeto
	 */

	public static void main(String[] args) {

		System.out.println("Sistema para cadastro de cliente.");
		System.out.println("Turma de java WebDeveloper - Sábado.");

		// Criando um objeto para a classe Cliente
		var cliente = new Cliente();

		// preenchendo os dados do cliente
		cliente.setId(UUID.randomUUID());
		cliente.setNome(JOptionPane.showInputDialog("Informe o nome do cliente: "));
		cliente.setCpf(JOptionPane.showInputDialog("Informe o cpf do cliente: "));
		cliente.setTelefone(JOptionPane.showInputDialog("Informe o telefone do cliente: "));
		cliente.setEmail(JOptionPane.showInputDialog("Informe o email do cliente: "));

		//Imprimir os dados dos clientes
		System.out.println("\nDados do Cliente:");
		System.out.println("\tId........: " + cliente.getId());
		System.out.println("\tCpf.......: " + cliente.getCpf());
		System.out.println("\tNome......: " + cliente.getNome());
		System.out.println("\tTelefone..: " + cliente.getTelefone());
		System.out.println("\tEmail.....: " + cliente.getEmail());

		// criando um objeto para a classe clienteRepository
		var clienteRepository = new ClienteRepository();

		// executando a exportação dos dados para arquivo
		clienteRepository.exportarDados(cliente);
	}

}
