package view;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import conexao.Conexao;
import entidades.Pessoa;

import java.awt.Component;
import java.awt.Font;

import javax.swing.JTable;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.table.DefaultTableModel;

import java.awt.SystemColor;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class FrameAgendaContatos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_nome;
	private JTextField textField_Sobrenome;
	private JTextField textField_email;
	private JTextField textField_telefone;
	private JTextField textField_rua;
	private JTextField textField_numero;
	private JTextField textField_complemento;
	private JTextField textField_cep;
	private JTextField textField_cidade;
	private JTextField textField_pais;
	private JTable table_contatos;

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
	 */
	public FrameAgendaContatos() {
		setTitle("Agenda de Contatos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBounds(0, 0, 774, 461);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbImagem = new JLabel("foto");
		lbImagem.setHorizontalAlignment(SwingConstants.CENTER);
		lbImagem.setBounds(10, 11, 101, 145);
		panel.add(lbImagem);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(121, 11, 46, 14);
		panel.add(lblNome);
		
		textField_nome = new JTextField();
		textField_nome.setBounds(121, 28, 281, 20);
		panel.add(textField_nome);
		textField_nome.setColumns(10);
		
		JLabel lblSobrenome = new JLabel("Sobrenome");
		lblSobrenome.setBounds(412, 11, 66, 14);
		panel.add(lblSobrenome);
		
		textField_Sobrenome = new JTextField();
		textField_Sobrenome.setBounds(412, 28, 348, 20);
		panel.add(textField_Sobrenome);
		textField_Sobrenome.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(121, 59, 46, 14);
		panel.add(lblSexo);
		
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
					lbImagem.setText(filename);

					ImageIcon imagem = new ImageIcon(arquivo.getSelectedFile()
							.getPath());
					lbImagem.setIcon(new ImageIcon(imagem.getImage()
							.getScaledInstance(lbImagem.getWidth(),
									lbImagem.getHeight(), Image.SCALE_DEFAULT)));

				}

				
			}
		});
		btnCarregarImagem.setBounds(10, 167, 86, 23);
		panel.add(btnCarregarImagem);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(674, 426, 86, 23);
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
		
		textField_telefone = new JTextField();
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
		
		textField_cep = new JTextField();
		textField_cep.setBounds(614, 186, 146, 20);
		panel.add(textField_cep);
		textField_cep.setColumns(10);
		
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 272, 750, 145);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		table_contatos = new JTable();
		table_contatos.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table_contatos.setColumnSelectionAllowed(true);
		table_contatos.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_contatos.setBounds(10, 115, 550, -103);
		panel_1.add(table_contatos);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int iCodigo = Integer.parseInt(txtCodigo.getText());
		        int iNumero = Integer.parseInt(txtNumero.getText());
		        String sDescricao = txtDescricao.getText();
		        double dValor = Double.parseDouble(txtValor.getText());
		        
		        Pessoa pessoa = new Pessoa();
		        pessoa.setCodigo();

		 
		        BancoDados.addAposento(aposento);
		        Aposentos.atualizaTabela();
		        this.dispose();
			 
			           
			}
		});
		btnNewButton.setBounds(10, 427, 101, 23);
		panel.add(btnNewButton);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(220, 426, 89, 23);
		panel.add(btnExcluir);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(570, 426, 95, 23);
		panel.add(btnLimpar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(121, 426, 89, 23);
		panel.add(btnBuscar);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(319, 426, 89, 23);
		panel.add(btnAlterar);
		
		JComboBox comboBox_sexo = new JComboBox();
		comboBox_sexo.setBounds(121, 82, 86, 20);
		panel.add(comboBox_sexo);
		
		JComboBox comboBox_estado = new JComboBox();
		comboBox_estado.setModel(new DefaultComboBoxModel(new String[] {"...", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"}));
		comboBox_estado.setBounds(429, 235, 152, 20);
		panel.add(comboBox_estado);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane, panel, lbImagem, lblNome, textField_nome, lblSobrenome, textField_Sobrenome, lblSexo, btnCarregarImagem, btnSair}));
	}
}