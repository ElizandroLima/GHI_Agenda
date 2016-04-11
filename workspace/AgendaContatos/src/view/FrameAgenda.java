package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.Box;

public class FrameAgenda extends JFrame {

	private JPanel contentPane;
	private JTextField jtf_nome;
	private JTextField textField;
	private JTextField jtf_telefone;
	private JTextField jtf_email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameAgenda frame = new FrameAgenda();
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
	public FrameAgenda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 716, 471);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_nome = new JLabel("Nome");
		lbl_nome.setBounds(150, 27, 46, 14);
		contentPane.add(lbl_nome);
		
		jtf_nome = new JTextField();
		jtf_nome.setBounds(150, 41, 184, 20);
		contentPane.add(jtf_nome);
		jtf_nome.setColumns(10);
		
		JLabel lbl_sobrenome = new JLabel("Sobrenome");
		lbl_sobrenome.setBounds(349, 27, 77, 14);
		contentPane.add(lbl_sobrenome);
		
		textField = new JTextField();
		textField.setBounds(347, 41, 229, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lbl_image = new JLabel("");
		lbl_image.setBounds(10, 27, 130, 158);
		contentPane.add(lbl_image);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(150, 72, 46, 14);
		contentPane.add(lblTelefone);
		
		jtf_telefone = new JTextField();
		jtf_telefone.setBounds(150, 97, 123, 20);
		contentPane.add(jtf_telefone);
		jtf_telefone.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(288, 72, 46, 14);
		contentPane.add(lblEmail);
		
		jtf_email = new JTextField();
		jtf_email.setBounds(286, 97, 290, 20);
		contentPane.add(jtf_email);
		jtf_email.setColumns(10);
	}
}
