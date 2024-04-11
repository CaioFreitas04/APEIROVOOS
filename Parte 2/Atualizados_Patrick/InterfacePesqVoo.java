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
import java.awt.Window.Type;
import javax.swing.JCheckBox;

public class InterfacePesqVoo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_DiaCheG;
	private JTextField textField_MesCheG;
	private JTextField textField_AnoCheG;
	private Cidade CidadeC;
	private Cliente ClienteY;
	private Aeroporto AeroportoZ;
	private int i;
	private Reserva ReservaX;
	private Data DCheg;
	private ArrayList<voo> VoossCheg,VoossPart;
	private voo retorno;
	private JMenu JmSeleção,JmSeleção_1;
	private Passagem Pass;
	private JCheckBox CheckFt,CheckEcon;


	/**
	 * Create the frame.
	 */
	public InterfacePesqVoo(Cidade X,Cliente Y) {
		setTitle("Pesquisa Voo");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 539, 300);
		CidadeC = X;
		ClienteY = Y;
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPesqHot = new JLabel("Voos com Destino ah " + CidadeC.getCid());
		lblPesqHot.setBounds(18, 29, 222, 16);
		contentPane.add(lblPesqHot);
		
		JLabel lblDataCheg = new JLabel("Data de Partida");
		lblDataCheg.setBounds(18, 161, 102, 16);
		contentPane.add(lblDataCheg);
		
		JLabel lblData = new JLabel("Marcar Datas Formatação(Dia/Mes/Ano)");
		lblData.setBounds(18, 126, 238, 16);
		contentPane.add(lblData);
		
		textField_DiaCheG = new JTextField();
		textField_DiaCheG.setBounds(117, 158, 24, 23);
		contentPane.add(textField_DiaCheG);
		
		textField_MesCheG = new JTextField();
		textField_MesCheG.setBounds(151, 158, 24, 23);
		contentPane.add(textField_MesCheG);
		
		textField_AnoCheG = new JTextField();
		textField_AnoCheG.setBounds(185, 158, 41, 23);
		contentPane.add(textField_AnoCheG);
		
		Button JbPesq = new Button("Adicionar ao Carrinho");
		JbPesq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((retorno.qtdEconLivres() > 0) || (retorno.qtdFirstClassLivres() > 0)) {
					if(CheckFt.isSelected()&&CheckEcon.isSelected()) {
						JOptionPane.showMessageDialog(null,"Erro checksbox marcadas","Os dois foram marcados!!",JOptionPane.ERROR_MESSAGE);
					}
					else {
						if((!CheckFt.isSelected()&&!CheckEcon.isSelected())) {
							JOptionPane.showMessageDialog(null,"Erro checksbox desmarcadas","Nenhuma caixa foi marcada!!",JOptionPane.ERROR_MESSAGE);
						}
						else {
							if((CheckFt.isSelected())&&(retorno.qtdFirstClassLivres()>0)) {
								Pass = new Passagem(retorno,retorno.getPrecoFirstClass());
								ClienteY.adicionarAoCarrinho(Pass);JOptionPane.showMessageDialog(null,"Erro checksbox desmarcadas","Nenhuma caixa foi marcada!!",JOptionPane.ERROR_MESSAGE);
							}
							else {
								Pass = new Passagem(retorno,retorno.getPrecoEcon());
								ClienteY.adicionarAoCarrinho(Pass);
							}
						}
					}
				}
				else {
					JOptionPane.showMessageDialog(null,"Nenhuma Assento Disponivel","Espere a proxima remessa de Assentos!!",JOptionPane.ERROR_MESSAGE);
					
				}
			}
		});
		JbPesq.setBounds(394, 228, 119, 23);
		contentPane.add(JbPesq);
		
		Button JbVoltar = new Button("Voltar");
		JbVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		JbVoltar.setBounds(18, 228, 76, 23);
		contentPane.add(JbVoltar);
		
		JmSeleção = new JMenu("Voos");
		JmSeleção.setHorizontalAlignment(SwingConstants.CENTER);
		JmSeleção.setBounds(43, 52, 102, 26);
		contentPane.add(JmSeleção);
		
		JLabel lblVoosComPartindo = new JLabel("Voos com Partindo de <dynamic>");
		lblVoosComPartindo.setBounds(291, 29, 222, 16);
		contentPane.add(lblVoosComPartindo);
		
		JmSeleção_1 = new JMenu("Voos");
		JmSeleção_1.setHorizontalAlignment(SwingConstants.CENTER);
		JmSeleção_1.setBounds(301, 52, 102, 26);
		contentPane.add(JmSeleção_1);
		
		JLabel lblNewLabel = new JLabel("Economica: R$"+retorno.getPrecoEcon() );
		lblNewLabel.setBounds(257, 127, 136, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblFC = new JLabel("Primeira Classe: R$"+retorno.getPrecoFirstClass());
		lblFC.setBounds(257, 162, 136, 14);
		contentPane.add(lblFC);
		
		CheckFt = new JCheckBox(retorno.qtdFirstClassLivres()+" Assentos");
		CheckFt.setBounds(399, 157, 102, 23);
		contentPane.add(CheckFt);
		
		CheckEcon = new JCheckBox(retorno.qtdEconLivres()+" Assentos");
		CheckEcon.setBounds(399, 126, 102, 23);
		contentPane.add(CheckEcon);
		
		ArrayList<JMenuItem> Apeiroc = new ArrayList<JMenuItem>();
		ArrayList<JMenuItem> Apeirop = new ArrayList<JMenuItem>();
		
		String DiaN = textField_DiaCheG.getText();
		int Dian;
		String MesN = textField_MesCheG.getText();
		int Mesn;
		String AnoN = textField_AnoCheG.getText();
		int Anon;

		
		Dian = Integer.parseInt(DiaN);
		Mesn = Integer.parseInt(MesN);
		Anon = Integer.parseInt(AnoN);
		

		DCheg = new Data(Dian,Mesn,Anon);
		VoossCheg = CompAerea.getVoosGlobais();
		VoossPart = CompAerea.getVoosGlobais();
		
		for( i = 0;i<VoossCheg.size();i++) {
			if(VoossCheg.get(i).getDestino().getCidade().getCid() != CidadeC.getCid()) {
				VoossCheg.remove(i);
				i--;
			}
		}
		for( i = 0;i<VoossPart.size();i++) {
			if(VoossPart.get(i).getOrigem().getCidade().getCid() != CidadeC.getCid()) {
				VoossPart.remove(i);
				i--;
			}
		}
		
		
 		for( i = 0;i<VoossCheg.size();i++) {
 			
 			Apeiroc.add(new JMenuItem(VoossCheg.get(i).getOrigem().getNome()+" -> "+CidadeC.getCid()));
 			JmSeleção.add(Apeiroc.get(i));
 			Apeiroc.get(i).addActionListener(new ActionListener() {
 				public void actionPerformed(ActionEvent e) {
 					
 					retorno = VoossCheg.get(i);
 					JmSeleção.setText(VoossCheg.get(i).getOrigem().getNome()+" -> "+CidadeC.getCid());
 					
 				}
 			});
 			}
		for( i = 0;i<VoossPart.size();i++) {
		 			
		 			Apeirop.add(new JMenuItem(CidadeC.getCid()+" -> "+VoossPart.get(i).getDestino().getNome()));
		 			JmSeleção_1.add(Apeirop.get(i));
		 			Apeirop.get(i).addActionListener(new ActionListener() {
		 				public void actionPerformed(ActionEvent e) {		
		 					retorno = VoossPart.get(i);
		 					JmSeleção_1.setText(CidadeC.getCid()+" -> "+VoossPart.get(i).getDestino().getNome());
		 					
		 				}
		 			});
		 			}
 			
 		}
	}

