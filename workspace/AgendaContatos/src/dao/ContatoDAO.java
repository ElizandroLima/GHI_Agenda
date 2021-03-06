package dao;

import java.util.List;

import conexao.Conexao;
import entidades.Contato;
import interfaces.Obrigatorio;

public class ContatoDAO implements Obrigatorio<Contato> {
	
	private static final String SQL_INSERT = "INSERT INTO contato(ctt_telefone, ctt_email) VALUES (?, ?)";
	private static final String SQL_DELETE = "DELETE FROM contato WHERE id_contato = ?";
	private static final String SQL_UPDATE = "UPDATE contato SET ctt_telefone=?, ctt_email=? WHERE id_contato = ?";
	private static final String SQL_SELECT = "SELECT * FROM contato WHERE id_contato = ?";
	private static final String SQL_SELECTALL = "SELECT * FROM contato";
	
	// aplicando singletos
		private static final Conexao con = Conexao.saberEstado();

	@Override
	public boolean create(Contato ent) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Contato ent) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Contato select(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contato> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
