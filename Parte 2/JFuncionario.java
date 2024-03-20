import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class JFuncionario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFuncionario frame = new JFuncionario();
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
	public JFuncionario() {
		setTitle("SetFunciona");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 208);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(178, 11, 46, 14);
		contentPane.add(lblCpf);
		
		JLabel lblEndereo = new JLabel("Endereço");
		lblEndereo.setBounds(10, 50, 46, 14);
		contentPane.add(lblEndereo);
		
		JButton btnNewButton = new JButton("Marcar Data de Nacimento");
		btnNewButton.setBounds(244, 46, 159, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNumeroDeCarteira = new JLabel("Numero de Carteira");
		lblNumeroDeCarteira.setBounds(10, 92, 105, 14);
		contentPane.add(lblNumeroDeCarteira);
		
		textField = new JTextField();
		textField.setBounds(66, 8, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(234, 8, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(76, 47, 131, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(121, 89, 131, 20);
		contentPane.add(textField_3);
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.setBounds(10, 141, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Continuar");
		btnNewButton_1_1.setBounds(335, 141, 89, 23);
		contentPane.add(btnNewButton_1_1);
		
		JLabel lblSalarioMinimo = new JLabel("Salario Minimo");
		lblSalarioMinimo.setBounds(260, 92, 86, 14);
		contentPane.add(lblSalarioMinimo);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(335, 89, 86, 20);
		contentPane.add(textField_4);
	}

}
