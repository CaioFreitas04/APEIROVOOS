package test;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CadClient extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField_Nome;
	private JTextField textField_CPF;
	private JTextField textField_Endereco;
	private JTextField textField_Email;
	private JTextField textField_MesH;
	private JTextField textField_AnoH;
	private JTextField textField_DiaH;
	private JTextField textField_DiaN;
	private JTextField textField_MesN;
	private JTextField textField_AnoN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadClient frame = new CadClient();
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
	public CadClient() {
		setTitle("Cadastrar Cliente");
		setBounds(100, 100, 670, 266);
		
		JPanel contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPane, BorderLayout.CENTER);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(62, 56, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(62, 87, 46, 14);
		contentPane.add(lblCpf);
		
		JLabel lblEndereo = new JLabel("Endereço");
		lblEndereo.setBounds(41, 118, 67, 14);
		contentPane.add(lblEndereo);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(62, 149, 46, 14);
		contentPane.add(lblEmail);
		
		textField_Nome = new JTextField();
		textField_Nome.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					textField_CPF.requestFocus();
				}
			}
		});
		textField_Nome.setColumns(10);
		textField_Nome.setBounds(128, 53, 112, 20);
		contentPane.add(textField_Nome);
		
		textField_CPF = new JTextField();
		textField_CPF.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					textField_Endereco.requestFocus();
				}
			}
		});
		textField_CPF.setColumns(10);
		textField_CPF.setBounds(128, 84, 112, 20);
		contentPane.add(textField_CPF);
		
		textField_Endereco = new JTextField();
		textField_Endereco.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					textField_Email.requestFocus();
				}
			}
		});
		textField_Endereco.setColumns(10);
		textField_Endereco.setBounds(128, 115, 112, 20);
		contentPane.add(textField_Endereco);
		
		textField_Email = new JTextField();
		textField_Email.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					textField_DiaH.requestFocus();
				}
			}
		});
		textField_Email.setColumns(10);
		textField_Email.setBounds(128, 146, 112, 20);
		contentPane.add(textField_Email);
		
		JButton JbCadastrar = new JButton("Cadastrar");
		JbCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Nome;
				String CPF;
				String Email;
				String End;
				
				String DiaN;
				int Dian;
				String MesN;
				int Mesn;
				String AnoN;
				int Anon;
				String DiaH;
				int Diah;
				String MesH;
				int Mesh;
				String AnoH;
				int Anoh;
				
				CPF = textField_CPF.getText();
				
				boolean validcpf = false;
				Pessoa checkcpf = new Pessoa();
				validcpf = checkcpf.setCPF(CPF);
				if(validcpf) {
					Nome = textField_Nome.getText();
					Email = textField_Email.getText();
					End = textField_Endereco.getText();
					DiaN = textField_DiaN.getText();
					MesN = textField_MesN.getText();
					AnoN = textField_AnoN.getText();
					Dian = Integer.parseInt(DiaN);
					Mesn = Integer.parseInt(MesN);
					Anon = Integer.parseInt(AnoN);
					Data Hoje = new Data(Dian,Mesn,Anon);
					DiaH = textField_DiaH.getText();
					MesH = textField_MesH.getText();
					AnoH = textField_AnoH.getText();
					Diah = Integer.parseInt(DiaH);
					Mesh = Integer.parseInt(MesH);
					Anoh = Integer.parseInt(AnoH);
					Data Nascimento = new Data(Diah,Mesh,Anoh);
					limparCont();
					Cliente d = new Cliente(Nome,CPF,End,Nascimento,Hoje,Email);
				    DadosClientes.add(d);
				
					//cabo
				}
				else {
					JOptionPane.showMessageDialog(null,"CPF Invalido!!!","ERRO",JOptionPane.ERROR_MESSAGE);
				}
						
			}
		});
		JbCadastrar.setBounds(547, 199, 104, 23);
		contentPane.add(JbCadastrar);
		
		JButton JbVoltar = new JButton("Voltar");
		JbVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
			
		});
		JbVoltar.setBounds(41, 199, 89, 23);
		contentPane.add(JbVoltar);
		
		textField_MesH = new JTextField();
		textField_MesH.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					textField_AnoH.requestFocus();
				}
			}
		});
		textField_MesH.setColumns(10);
		textField_MesH.setBounds(371, 84, 35, 20);
		contentPane.add(textField_MesH);
		
		textField_AnoH = new JTextField();
		textField_AnoH.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					textField_DiaN.requestFocus();
				}
			}
		});
		textField_AnoH.setColumns(10);
		textField_AnoH.setBounds(406, 84, 74, 20);
		contentPane.add(textField_AnoH);
		
		textField_DiaH = new JTextField();
		textField_DiaH.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					textField_MesH.requestFocus();
				}
			}
		});
		textField_DiaH.setColumns(10);
		textField_DiaH.setBounds(336, 84, 35, 20);
		contentPane.add(textField_DiaH);
		
		textField_DiaN = new JTextField();
		textField_DiaN.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					textField_MesN.requestFocus();
				}
			}
		});
		textField_DiaN.setColumns(10);
		textField_DiaN.setBounds(496, 84, 35, 20);
		contentPane.add(textField_DiaN);
		
		textField_MesN = new JTextField();
		textField_MesN.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					textField_AnoN.requestFocus();
				}
			}
		});
		textField_MesN.setColumns(10);
		textField_MesN.setBounds(531, 84, 35, 20);
		contentPane.add(textField_MesN);
		
		textField_AnoN = new JTextField();
		textField_AnoN.setColumns(10);
		textField_AnoN.setBounds(566, 84, 74, 20);
		contentPane.add(textField_AnoN);
		
		JLabel lblDataDoDia = new JLabel("Hoje");
		lblDataDoDia.setBounds(383, 65, 46, 14);
		contentPane.add(lblDataDoDia);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento");
		lblDataDeNascimento.setBounds(520, 64, 112, 14);
		contentPane.add(lblDataDeNascimento);

	}
		//Metodo para Limpar os conteudos apos o cadastro
		private void limparCont(){
		textField_Nome.setText(" ");
		textField_CPF.setText("");
		textField_Email.setText("");
		textField_Endereco.setText("");
		textField_DiaN.setText("");
		textField_DiaH.setText("");
		textField_MesN.setText("");
		textField_MesH.setText("");
		textField_AnoN.setText("");
		textField_AnoH.setText("");
}

}
