package vision;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import SetData;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JDesktopPane;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuItem JmiClient1,JmiAirline1,JmiClient2,JmiAirline2;
	private JDesktopPane JDesktop;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setResizable(false);
		setTitle("APEIROVOOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setExtendedState(JFrame.MAXIMIZED_BOTH); para deixar em tela cheia NÃO USARAS ESSA MERDA
		setBounds(100, 100, 830, 669);
		TrataMenusitens tratar = new TrataMenusitens();
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("adf");
		setJMenuBar(menuBar);
		
		JMenu JmCadastrar = new JMenu("Cadastrar");
		JmCadastrar.setMnemonic('A');
		menuBar.add(JmCadastrar);
		
		JmiClient1 = new JMenuItem("Cliente");
		JmCadastrar.add(JmiClient1);
		JmiClient1.addActionListener(tratar);
		
		JmiAirline1 = new JMenuItem("Airline");
		JmCadastrar.add(JmiAirline1);
		JmiAirline1.addActionListener(tratar);
		
		JMenu JmLogar = new JMenu("Logar");
		JmLogar.setMnemonic('S');
		menuBar.add(JmLogar);
		
		JmiClient2 = new JMenuItem("Cliente");
		JmLogar.add(JmiClient2);
		JmiClient2.addActionListener(tratar);
		
		JmiAirline2 = new JMenuItem("Airline");
		JmLogar.add(JmiAirline2);
		JmiAirline2.addActionListener(tratar);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5,5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JDesktop = new JDesktopPane();
		JDesktop.setBounds(0, 0, 816, 609);
		contentPane.add(JDesktop);
		
	}
	
	private class TrataMenusitens implements ActionListener{
		

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == JmiClient1 ) {
				CadClient tela = new CadClient();
				JDesktop.add(tela);
				tela.setVisible(true);
			}
			if(e.getSource() == JmiAirline1) {
				CadAirlin tela = new CadAirlin();
				JDesktop.add(tela);
				tela.setVisible(true);
			}
			if(e.getSource() == JmiClient2) {
				LogClient tela = new LogClient();
				JDesktop.add(tela);
				tela.setVisible(true);
				
				
			}
			if(e.getSource() == JmiAirline2) {
				JOptionPane.showMessageDialog(null,"Login de Airline em Desenvolvimento","Desenvolvimento",JOptionPane.INFORMATION_MESSAGE);
			}
			
		}
		
	}
}
