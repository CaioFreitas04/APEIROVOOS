package vision;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Button;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class InterfacePesqHotelLoc extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_DiaCheG;
	private JTextField textField_MesCheG;
	private JTextField textField_DiaPar;
	private JTextField textField_MesPar;
	private JTextField textField_AnoPar;
	private JTextField textField_AnoCheG;
	private Cidade CidadeC;
	private ArrayList<Hotel> Hoteis;
	private Cliente ClienteY;
	private Hotel HotelZ;
	private int i;
	private Reserva ReservaX;
	private Data DCheg;
	private Data Dpart;
	private JMenu JmSeleção;


	/**
	 * Create the frame.
	 */
	public InterfacePesqHotelLoc(Cidade X,Cliente Y) {
		setTitle("Pesquisar Hotel na Cidade");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 538, 300);
		CidadeC = X;
		ClienteY = Y;
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPesqHot = new JLabel("Pesquise o Hotel que Gostaria de ir");
		lblPesqHot.setBounds(18, 29, 222, 16);
		contentPane.add(lblPesqHot);
		
		JLabel lblDataCheg = new JLabel("Quando Gostaria de Chegar ao seu destino");
		lblDataCheg.setBounds(18, 127, 255, 16);
		contentPane.add(lblDataCheg);
		
		JLabel lblData = new JLabel("Marcar Datas Formatação(Dia/Mes/Ano)");
		lblData.setBounds(214, 63, 238, 16);
		contentPane.add(lblData);
		
		JLabel lblQuandoGostariaDe = new JLabel("Quando Gostaria de Partir");
		lblQuandoGostariaDe.setBounds(18, 170, 153, 16);
		contentPane.add(lblQuandoGostariaDe);
		
		textField_DiaCheG = new JTextField();
		textField_DiaCheG.setBounds(272, 127, 24, 23);
		contentPane.add(textField_DiaCheG);
		
		textField_MesCheG = new JTextField();
		textField_MesCheG.setBounds(302, 127, 24, 23);
		contentPane.add(textField_MesCheG);
		
		textField_DiaPar = new JTextField();
		textField_DiaPar.setBounds(181, 170, 24, 23);
		contentPane.add(textField_DiaPar);
		
		textField_MesPar = new JTextField();
		textField_MesPar.setBounds(211, 170, 24, 23);
		contentPane.add(textField_MesPar);
		
		textField_AnoPar = new JTextField();
		textField_AnoPar.setBounds(241, 170, 41, 23);
		contentPane.add(textField_AnoPar);
		
		textField_AnoCheG = new JTextField();
		textField_AnoCheG.setBounds(332, 127, 41, 23);
		contentPane.add(textField_AnoCheG);
		
		Button JbPesq = new Button("Pesquisar");
		JbPesq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SeleçãoQuartos tela = new SeleçãoQuartos(ReservaX,HotelZ,ClienteY);
				dispose();
				tela.setVisible(true);
				
			}
		});
		JbPesq.setBounds(436, 208, 76, 23);
		contentPane.add(JbPesq);
		
		Button JbVoltar = new Button("Voltar");
		JbVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		JbVoltar.setBounds(69, 208, 76, 23);
		contentPane.add(JbVoltar);
		
		JmSeleção = new JMenu("Hoteis");
		JmSeleção.setHorizontalAlignment(SwingConstants.CENTER);
		JmSeleção.setBounds(241, 26, 111, 19);
		contentPane.add(JmSeleção);
		
		ArrayList<JMenuItem> Apeiro = new ArrayList<JMenuItem>();
		String DiaN = textField_DiaCheG.getText();
		int Dian;
		String MesN = textField_MesCheG.getText();
		int Mesn;
		String AnoN = textField_AnoCheG.getText();
		int Anon;
		String DiaH = textField_DiaPar.getText();
		int Diah;
		String MesH = textField_MesPar.getText();
		int Mesh;
		String AnoH = textField_AnoPar.getText();
		int Anoh;
		
		Dian = Integer.parseInt(DiaN);
		Mesn = Integer.parseInt(MesN);
		Anon = Integer.parseInt(AnoN);
		Diah = Integer.parseInt(DiaH);
		Mesh = Integer.parseInt(MesH);
		Anoh = Integer.parseInt(AnoH);
		
		Dpart = new Data(Diah,Mesh,Anoh);
		DCheg = new Data(Dian,Mesn,Anon);
		ReservaX = new Reserva(DCheg,Dpart);
		Pesquisa p1 = new Pesquisa(CidadeC,DCheg,Dpart);
		Hoteis = CidadeC.getHoteis();
		
 		for( i = 0;i<Hoteis.size();i++) {
 			
 			Apeiro.add(new JMenuItem(Hoteis.get(i).getNome_de_Divulgacao()));
 			JmSeleção.add(Apeiro.get(i));
 			Apeiro.get(i).addActionListener(new ActionListener() {
 				public void actionPerformed(ActionEvent e) {
 					HotelZ = Hoteis.get(i);
 					Pesquisa p2 = new Pesquisa(HotelZ,DCheg,Dpart);
 					JmSeleção.setText(Hoteis.get(i).getNome_de_Divulgacao());
					
 				}
 			});
 			
 			}
 		}
		
	}

