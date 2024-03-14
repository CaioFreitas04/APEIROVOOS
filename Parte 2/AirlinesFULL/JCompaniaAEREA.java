import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JCompaniaAEREA extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JCompaniaAEREA frame = new JCompaniaAEREA();
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
	public JCompaniaAEREA() {
		setTitle("SetCompania");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CNPJ");
		lblNewLabel.setBounds(24, 24, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome Oficial");
		lblNome.setBounds(24, 52, 86, 14);
		contentPane.add(lblNome);
		
		JLabel lblNomeDeDi = new JLabel("Nome de Divulgação");
		lblNomeDeDi.setBounds(24, 78, 141, 14);
		contentPane.add(lblNomeDeDi);
		
		textField = new JTextField();
		textField.setBounds(140, 21, 133, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(140, 49, 133, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(140, 75, 133, 20);
		contentPane.add(textField_2);
		
		JButton btnNewButton = new JButton("Marcar Data de Fundação");
		btnNewButton.setBounds(125, 111, 167, 30);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.setBounds(24, 214, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Continuar");
		btnNewButton_1_1.setBounds(335, 214, 89, 23);
		contentPane.add(btnNewButton_1_1);
	}

}
