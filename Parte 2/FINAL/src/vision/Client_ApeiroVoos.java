package vision;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JDesktopPane;

public class Client_ApeiroVoos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JDesktopPane JDeskTopAP;
	private JMenuItem JmiAdCar,JmiRemCar,JmiConfCar,JmiFinCar,JmiPesHot,JmiPesVoo,JmiPerf;
	private Cliente usu;

	/**
	 * Create the frame.
	 */
	
	public Client_ApeiroVoos(Cliente x) {
		usu = x;
		setTitle("Cliente_Apeirovoo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 973, 752);
		TrataMenusitens tratar = new TrataMenusitens();
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu JmCarrinho = new JMenu("Carrinho");
		menuBar.add(JmCarrinho);
		
		JmiAdCar = new JMenuItem("Adicionar ao Carrinho");
		JmCarrinho.add(JmiAdCar);
		JmiAdCar.addActionListener(tratar);
		
		JmiRemCar = new JMenuItem("Remover Item do Carrinho");
		JmCarrinho.add(JmiRemCar);
		JmiRemCar.addActionListener(tratar);
		
		JmiConfCar = new JMenuItem("Conferir itens do Carrinho");
		JmCarrinho.add(JmiConfCar);
		JmiConfCar.addActionListener(tratar);
		
		JmiFinCar = new JMenuItem("Finalizar Compra do Carrinho");
		JmCarrinho.add(JmiFinCar);
		JmiFinCar.addActionListener(tratar);
		
		JMenu JmiUsua = new JMenu("Usuario");
		menuBar.add(JmiUsua);
		
		JmiPerf = new JMenuItem("Informaçoes do Usuario");
		JmiUsua.add(JmiPerf);
		JmiPerf.addActionListener(tratar);
		
		

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 1, 1));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JDeskTopAP = new JDesktopPane();
		JDeskTopAP.setBounds(10, 11, 947, 674);
		contentPane.add(JDeskTopAP);
	}
	private class TrataMenusitens implements ActionListener{
		

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == JmiAdCar ) {
				InterfaceCompra tela = new InterfaceCompra(usu);
				JDeskTopAP.add(tela);
				tela.setVisible(true);
			}
			/*if(e.getSource() == JmiRemCar) {
				
				JDeskTopAP.add(tela);
				tela.setVisible(true);
			}
			if(e.getSource() == JmiConfCar) {
				
				JDeskTopAP.add(tela);
				tela.setVisible(true);
			}
			if(e.getSource() == JmiFinCar) {
				
				JDeskTopAP.add(tela);
				tela.setVisible(true);
			}
			if(e.getSource( ) == JmiPesHot) {
				
				JDeskTopAP.add(tela);
				tela.setVisible(true);
			}
			if(e.getSource() == JmiPesVoo) {
				
				JDeskTopAP.add(tela);
				tela.setVisible(true);
			}*/
			if(e.getSource() == JmiPerf) {
				Perfil tela = new Perfil(usu);
				JDeskTopAP.add(tela);
				tela.setVisible(true);
			}
			
			
		}
		
	}
}
