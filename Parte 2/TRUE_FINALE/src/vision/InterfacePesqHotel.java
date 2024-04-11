package vision;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;

public class InterfacePesqHotel extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField_NomeHotel,textField_DiaCheG,textField_MesCheG,textField_DiaPar,textField_AnoPar,textField_AnoCheG,textField_MesPar;
	private Button JbVoltar,JbPesq;
	private Cliente ClienteX;


	/**
	 * Create the frame.
	 */
	public InterfacePesqHotel(Cliente X) {
		ClienteX = X;
		setTitle("Pesquisa de Hotel");
		setBounds(100, 100, 571, 300);
		getContentPane().setLayout(null);
		TrataMenusitens tratar = new TrataMenusitens();
		
		textField_NomeHotel = new JTextField();
		textField_NomeHotel.setBounds(223, 23, 180, 28);
		getContentPane().add(textField_NomeHotel);
		textField_NomeHotel.setColumns(10);
		
		JLabel lblPesqHot = new JLabel("Pesquise o Hotel que Gostaria de ir");
		lblPesqHot.setBounds(6, 29, 222, 16);
		getContentPane().add(lblPesqHot);
		
		JLabel lblDataCheg = new JLabel("Quando Gostaria de Chegar ao seu destino");
		lblDataCheg.setBounds(6, 127, 255, 16);
		getContentPane().add(lblDataCheg);
		
		JLabel lblData = new JLabel("Marcar Datas Formatação(Dia/Mes/Ano)");
		lblData.setBounds(202, 63, 238, 16);
		getContentPane().add(lblData);
		
		JLabel lblQuandoGostariaDe = new JLabel("Quando Gostaria de Partir");
		lblQuandoGostariaDe.setBounds(6, 170, 153, 16);
		getContentPane().add(lblQuandoGostariaDe);
		
		textField_DiaCheG = new JTextField();
		textField_DiaCheG.setBounds(260, 127, 24, 23);
		getContentPane().add(textField_DiaCheG);
		
		textField_MesCheG = new JTextField();
		textField_MesCheG.setBounds(290, 127, 24, 23);
		getContentPane().add(textField_MesCheG);
		
		textField_DiaPar = new JTextField();
		textField_DiaPar.setBounds(169, 170, 24, 23);
		getContentPane().add(textField_DiaPar);
		
		textField_MesPar = new JTextField();
		textField_MesPar.setBounds(199, 170, 24, 23);
		getContentPane().add(textField_MesPar);
		
		textField_AnoPar = new JTextField();
		textField_AnoPar.setBounds(229, 170, 41, 23);
		getContentPane().add(textField_AnoPar);
		
		textField_AnoCheG = new JTextField();
		textField_AnoCheG.setBounds(320, 127, 41, 23);
		getContentPane().add(textField_AnoCheG);
		
		JbPesq = new Button("Pesquisar");
		JbPesq.setBounds(424, 208, 76, 23);
		getContentPane().add(JbPesq);
		JbPesq.addActionListener(tratar);
		
		JbVoltar = new Button("Voltar");
		JbVoltar.setBounds(57, 208, 76, 23);
		getContentPane().add(JbVoltar);
		JbVoltar.addActionListener(tratar);

	}
	
	private class TrataMenusitens implements ActionListener{
		

		public void actionPerformed(ActionEvent e) {
		
			if(e.getSource()==JbVoltar) {
				dispose();
			}
			if(e.getSource()==JbPesq) {
				String Hotel = textField_NomeHotel.getText();
				
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
				Hotel X =  DadosCidades.buscarHotel(Hotel, null, null);
				Pesquisa D; 
				if(X!=null) {
					D = new Pesquisa(X,new Data(Dian,Mesn,Anon),new Data(Diah,Mesh,Anoh));
					Reserva R = new Reserva(new Data(Dian,Mesn,Anon),new Data(Diah,Mesh,Anoh));
					SeleçãoQuartos tela = new SeleçãoQuartos(R,X,ClienteX);
					tela.setVisible(true);
					
				}
				else {
					JOptionPane.showMessageDialog(null,"Hotel não cadastrado!!","ERRO 72",JOptionPane.ERROR_MESSAGE);
				}
				
			}
		}
		
	}
}
