package vision;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;


public class InterfaceRemCompra extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JMenu JmReserva;
	private Cliente ClienteX;
	private ArrayList<Reserva> ReservaX;
	private ArrayList<Passagem> PassagemX;
	private Passagem RemPas;
	private Reserva RemRes;

	/**
	 * Create the frame.
	 */
	public InterfaceRemCompra(Cliente X) {
		setTitle("Remover item no Carrinho");
		setTitle("Remover Compra");
		ClienteX = X;
		ReservaX = new ArrayList<Reserva>();
		PassagemX = new ArrayList<Passagem>();
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
				if(RemRes!=null) {
				ClienteX.RemoverdoCarrinho(RemRes);
				}
				else {
					if(RemPas!=null) {
						ClienteX.RemoverdoCarrinho(RemPas);
					}
					else {
						JOptionPane.showMessageDialog(null,"Erro 71","Nada foi Selecionado!!",JOptionPane.INFORMATION_MESSAGE);
					}
				}
				
				
				
				
				
			}
		});
		JbRemove.setBounds(307, 205, 90, 28);
		getContentPane().add(JbRemove);
		
		
		ReservaX = ClienteX.getReservas();
		PassagemX = ClienteX.getPassagens();
		
		if(ReservaX != null) {
			if(PassagemX != null){
			ArrayList<JMenuItem> Apeiro = new ArrayList<JMenuItem>();
			ArrayList<JMenuItem> Apeiroc = new ArrayList<JMenuItem>();
		
			for(int i = 0;i<ReservaX.size();i++) {
			 			
			 			Apeiro.add(new JMenuItem(ReservaX.get(i).getHotel().getNome_de_Divulgacao()));
			 			JmReserva.add(Apeiro.get(i));
			 			Apeiro.get(i).addActionListener(new ActionListener() {
			 				public void actionPerformed(ActionEvent e) {
			 					JmReserva.setText(ReservaX.get(i).getHotel().getNome_de_Divulgacao());
								RemRes = ReservaX.get(i);
			 				}
			 			});
			 			
			 			}
			for(int i  = 0;i<PassagemX.size();i++) {
	 			
	 			Apeiroc.add(new JMenuItem("Destino Ah:"+PassagemX.get(i).getVoo().getOrigem().getNome()));
	 			JmPassagens.add(Apeiroc.get(i));
	 			Apeiroc.get(i).addActionListener(new ActionListener() {
	 				public void actionPerformed(ActionEvent e) {
	 					JmPassagens.setText("Destino Ah:"+PassagemX.get(i).getVoo().getOrigem().getNome());
						RemPas = PassagemX.get(i);
	 				}
	 			});
	 			
	 			}
			
			}
		}
		
	}
}
	}
}