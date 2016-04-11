package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import conexao.Conexao;
import entidades.Pessoa;
import interfaces.Obrigatorio;

/**
 * @author Elima
 *
 */
public class PessoaDAO implements Obrigatorio<Pessoa> {

	private static final String SQL_INSERT = "INSERT INTO pessoa(ps_nome, ps_sobrenome, ps_sexo, ps_telefone,"
			+ " ps_email, ps_rua, ps_numero, ps_complemento, ps_cep, ps_cidade, ps_estado, ps_pais) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
	private static final String SQL_DELETE = "DELETE FROM pessoa WHERE id_pessoa = ?";
	private static final String SQL_UPDATE = "UPDATE pessoa SET ps_nome=?, ps_sobrenome=?, ps_sexo=? WHERE id_pessoa = ?";
	private static final String SQL_SELECT = "SELECT * FROM pessoa WHERE id_pessoa = ?";
	private static final String SQL_SELECTALL = "SELECT * FROM pessoa";

	// aplicando singletos
	private static final Conexao con = Conexao.saberEstado();

	@Override
	public boolean create(Pessoa ent) {
		PreparedStatement ps;

		try {
			ps = con.getCon().prepareStatement(SQL_INSERT);
			ps.setString(1,  ent.getNome());
			ps.setString(2,  ent.getSobrenome());
			ps.setString(3,  ent.getSexo());
			ps.setString(4,  ent.getTelefone());
			ps.setString(5,  ent.getEmail());
			ps.setString(6,  ent.getRua());
			ps.setInt   (7,  ent.getNumero());
			ps.setString(8,  ent.getComplemento());
			ps.setString(9,  ent.getCep());
			ps.setString(10, ent.getCidade());
			ps.setString(11, ent.getEstado());
			ps.setString(12, ent.getPais());

			if (ps.executeUpdate() > 0) {
				System.out.println("Contato inserido!");
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
