package controle;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import modelo.Pessoa;

public class ControlePessoa extends AbstractTableModel {

	private static final long serialVersionUID = 1L;
	private ArrayList<Pessoa> listaPessoas;

	public ControlePessoa() {
		listaPessoas = new ArrayList<Pessoa>();
	}

	public String adicionar(Pessoa umaPessoa) {
		String mensagem = "Pessoa adicionada com Sucesso!";
		listaPessoas.add(umaPessoa);
		return mensagem;
	}

	public String remover(Pessoa umaPessoa) {
		listaPessoas.remove(umaPessoa);
		String alerta = "Pessoa removida com sucesso!";
		return alerta;
	}

	public Pessoa pesquisar(String nome) {
		for (Pessoa pessoa : listaPessoas) {
			if (pessoa.getNome().equalsIgnoreCase(nome))
				return pessoa;
		}
		return null;
	}

	@Override
	public int getColumnCount() {
		return 9;
	}

	@Override
	public String getColumnName(int column) {
		switch (column) {
		case 0:
			return "Nome";
		case 1:
			return "telenone";
		case 2:
			return "idade";
		case 3:
			return "cpf";
		case 4:
			return "rg";
		case 5:
			return "sexo";
		case 6:
			return "email";
		}
		return "";
	}

	@Override
	public int getRowCount() {
		return listaPessoas.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Pessoa n = listaPessoas.get(rowIndex);

		switch (columnIndex) {
		case 0:
			return n.getNome();
		case 1:
			return n.getCpf();
		case 2:
			return n.getIdade();
		case 3:
			return n.getEmail();
		case 4:
			return n.getEndereco();
		case 5:
			return n.getHangout();
		case 6:
			return n.getRg();
		case 7:
			return n.getSexo();
		case 8:
			return n.getTelefone();

		}
		return null;
	}

}