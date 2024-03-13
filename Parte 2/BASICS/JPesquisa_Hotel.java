import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JPesquisa_Hotel extends JFrame {

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
					JPesquisa_Hotel frame = new JPesquisa_Hotel();
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
	public JPesquisa_Hotel() {
		setTitle("PesquisaHotel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome do Hotel");
		lblNewLabel.setBounds(64, 42, 95, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(185, 39, 175, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Marcar Data de Chegada");
		btnNewButton.setBounds(47, 108, 163, 23);
		contentPane.add(btnNewButton);
		
		JButton btnMarcarDataDe = new JButton("Marcar Data de Partida");
		btnMarcarDataDe.setBounds(232, 108, 163, 23);
		contentPane.add(btnMarcarDataDe);
		
		JButton btnNewButton_1 = new JButton("Conferir");
		btnNewButton_1.setBounds(297, 202, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Voltar");
		btnNewButton_1_1.setBounds(26, 202, 89, 23);
		contentPane.add(btnNewButton_1_1);
	}

}
