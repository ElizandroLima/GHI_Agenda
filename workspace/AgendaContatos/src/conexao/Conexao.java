/**
 * 
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 * @author Elima
 *
 */
public class Conexao {

	public static Conexao instance; // Singleton
	private Connection con;

	/**
	 *@author Elima
	 * construtor da classe que gera conexao
	 */
	private Conexao() {
		String url = "jdbc:mysql://localhost:3306/bdloteria";
		String driver = "com.mysql.jdbc.Driver";
		String usuario = "root";
		String senha = "root";

		String message = "Driver n�o encontrado!";
		String message2 = "Login ou senha da DB incorretos!";

		try {
			Class.forName(driver);// driver

		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, message);
			e.printStackTrace();
		}
		
		try {
			con = DriverManager.getConnection(url, usuario, senha);// url
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, message2);
		}

	}

	/**
	 * @author Elima
	 * @metodo: Cria uma instancia de conexao
	 *  
	 * Singleton: permite verificar se j� existe uma instancia aberta, se tiver nusa, sen�o cria uma nova
	 * 
	 * synchronized: permite que se tiver varias instancias ao mesmo tempo ele cria uma lista de espera
	 * ou seja, se um est� conectando, os outros esperem sua vez!
	 * @return instance
	 */
	public synchronized static Conexao saberEstado(){
		if (instance == null) {
			instance = new Conexao();
		}
		return instance;
			
	}
	
	public Connection getCon() {
		return con;
	}
	
	/**
	 * @author Elima
	 * 
	 * metodo para fechar a conexao
	 */
	public void fecharconexao(){
		instance = null;
	}

	
}