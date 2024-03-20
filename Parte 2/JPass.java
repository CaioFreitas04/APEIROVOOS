import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class JPass extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JPass frame = new JPass();
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
	public JPass() {
		setTitle("Set Passagem");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 230, 242);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPreco = new JLabel("Preço Das Passagens");
		lblPreco.setBounds(58, 77, 112, 14);
		contentPane.add(lblPreco);
		
		JButton btnNewButton = new JButton("Marcar Voo");
		btnNewButton.setBounds(47, 24, 115, 34);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(70, 104, 70, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1_1 = new JButton("Continuar");
		btnNewButton_1_1.setBounds(118, 168, 84, 15);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Voltar");
		btnNewButton_1_1_1.setBounds(15, 167, 84, 15);
		contentPane.add(btnNewButton_1_1_1);
	}

}
