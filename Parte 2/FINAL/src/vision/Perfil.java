package vision;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Perfil extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField_Namo;
	private JTextField textField_Cpf;



	/**
	 * Create the frame.
	 */
	public Perfil(Cliente x) {
		setToolTipText("");
		setForeground(new Color(157, 157, 157));
		setTitle("Perfil");
		setBounds(100, 100, 294, 217);
		getContentPane().setLayout(null);
	
		
		JLabel lblIcone = new JLabel("");
		lblIcone.setIcon(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\Apeirovoos\\src\\img\\2203549_admin_avatar_human_login_user_icon (1).png"));
		lblIcone.setBounds(17, 29, 64, 73);
		getContentPane().add(lblIcone);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Palatino Linotype", Font.PLAIN, 12));
		lblNome.setBounds(93, 39, 55, 16);
		getContentPane().add(lblNome);
		
		JLabel lblCpf = new JLabel("Cpf :");
		lblCpf.setFont(new Font("Palatino Linotype", Font.PLAIN, 12));
		lblCpf.setBounds(93, 78, 55, 16);
		getContentPane().add(lblCpf);
		
		textField_Namo = new JTextField();
		textField_Namo.setText(x.getNome());
		textField_Namo.setEditable(false);
		textField_Namo.setBounds(139, 29, 122, 28);
		getContentPane().add(textField_Namo);
		textField_Namo.setColumns(10);
		
		textField_Cpf = new JTextField();
		textField_Cpf.setText(x.getCPF());
		textField_Cpf.setEditable(false);
		textField_Cpf.setColumns(10);
		textField_Cpf.setBounds(139, 67, 122, 28);
		getContentPane().add(textField_Cpf);
		
		JButton JbVoltar = new JButton("Voltar");
		JbVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		JbVoltar.setBounds(93, 130, 90, 28);
		getContentPane().add(JbVoltar);

	}
}
