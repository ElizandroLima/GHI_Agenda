package teste;

import dao.PessoaDAO;
import entidades.Pessoa;

public class TesteSql {

	public static void main(String[] args) {

		Pessoa pesosTest = new Pessoa("Luiza", "Carla", "Feminino");
		PessoaDAO pessoa = new PessoaDAO();
		pessoa.create(pesosTest);
	}

}