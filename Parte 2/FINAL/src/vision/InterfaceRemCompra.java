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
	

	/**
	 * Create the frame.
	 */
	public InterfaceRemCompra(Cliente X) {
		setTitle("Remover Compra");
		ClienteX = X;
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
		
		/*
		ArrayList<JMenuItem> Apeiro = new ArrayList<JMenuItem>();
		ArrayList<JMenuItem> Apeiroc = new ArrayList<JMenuItem>();
		
		for( i = 0;i<Hoteis.size();i++) {
		 			
		 			Apeiro.add(new JMenuItem(Hoteis.get(i).getNome_de_Divulgacao()));
		 			JmSeleção.add(Apeiro.get(i));
		 			Apeiro.get(i).addActionListener(new ActionListener() {
		 				public void actionPerformed(ActionEvent e) {
		 					HotelZ = Hoteis.get(i);
		 					JmSeleção.setText(Hoteis.get(i).getNome_de_Divulgacao());
							
		 				}
		 			});
		 			
		 			}
		*/
		
	}
}
