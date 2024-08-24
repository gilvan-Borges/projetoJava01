package repositories;

import java.io.PrintWriter;

import entities.Cliente;

/*
 * classe de repositorio de dados para gravar , editar ou excluir
 * informações de clientes em arquivos ou em bancos de dados
 */

public class ClienteRepository {
	/*
	 * Metodo para gravar os dados do cliente em arquivos de extensão .TXT
	 */
	public void exportarDados(Cliente cliente) {

		try {
			// criando o arquivo txt para gravar os dados do cliente
			var printWriter = new PrintWriter("c:\\temp\\cliente_" + cliente.getId() + ".txt");

			// escrever o conteúdo do arquivo:
			printWriter.write("\nID do cliente.: " + cliente.getId());
			printWriter.write("\nNome..........: " + cliente.getNome());
			printWriter.write("\nCPF...........: " + cliente.getCpf());
			printWriter.write("\nTelefone......: " + cliente.getTelefone());
			printWriter.write("\nEmail.........: " + cliente.getEmail());

			// fechando o arquivo
			printWriter.close();

			System.out.println("\nDados gravados com sucesso!");

		} catch (Exception e) {

			System.out.println("\nFalha ao gravar arquivo: " + e.getMessage());
		}

	}

}
