package vision;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class InterfaceFinComp extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private Cliente ClienteX;

	/**
	 * Create the frame.
	 */
	public InterfaceFinComp(Cliente X) {
		setBounds(100, 100, 450, 197);
		getContentPane().setLayout(null);
		ClienteX = X;
		
		JButton JbNão = new JButton("Não");
		JbNão.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		JbNão.setFont(new Font("SansSerif", Font.PLAIN, 18));
		JbNão.setBounds(28, 91, 111, 38);
		getContentPane().add(JbNão);
		
		JButton JbSim = new JButton("Sim");
		JbSim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClienteX.comprar();
				JOptionPane.showMessageDialog(null,"Compra Realizada","Obrigado por comprar",JOptionPane.INFORMATION_MESSAGE);
				if(ClienteX.makeVIP(ClienteX.getCadastro())) {
					JOptionPane.showMessageDialog(null,"Parabéns","Você agora é um dos nossos Clientes VIPs!",JOptionPane.INFORMATION_MESSAGE);
				}
				dispose();
			}
		});
		JbSim.setFont(new Font("SansSerif", Font.PLAIN, 18));
		JbSim.setBounds(281, 91, 111, 38);
		getContentPane().add(JbSim);
		
		JLabel lblNewLabel = new JLabel("Tem Certeza que Gostaria de Finalizar");
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 19));
		lblNewLabel.setBounds(52, 30, 357, 29);
		getContentPane().add(lblNewLabel);

	}
}
