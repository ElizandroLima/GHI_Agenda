package view;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.ParseException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import dao.PessoaDAO;
import entidades.EstadoType;
import entidades.Pessoa;
import entidades.SexoType;

public class FrameAgendaContatos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_nome;
	private JTextField textField_Sobrenome;
	private JTextField textField_email;
	private JFormattedTextField textField_telefone;
	private JTextField textField_rua;
	private JTextField textField_numero;
	private JTextField textField_complemento;
	private JFormattedTextField textField_cep;
	private JTextField textField_cidade;
	private JTextField textField_pais;
	private JComboBox<SexoType> comboBox_sexo;
	private JComboBox<Object> comboBox_estado;
	private JTable table_1;
	private DefaultTableModel tablePessoa;
	private JTextField textField_id;
	private JTextField tf_locationImage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameAgendaContatos frame = new FrameAgendaContatos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws Exception
	 */
	public FrameAgendaContatos() throws Exception {
		setTitle("Agenda de Contatos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 793, 559);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBounds(0, 0, 777, 520);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lbImagem = new JLabel("foto");
		lbImagem.setHorizontalAlignment(SwingConstants.CENTER);
		lbImagem.setBounds(10, 82, 101, 125);
		panel.add(lbImagem);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(121, 11, 46, 14);
		panel.add(lblNome);

		textField_nome = new JTextField();
		textField_nome.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent ev) {
				String caracteres = "0987654321";
				if (caracteres.contains(ev.getKeyChar() + "")) {
					ev.consume();
				}
			}
		});
		textField_nome.setBounds(121, 28, 281, 20);
		panel.add(textField_nome);
		textField_nome.setColumns(10);

		JLabel lblSobrenome = new JLabel("Sobrenome");
		lblSobrenome.setBounds(412, 11, 66, 14);
		panel.add(lblSobrenome);

		textField_Sobrenome = new JTextField();
		textField_Sobrenome.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent ev) {
				String caracteres = "0987654321";
				if (caracteres.contains(ev.getKeyChar() + "")) {
					ev.consume();
				}

			}
		});
		textField_Sobrenome.setBounds(412, 28, 348, 20);
		panel.add(textField_Sobrenome);
		textField_Sobrenome.setColumns(10);

		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(121, 59, 46, 14);
		panel.add(lblSexo);

		/** bot�o carregar imagem */
		JButton btnCarregarImagem = new JButton("Buscar foto");
		btnCarregarImagem.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCarregarImagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFileChooser arquivo = new JFileChooser();
				arquivo.setDialogTitle("Selecione uma imagem!");
				arquivo.setFileSelectionMode(JFileChooser.FILES_ONLY);

				int opcao = arquivo.showOpenDialog(arquivo);

				if (opcao == JFileChooser.APPROVE_OPTION) {
					File file = new File("Caminho");
					file = arquivo.getSelectedFile();

					String filename = file.getAbsolutePath();
					tf_locationImage.setText(filename);

					ImageIcon imagem = new ImageIcon(arquivo.getSelectedFile().getPath());
					lbImagem.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(lbImagem.getWidth(),
							lbImagem.getHeight(), Image.SCALE_DEFAULT)));

				}

			}
		});

		btnCarregarImagem.setBounds(10, 234, 86, 23);
		panel.add(btnCarregarImagem);

		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(678, 485, 86, 23);
		panel.add(btnSair);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(217, 59, 46, 14);
		panel.add(lblEmail);

		JLabel lbltelefone = new JLabel("Telefone");
		lbltelefone.setBounds(121, 113, 46, 14);
		panel.add(lbltelefone);

		textField_email = new JTextField();
		textField_email.setBounds(217, 82, 543, 20);
		panel.add(textField_email);
		textField_email.setColumns(10);

		textField_telefone = new JFormattedTextField();
		textField_telefone.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent ev) {
				String caracteres = "0987654321";
				if (!caracteres.contains(ev.getKeyChar() + "")) {
					ev.consume();
				}
			}
		});

		try {
			MaskFormatter maskTel = new MaskFormatter("(##)####-####");
			maskTel.install(textField_telefone);
		} catch (ParseException e2) {
			e2.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro no Telefone");
		}

		textField_telefone.setBounds(121, 133, 101, 20);
		panel.add(textField_telefone);
		textField_telefone.setColumns(10);

		JLabel lblRua = new JLabel("Rua");
		lblRua.setBounds(232, 113, 41, 14);
		panel.add(lblRua);

		textField_rua = new JTextField();
		textField_rua.setBounds(232, 133, 528, 20);
		panel.add(textField_rua);
		textField_rua.setColumns(10);

		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setBounds(121, 167, 46, 14);
		panel.add(lblNumero);

		textField_numero = new JTextField();
		textField_numero.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent ev) {// somente aceita numeros
				String caracteres = "0987654321";
				if (!caracteres.contains(ev.getKeyChar() + "")) {
					ev.consume();
				}

			}
		});
		textField_numero.setBounds(121, 186, 46, 20);
		panel.add(textField_numero);
		textField_numero.setColumns(10);

		JLabel lblComplemento = new JLabel("Complemento");
		lblComplemento.setBounds(177, 171, 86, 14);
		panel.add(lblComplemento);

		textField_complemento = new JTextField();
		textField_complemento.setBounds(177, 186, 427, 20);
		panel.add(textField_complemento);
		textField_complemento.setColumns(10);

		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(614, 171, 50, 14);
		panel.add(lblCep);

		MaskFormatter maskCep = null;
		try {
			maskCep = new MaskFormatter("#####-###");

		} catch (ParseException e1) {
			e1.printStackTrace();
			JOptionPane.showMessageDialog(null, "CEP invalido");
		}

		textField_cep = new JFormattedTextField();

		textField_cep.setBounds(614, 186, 146, 20);
		panel.add(textField_cep);
		textField_cep.setColumns(10);
		maskCep.install(textField_cep);

		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(121, 217, 46, 14);
		panel.add(lblCidade);

		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(429, 217, 54, 14);
		panel.add(lblEstado);

		JLabel lblPas = new JLabel("Pa\u00EDs");
		lblPas.setBounds(592, 217, 50, 14);
		panel.add(lblPas);

		textField_cidade = new JTextField();
		textField_cidade.setBounds(121, 235, 297, 20);
		panel.add(textField_cidade);
		textField_cidade.setColumns(10);

		textField_pais = new JTextField();
		textField_pais.setBounds(592, 235, 168, 20);
		panel.add(textField_pais);
		textField_pais.setColumns(10);

		comboBox_sexo = new JComboBox<SexoType>();
		comboBox_sexo.setModel(new DefaultComboBoxModel<SexoType>(SexoType.values()));
		comboBox_sexo.setBounds(121, 82, 86, 20);
		panel.add(comboBox_sexo);

		comboBox_estado = new JComboBox<>();
		comboBox_estado.setModel(new DefaultComboBoxModel<Object>(EstadoType.values()));
		comboBox_estado.setBounds(429, 235, 152, 20);
		panel.add(comboBox_estado);

		// Cadastrar contato
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String nome = textField_nome.getText();
				String sobrenome = textField_Sobrenome.getText();
				SexoType sexo = (SexoType) comboBox_sexo.getSelectedItem();
				String email = textField_email.getText();
				String telefone = textField_telefone.getText();
				String rua = textField_rua.getText();
				int numero = Integer.parseInt(textField_numero.getText());
				String complemento = textField_complemento.getText();
				String cep = textField_cep.getText();
				String cidade = textField_cidade.getText();
				EstadoType estado = (EstadoType) comboBox_estado.getSelectedItem();
				String pais = textField_pais.getText();
				String img = tf_locationImage.getText();

				Pessoa pessoa = new Pessoa();

				pessoa.setNome(nome);
				pessoa.setSobrenome(sobrenome);
				pessoa.setSexo(sexo);
				pessoa.setEmail(email);
				pessoa.setTelefone(telefone);
				pessoa.setRua(rua);
				pessoa.setNumero(numero);
				pessoa.setComplemento(complemento);
				pessoa.setCep(cep);
				pessoa.setCidade(cidade);
				pessoa.setEstado(estado);
				pessoa.setPais(pais);
				pessoa.setFoto(img);

				PessoaDAO inserir = new PessoaDAO();
				inserir.create(pessoa);

			}
		});
		btnNewButton.setBounds(14, 486, 101, 23);
		panel.add(btnNewButton);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String nome = textField_nome.getText();

				PessoaDAO buscar = new PessoaDAO();
				buscar.delete(nome);

			}
		});
		btnExcluir.setBounds(224, 485, 89, 23);
		panel.add(btnExcluir);

		// Limpar campos
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_id.setText("");
				textField_nome.setText("");
				textField_Sobrenome.setText("");
				textField_email.setText("");
				textField_telefone.setText("");
				textField_rua.setText("");
				textField_numero.setText("");
				textField_complemento.setText("");
				textField_cep.setText("");
				textField_cidade.setText("");
				textField_pais.setText("");

			}
		});
		btnLimpar.setBounds(574, 485, 95, 23);
		panel.add(btnLimpar);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String nome = textField_nome.getText();

				PessoaDAO buscar = new PessoaDAO();
				buscar.selecionar(nome);
				
				
				
				
				//textField_Sobrenome.setText(psrs.getSobrenome());
				
				

			}
		});
		btnBuscar.setBounds(125, 485, 89, 23);
		panel.add(btnBuscar);

		// Alterar
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String nome = textField_nome.getText();
				String sobrenome = textField_Sobrenome.getText();
				SexoType sexo = (SexoType) comboBox_sexo.getSelectedItem();
				String email = textField_email.getText();
				String telefone = textField_telefone.getText();
				String rua = textField_rua.getText();
				int numero = Integer.parseInt(textField_numero.getText());
				String complemento = textField_complemento.getText();
				String cep = textField_cep.getText();
				String cidade = textField_cidade.getText();
				EstadoType estado = (EstadoType) comboBox_estado.getSelectedItem();
				String pais = textField_pais.getText();

				Pessoa pessoa = new Pessoa();

				pessoa.setNome(nome);
				pessoa.setSobrenome(sobrenome);
				pessoa.setSexo(sexo);
				pessoa.setEmail(email);
				pessoa.setTelefone(telefone);
				pessoa.setRua(rua);
				pessoa.setNumero(numero);
				pessoa.setComplemento(complemento);
				pessoa.setCep(cep);
				pessoa.setCidade(cidade);
				pessoa.setEstado(estado);
				pessoa.setPais(pais);

				new PessoaDAO().update(pessoa);

			}
		});
		btnAlterar.setBounds(323, 485, 89, 23);
		panel.add(btnAlterar);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 323, 754, 151);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 734, 129);
		panel_1.add(scrollPane);

		tablePessoa = new PessoaDAO().metodo();
		table_1 = new JTable(tablePessoa);

		scrollPane.setViewportView(table_1);

		textField_id = new JTextField();
		textField_id.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		textField_id.setBounds(10, 28, 101, 20);
		panel.add(textField_id);
		textField_id.setColumns(10);

		JLabel lblIdentificador = new JLabel("Identificador");
		lblIdentificador.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIdentificador.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdentificador.setBounds(10, 11, 101, 14);
		panel.add(lblIdentificador);

		tf_locationImage = new JTextField();
		tf_locationImage.setBounds(10, 268, 750, 20);
		panel.add(tf_locationImage);
		tf_locationImage.setColumns(10);

		// getContentPane().add(table_1);

		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[] { contentPane, panel, lbImagem, lblNome,
				textField_nome, lblSobrenome, textField_Sobrenome, lblSexo, btnCarregarImagem, btnSair }));
	}
}
