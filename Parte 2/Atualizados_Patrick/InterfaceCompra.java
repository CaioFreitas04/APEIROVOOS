package vision;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JInternalFrame;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JDesktopPane;

public class InterfaceCompra extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JMenuItem JmiPesqCidade,JmiPesqHotel;
	private Cliente ClienteX;
	private JDesktopPane Desktop;


	/**
	 * Create the frame.
	 */
	public InterfaceCompra(Cliente X) {
		setTitle("Compra");
		setBounds(100, 100, 656, 485);
		ClienteX = X;
		
		TrataMenusitens tratar = new TrataMenusitens();
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu JmPesq = new JMenu("Pesquisar");
		menuBar.add(JmPesq);
		
		JmiPesqHotel = new JMenuItem("Hotel");
		JmPesq.add(JmiPesqHotel);
		JmiPesqHotel.addActionListener(tratar);
		
		JmiPesqCidade = new JMenuItem("Destino");
		JmPesq.add(JmiPesqCidade);
		getContentPane().setLayout(null);
		JmiPesqCidade.addActionListener(tratar);
		
		Desktop = new JDesktopPane();
		Desktop.setBounds(6, 6, 638, 611);
		getContentPane().add(Desktop);

	}
	private class TrataMenusitens implements ActionListener{
		

		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == JmiPesqHotel) {
				InterfacePesqHotel tela = new InterfacePesqHotel(ClienteX);
				Desktop.add(tela);
				tela.setVisible(true);
			}	
			if(e.getSource() == JmiPesqCidade) {
				InterfacePesqCidade tela = new InterfacePesqCidade(ClienteX);
				Desktop.add(tela);
				tela.setVisible(true);
			}
		
		}
	}
}
