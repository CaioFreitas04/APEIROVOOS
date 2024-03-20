import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class JReserva extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JReserva frame = new JReserva();
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
	public JReserva() {
		setTitle("SetReserva");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 344, 199);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Marcar Chekin");
		btnNewButton.setBounds(10, 25, 134, 23);
		contentPane.add(btnNewButton);
		
		JButton btnMarcarChekout = new JButton("Marcar Chekout");
		btnMarcarChekout.setBounds(184, 25, 134, 23);
		contentPane.add(btnMarcarChekout);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(34, 101, 95, 23);
		contentPane.add(btnVoltar);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.setBounds(198, 101, 95, 23);
		contentPane.add(btnContinuar);
	}

}
