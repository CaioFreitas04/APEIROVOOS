import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JPesquiaCiadde extends JFrame {

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
					JPesquiaCiadde frame = new JPesquiaCiadde();
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
	public JPesquiaCiadde() {
		setTitle("PesquisaCidade");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(231, 69, 126, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome da Cidade");
		lblNewLabel.setBounds(113, 72, 96, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Marcar Data de Chegada");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(30, 125, 192, 23);
		contentPane.add(btnNewButton);
		
		JButton btnMarcarDataDe = new JButton("Marcar Data de Partida");
		btnMarcarDataDe.setBounds(232, 125, 163, 23);
		contentPane.add(btnMarcarDataDe);
		
		JButton btnNewButton_1_1 = new JButton("Voltar");
		btnNewButton_1_1.setBounds(54, 202, 89, 23);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1 = new JButton("Conferir");
		btnNewButton_1.setBounds(289, 202, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
