import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JButton;

public class JsetHora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JsetHora frame = new JsetHora();
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
	public JsetHora() {
		setTitle("SetHora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 202, 205);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hora");
		lblNewLabel.setBounds(42, 27, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblMinuto = new JLabel("Minuto");
		lblMinuto.setBounds(42, 49, 46, 14);
		contentPane.add(lblMinuto);
		
		JLabel lblSegundo = new JLabel("Segundo");
		lblSegundo.setBounds(42, 71, 46, 14);
		contentPane.add(lblSegundo);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(103, 24, 30, 20);
		contentPane.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(103, 46, 30, 20);
		contentPane.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(103, 68, 30, 20);
		contentPane.add(spinner_2);
		
		JButton btnNewButton = new JButton("Marcar");
		btnNewButton.setBounds(59, 94, 65, 20);
		contentPane.add(btnNewButton);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(3, 134, 72, 20);
		contentPane.add(btnVoltar);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.setBounds(99, 134, 83, 20);
		contentPane.add(btnContinuar);
	}

}
