package vision;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class InterfaceRemCompra extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JMenu JmReserva;
	private Cliente ClienteX;
	private ArryList<Reserva> ReservaX;
	private ArryList<Passagem> PassagemX;
	

	/**
	 * Create the frame.
	 */
	public InterfaceRemCompra(Cliente X) {
		setTitle("Remover item no Carrinho");
		setTitle("Remover Compra");
		ClienteX = X;
		ReservaX = new ArrayList<Reserva>;
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JMenu mnNewMenu = new JMenu("Compras");
		mnNewMenu.setFont(new Font("Arial", Font.BOLD, 15));
		mnNewMenu.setBounds(45, 18, 111, 19);
		getContentPane().add(mnNewMenu);
		
		JMenu JmPassagens = new JMenu("Passagens");
		mnNewMenu.add(JmPassagens);
		
		JmReserva = new JMenu("Reserva");
		mnNewMenu.add(JmReserva);
		
		JButton JbVoltar = new JButton("Voltar");
		JbVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		JbVoltar.setBounds(26, 205, 90, 28);
		getContentPane().add(JbVoltar);
		
		JButton JbRemove = new JButton("Remover");
		JbRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
				
			}
		});
		JbRemove.setBounds(307, 205, 90, 28);
		getContentPane().add(JbRemove);
		
		
		ReservaX = CidadeX.getReservas()/
		PassagemX = CidadeX.getPassagens();
		
		if(ReservaX != null) {
			if(PassagemX != null){
			ArrayList<JMenuItem> Apeiro = new ArrayList<JMenuItem>();
			ArrayList<JMenuItem> Apeiroc = new ArrayList<JMenuItem>();
		
			for( i = 0;i<ReservaX.size();i++) {
			 			
			 			Apeiro.add(new JMenuItem(ReservaX.get(i).()));
			 			JmReserva.add(Apeiro.get(i));
			 			Apeiro.get(i).addActionListener(new ActionListener() {
			 				public void actionPerformed(ActionEvent e) {
			 					JmReserva.setText(ReservaX.get(i).getNome_de_Divulgacao());
								
			 				}
			 			});
			 			
			 			}
			for( i = 0;i<PassagemX.size();i++) {
	 			
	 			Apeiro.add(new JMenuItem(PassagemX.get(i).()));
	 			JmPassagens.add(Apeiroc.get(i));
	 			Apeiroc.get(i).addActionListener(new ActionListener() {
	 				public void actionPerformed(ActionEvent e) {
	 					JmPassagens.setText(PassagemX.get(i).getNome_de_Divulgacao());
						
	 				}
	 			});
	 			
	 			}
			
			}
		}
		
	}
}
	}
}
