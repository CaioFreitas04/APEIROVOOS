import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JSpinner;

public class JCompra extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JCompra frame = new JCompra();
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
	public JCompra() {
		setTitle("SetComp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 180, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Cadastrar Cliente");
		btnNewButton.setBounds(24, 35, 121, 23);
		contentPane.add(btnNewButton);
		
		JButton btnPassagem = new JButton("Passagem");
		btnPassagem.setBounds(24, 69, 121, 23);
		contentPane.add(btnPassagem);
		
		JLabel lblNewLabel = new JLabel("Quantidade de Passagens");
		lblNewLabel.setBounds(23, 101, 149, 14);
		contentPane.add(lblNewLabel);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(68, 126, 30, 20);
		contentPane.add(spinner);
		
		JButton btnNewButton_1 = new JButton("Continuar");
		btnNewButton_1.setBounds(40, 172, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Voltar");
		btnNewButton_1_1.setBounds(40, 216, 89, 23);
		contentPane.add(btnNewButton_1_1);
	}
}
