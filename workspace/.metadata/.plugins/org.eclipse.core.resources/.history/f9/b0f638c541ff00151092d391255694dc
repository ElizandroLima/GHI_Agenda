/**
 * 
 */
package dao;

import java.util.List;

import java.sql.*;

import conexao.Conexao;
import entidades.Pessoa;
import interfaces.Obrigatorio;

/**
 * @author Elima
 *
 */
public class AgendaDAO implements Obrigatorio<Pessoa> {

	private static final String SQL_INSERT = "INSERT INTO pessoa(id_pessoa, ps_nome, ps_sobrenome) VALUES (?, ?, ?)";
	private static final String SQL_DELETE = "DELETE FROM pessoa WHERE id_pessoa = ?";
	private static final String SQL_UPDATE = "UPDATE pessoa SET ps_nome=?, ps_sobrenome=? WHERE id_pessoa = ?";
	private static final String SQL_SELECT = "SELECT * FROM pessoa WHERE id_pessoa = ?";
	private static final String SQL_SELECTALL = "SELECT * FROM pessoa";

	// aplicando singletos
	private static final Conexao con = Conexao.saberEstado();

	@Override
	public boolean create(Pessoa ent) {
		PreparedStatement ps;

		try {
			ps = con.getCon().prepareStatement(SQL_INSERT);
			ps.setInt(1, ent.getId_pes());
			ps.setString(2, ent.getNome());
			ps.setString(3, ent.getSobrenome());

			if (ps.executeUpdate() > 0) {
				return true;
			}
			con.fecharconexao();

		} catch (SQLException e) {
			System.out.println("Erro ao executar insert!");
			e.printStackTrace();
		} finally {
			con.fecharconexao();
		}

		return false;

	}

	@Override
	public boolean delete(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Pessoa ent) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Pessoa select(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pessoa> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
