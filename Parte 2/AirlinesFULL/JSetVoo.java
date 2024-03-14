import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;

public class JSetVoo extends JFrame {

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
					JSetVoo frame = new JSetVoo();
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
	public JSetVoo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 198);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Codigo");
		lblNewLabel.setBounds(22, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(67, 8, 118, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCompania = new JLabel("Compania");
		lblCompania.setBounds(22, 37, 68, 14);
		contentPane.add(lblCompania);
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setForeground(new Color(255, 0, 0));
		lblMenu.setBounds(108, 37, 68, 14);
		contentPane.add(lblMenu);
		
		JLabel lblTrecho = new JLabel("Trecho");
		lblTrecho.setBounds(22, 67, 68, 14);
		contentPane.add(lblTrecho);
		
		JLabel lblMenu_1 = new JLabel("Menu");
		lblMenu_1.setForeground(Color.RED);
		lblMenu_1.setBounds(108, 67, 68, 14);
		contentPane.add(lblMenu_1);
		
		JButton btnNewButton = new JButton("Marcar  Hora de Partida");
		btnNewButton.setBounds(195, 7, 172, 23);
		contentPane.add(btnNewButton);
		
		JButton btnMarcarTempoDe = new JButton("Marcar  Tempo de Viagem");
		btnMarcarTempoDe.setBounds(195, 43, 172, 23);
		contentPane.add(btnMarcarTempoDe);
		
		JButton btnNewButton_1_1 = new JButton("Marcar Dia de Partida");
		btnNewButton_1_1.setBounds(195, 77, 172, 23);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.setBounds(31, 132, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_2 = new JButton("Continuar");
		btnNewButton_1_2.setBounds(302, 132, 89, 23);
		contentPane.add(btnNewButton_1_2);
	}

}
