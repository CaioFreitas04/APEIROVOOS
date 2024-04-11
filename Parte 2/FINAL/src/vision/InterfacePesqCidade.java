package vision;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfacePesqCidade extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField_CidadeNome;
	private Cliente ClienteX;
	private Cidade CidadeY;
	
	/**
	 * Create the frame.
	 */
	public InterfacePesqCidade(Cliente X) {
		ClienteX = X;
		setTitle("Pesquisa Cidade");
		setBounds(100, 100, 553, 247);
		getContentPane().setLayout(null);
		
		textField_CidadeNome = new JTextField();
		textField_CidadeNome.setColumns(10);
		textField_CidadeNome.setBounds(241, 21, 208, 28);
		getContentPane().add(textField_CidadeNome);
		
		JLabel lblPesqCid = new JLabel("Pesquise a Cidade que Gostaria de ir");
		lblPesqCid.setBounds(24, 27, 222, 16);
		getContentPane().add(lblPesqCid);
		
		
		Button JbPesq = new Button("Pesquisar hoteis locais");
		JbPesq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println(textField_CidadeNome.getText());
				
				CidadeY = DadosCidades.search(textField_CidadeNome.getText());
		        if(CidadeY != null) DadosPesquisas.addPesquisas(CidadeY, null, null);
				InterfacePesqHotelLoc tela = new InterfacePesqHotelLoc(CidadeY,ClienteX);
				tela.setVisible(true);
				dispose();
				
				
			}
		});
		JbPesq.setBounds(262, 76, 170, 23);
		getContentPane().add(JbPesq);
		
		Button JbVoltar = new Button("Voltar");
		JbVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		JbVoltar.setBounds(221, 183, 76, 23);
		getContentPane().add(JbVoltar);
		
		Button JbPesq_1 = new Button("Comprar passagens de ida");
		JbPesq_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println(textField_CidadeNome.getText());
				
				CidadeY = DadosCidades.search(textField_CidadeNome.getText());
		        if(CidadeY != null) DadosPesquisas.addPesquisas(CidadeY, null, null);
				InterfacePesqVoo tela = new InterfacePesqVoo(CidadeY,ClienteX);
				tela.setVisible(true);
				dispose();
			}
		});
		JbPesq_1.setBounds(262, 129, 170, 23);
		getContentPane().add(JbPesq_1);

	}
}
