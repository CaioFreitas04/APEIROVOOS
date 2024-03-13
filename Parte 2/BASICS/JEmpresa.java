import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JList;

public class JEmpresa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JEmpresa frame = new JEmpresa();
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
	public JEmpresa() {
		setTitle("Set Empre");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome da Empresa");
		lblNewLabel.setBounds(22, 64, 122, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(128, 61, 164, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(154, 140, 126, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNomeDaCidade = new JLabel("Nome da Cidade Afiliada");
		lblNomeDaCidade.setBounds(22, 143, 122, 14);
		contentPane.add(lblNomeDaCidade);
		
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.setBounds(290, 139, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Data Empresa");
		btnNewButton_1.setBounds(302, 60, 122, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.setBounds(306, 205, 89, 23);
		contentPane.add(btnContinuar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(21, 205, 89, 23);
		contentPane.add(btnVoltar);
	}
}
