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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client_ApeiroVoos frame = new Client_ApeiroVoos();
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
	public Client_ApeiroVoos() {
		setTitle("Cliente_Apeirovoo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 883, 618);
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
		
		JMenu JmPes = new JMenu("Pesquisar");
		menuBar.add(JmPes);
		
		JmiPesHot = new JMenuItem("Pesquisar Hotel");
		JmPes.add(JmiPesHot);
		JmiPesHot.addActionListener(tratar);
		
		JmiPesVoo = new JMenuItem("Pesquisar Voo");
		JmPes.add(JmiPesVoo);
		JmiPesVoo.addActionListener(tratar);
		
		JmiPerf = new JMenuItem("Perfil");
		menuBar.add(JmiPerf);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 1, 1));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JDeskTopAP = new JDesktopPane();
		JDeskTopAP.setBounds(10, 11, 847, 529);
		contentPane.add(JDeskTopAP);
	}
	private class TrataMenusitens implements ActionListener{
		

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == JmiClient1 ) {
				CadClient tela = new CadClient();
				JDeskTopAP.add(tela);
				tela.setVisible(true);
			}
			if(e.getSource() == JmiAirline1) {
				CadAirlin tela = new CadAirlin();
				JDeskTopAP.add(tela);
				tela.setVisible(true);
			}
			if(e.getSource() == JmiClient2) {
				LogClient tela = new LogClient();
				JDeskTopAP.add(tela);
				tela.setVisible(true);
				
				
			}
			
		}
		
	}
}
