package vision;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogClient extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField_CPF;
	private JTextField textField_Usuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogClient frame = new LogClient();
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
	public LogClient() {
		setTitle("Login do Cliente");
		setBounds(100, 100, 312, 217);
		getContentPane().setLayout(null);
		
		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setLabelFor(this);
		lblCPF.setBounds(10, 39, 46, 14);
		getContentPane().add(lblCPF);
		
		JLabel lblNewLabel = new JLabel("Nome de Usuário");
		lblNewLabel.setBounds(10, 64, 107, 14);
		getContentPane().add(lblNewLabel);
		
		textField_CPF = new JTextField();
		textField_CPF.setBounds(145, 36, 121, 20);
		getContentPane().add(textField_CPF);
		textField_CPF.setColumns(10);
		
		textField_Usuario = new JTextField();
		textField_Usuario.setColumns(10);
		textField_Usuario.setBounds(145, 61, 121, 20);
		getContentPane().add(textField_Usuario);
		
		JButton JbLogar = new JButton("Logar");
		JbLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Nome;
				String CPFr;
				int CPF1;
				Nome = textField_Usuario.getText();
				CPFr = textField_CPF.getText();
				CPF1 = Integer.parseInt(CPFr);
				// olhar no banco de dados se o Usuario e o CPF Existem e se estão no mesmo cliente
				if((Nome == Pessoa.nome)&& (CPFr == Pessoa.CPF)) {
					dispose();
					JOptionPane.showMessageDialog(null,"Login de Airline em Desenvolvimento","Desenvolvimento",JOptionPane.INFORMATION_MESSAGE);
				}

				
			}
		});
		JbLogar.setBounds(177, 137, 89, 23);
		getContentPane().add(JbLogar);
		
		JButton JbVoltar = new JButton("Voltar");
		JbVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		JbVoltar.setBounds(27, 137, 89, 23);
		getContentPane().add(JbVoltar);

	}
	
}
