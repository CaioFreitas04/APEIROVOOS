package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;

public class Client_VOO extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client_VOO frame = new Client_VOO();
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
	public Client_VOO() {
		setTitle("Cliente_Apeirovoo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 883, 618);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu JmCarrinho = new JMenu("Carrinho");
		menuBar.add(JmCarrinho);
		
		JMenuItem JmiAdCar = new JMenuItem("Adicionar ao Carrinho");
		JmCarrinho.add(JmiAdCar);
		
		JMenuItem JmiRemCar = new JMenuItem("Remover Item do Carrinho");
		JmCarrinho.add(JmiRemCar);
		
		JMenuItem JmiConfCar = new JMenuItem("Conferir itens do Carrinho");
		JmCarrinho.add(JmiConfCar);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Finalizar Compra do Carrinho");
		JmCarrinho.add(mntmNewMenuItem);
		
		JMenu JmPes = new JMenu("Pesquisar");
		menuBar.add(JmPes);
		
		JMenuItem JmiPesHot = new JMenuItem("Pesquisar Hotel");
		JmPes.add(JmiPesHot);
		
		JMenuItem JmiPesVoo = new JMenuItem("Pesquisar Voo");
		JmPes.add(JmiPesVoo);
		
		JMenuItem JmiPerf = new JMenuItem("Perfil");
		menuBar.add(JmiPerf);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 1, 1));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
