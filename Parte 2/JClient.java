import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JClient extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JClient frame = new JClient();
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
	public JClient() {
		setTitle("SetClient");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(62, 56, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(62, 87, 46, 14);
		contentPane.add(lblCpf);
		
		JLabel lblEndereo = new JLabel("Endereço");
		lblEndereo.setBounds(62, 118, 46, 14);
		contentPane.add(lblEndereo);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(62, 149, 46, 14);
		contentPane.add(lblEmail);
		
		textField = new JTextField();
		textField.setBounds(128, 53, 112, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(128, 84, 112, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(128, 115, 112, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(128, 146, 112, 20);
		contentPane.add(textField_3);
		
		JButton btnNewButton = new JButton("Data de Nacimento");
		btnNewButton.setBounds(270, 66, 143, 23);
		contentPane.add(btnNewButton);
		
		JButton btnDatoDoDia = new JButton("Dato do Dia");
		btnDatoDoDia.setBounds(270, 127, 143, 23);
		contentPane.add(btnDatoDoDia);
		
		JButton btnNewButton_1 = new JButton("Continuar");
		btnNewButton_1.setBounds(316, 205, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Voltar");
		btnNewButton_1_1.setBounds(41, 205, 89, 23);
		contentPane.add(btnNewButton_1_1);
	}

}
