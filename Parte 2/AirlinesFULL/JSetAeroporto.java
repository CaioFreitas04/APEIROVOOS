import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JSetAeroporto extends JFrame {

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
					JSetAeroporto frame = new JSetAeroporto();
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
	public JSetAeroporto() {
		setTitle("SetAero");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome do Aeroporto");
		lblNewLabel.setBounds(62, 87, 122, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(194, 84, 155, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Avançar");
		btnNewButton.setBounds(318, 207, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(42, 207, 89, 23);
		contentPane.add(btnVoltar);
		
		JLabel lblNomeDaCidade = new JLabel("Nome da Cidade do Aeroporto");
		lblNomeDaCidade.setBounds(42, 137, 186, 14);
		contentPane.add(lblNomeDaCidade);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(221, 134, 141, 20);
		contentPane.add(textField_1);
	}
}
