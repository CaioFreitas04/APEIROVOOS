import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JButton;

public class SetCid {

	private JFrame frmSetcid;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SetCid window = new SetCid();
					window.frmSetcid.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SetCid() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSetcid = new JFrame();
		frmSetcid.setTitle("SETCid");
		frmSetcid.setBounds(100, 100, 450, 300);
		frmSetcid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSetcid.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(162, 58, 159, 20);
		frmSetcid.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome da Cidade");
		lblNewLabel.setBounds(57, 61, 95, 14);
		frmSetcid.getContentPane().add(lblNewLabel);
		
		JLabel lblQuantidadeDeHoteis = new JLabel("Quantidade de Hoteis");
		lblQuantidadeDeHoteis.setBounds(248, 133, 154, 14);
		frmSetcid.getContentPane().add(lblQuantidadeDeHoteis);
		
		JLabel lblQuantidadeDeAeroportos = new JLabel("Quantidade de Aeroportos");
		lblQuantidadeDeAeroportos.setBounds(20, 133, 142, 14);
		frmSetcid.getContentPane().add(lblQuantidadeDeAeroportos);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(376, 130, 30, 20);
		frmSetcid.getContentPane().add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(161, 130, 30, 20);
		frmSetcid.getContentPane().add(spinner_1);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(313, 227, 89, 23);
		frmSetcid.getContentPane().add(btnNewButton);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(20, 227, 89, 23);
		frmSetcid.getContentPane().add(btnVoltar);
	}
}
