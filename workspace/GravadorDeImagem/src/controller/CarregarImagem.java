package controller;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class CarregarImagem extends JFrame {

	private JPanel contentPane;
	private JTextField tf_locationImage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarregarImagem frame = new CarregarImagem();
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
	public CarregarImagem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 10, 414, 240);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lbl_mostraImagem = new JLabel("New label");
		lbl_mostraImagem.setBounds(258, 11, 146, 173);
		panel.add(lbl_mostraImagem);

		JButton bt_addImage = new JButton("adicionar");
		bt_addImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JFileChooser arquivo = new JFileChooser();
				arquivo.setDialogTitle("Selecione uma imagem!");
				arquivo.setFileSelectionMode(JFileChooser.FILES_ONLY);

				int opcao = arquivo.showOpenDialog(arquivo);

				if (opcao == JFileChooser.APPROVE_OPTION) {
					File file = new File("Caminho");
					file = arquivo.getSelectedFile();

					String filename = file.getAbsolutePath();
					tf_locationImage.setText(filename);

					ImageIcon imagem = new ImageIcon(arquivo.getSelectedFile()
							.getPath());
					lbl_mostraImagem.setIcon(new ImageIcon(imagem.getImage()
							.getScaledInstance(lbl_mostraImagem.getWidth(),
									lbl_mostraImagem.getHeight(), Image.SCALE_DEFAULT)));

				}

			}
		});
		bt_addImage.setBounds(10, 188, 89, 23);
		panel.add(bt_addImage);

		tf_locationImage = new JTextField();
		tf_locationImage.setBounds(109, 189, 295, 20);
		panel.add(tf_locationImage);
		tf_locationImage.setColumns(10);
	}
}
