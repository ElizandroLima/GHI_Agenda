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
	
	//Dados para a conexão com o banco 
	private static final String USUARIO = "root"; 
	private static final String SENHA = "root"; 
	private static final String DATABASE = "sisfac"; 
	private static final String DRIVER_CONEXAO = "com.mysql.jdbc.Driver"; 
	private static final String URL_CONEXAO = "jdbc:mysql://localhost:3306/sisfac";

	/**
	 *@author Elima
	 * construtor da classe que gera conexao
	 */
	private Conexao() {

		String message = "Driver não encontrado!";
		String message2 = "Login ou senha da DB incorretos!";

		try {
			Class.forName(DRIVER_CONEXAO);// driver
			System.out.println("Driver, ok!");

		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, message);
			e.printStackTrace();
		}
		
		try {
			con = DriverManager.getConnection(URL_CONEXAO, USUARIO, SENHA);// url
			System.out.println("Connection, ok!");
			
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, message2);
			
		}

	}

	/**
	 * @author Elima
	 * @metodo: Cria uma instancia de conexao
	 *  
	 * Singleton: permite verificar se já existe uma instancia aberta, se tiver nusa, senão cria uma nova
	 * 
	 * synchronized: permite que se tiver varias instancias ao mesmo tempo ele cria uma lista de espera
	 * ou seja, se um está conectando, os outros esperem sua vez!
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
