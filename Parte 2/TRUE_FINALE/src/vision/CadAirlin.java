package vision;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadAirlin extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField_CNPJ;
	private JTextField textField_NomeOf;
	private JTextField textField_NomeDiv;
	private JTextField textField_Dia;
	private JTextField textField_Mes;
	private JTextField textField_Ano;


	/**
	 * Create the frame.
	 */
	public CadAirlin() {
		setTitle("Cadastro Airline");
		setBounds(100, 100, 495, 226);
		
		JPanel contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPane, BorderLayout.CENTER);
		
		JLabel lblCNPJ = new JLabel("CNPJ");
		lblCNPJ.setBounds(24, 24, 46, 14);
		contentPane.add(lblCNPJ);
		
		JLabel lblNomeOf = new JLabel("Nome Oficial");
		lblNomeOf.setBounds(24, 52, 86, 14);
		contentPane.add(lblNomeOf);
		
		JLabel lblNomeDeDivulga = new JLabel("Nome de Divulgação");
		lblNomeDeDivulga.setBounds(24, 78, 124, 14);
		contentPane.add(lblNomeDeDivulga);
		
		textField_CNPJ = new JTextField();
		textField_CNPJ.setColumns(10);
		textField_CNPJ.setBounds(159, 21, 133, 20);
		contentPane.add(textField_CNPJ);
		
		textField_NomeOf = new JTextField();
		textField_NomeOf.setColumns(10);
		textField_NomeOf.setBounds(159, 49, 133, 20);
		contentPane.add(textField_NomeOf);
		
		textField_NomeDiv = new JTextField();
		textField_NomeDiv.setColumns(10);
		textField_NomeDiv.setBounds(159, 75, 133, 20);
		contentPane.add(textField_NomeDiv);
		
		JButton JbVoltar = new JButton("Voltar");
		JbVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		JbVoltar.setBounds(24, 146, 89, 23);
		contentPane.add(JbVoltar);
		
		JButton JbCadastrar = new JButton("Cadastrar");
		JbCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Diar;
				int Mesr;
				int Anor;
				String Dia;
				String DiaT = "";
				String Mes;
				String MesT = "";
				String Ano;
				String AnoT = "";
				
				Dia = textField_Dia.getText();
				Mes = textField_Mes.getText();
				Ano = textField_Ano.getText();
				
				for (int i = 0; i < Mes.length();i++) {
					if(Character.isLetter(Mes.charAt(i))) {
						MesT = "";
						break;
					}
					else {
						MesT += Mes.charAt(i);
					}
				}
				for (int i = 0; i < Dia.length();i++) {
					if(Character.isLetter(Dia.charAt(i))) {
						DiaT = "";
						break;
					}
					else {
						DiaT += Dia.charAt(i);
					}
				}
				
				for (int i = 0; i < Ano.length();i++) {
					if(Character.isLetter(Ano.charAt(i))) {
						AnoT = "";
						break;
					}
					else {
						AnoT += Ano.charAt(i);
					}
				}
				if(DiaT == "") {
					JOptionPane.showMessageDialog(null,"Dia invalido!!","Data Incorreta",JOptionPane.ERROR_MESSAGE);
				}
				else {
					if(MesT == "") {
						JOptionPane.showMessageDialog(null,"Mês invalido!!","Data Incorreta",JOptionPane.ERROR_MESSAGE);
					}
					else {
						if(AnoT == "") {
							JOptionPane.showMessageDialog(null,"Ano invalido!!","Data Incorreta",JOptionPane.ERROR_MESSAGE);
						}
						else {
							Diar = Integer.parseInt(Dia);
							Mesr = Integer.parseInt(Mes);
							Anor = Integer.parseInt(Ano);
							
							if(Diar > 31 || Diar < 1) {
								JOptionPane.showMessageDialog(null,"Dia invalido!!","Data Incorreta",JOptionPane.ERROR_MESSAGE);
							}
							else {
								if(Mesr > 12 || Mesr < 1) {
									JOptionPane.showMessageDialog(null,"Mês invalido!!","Data Incorreta",JOptionPane.ERROR_MESSAGE);
								}
								else {
									if(Anor < 1) {
										JOptionPane.showMessageDialog(null,"Ano invalido!!","Data Incorreta",JOptionPane.ERROR_MESSAGE);
									}
									else {
										Data Set = new Data(Diar,Mesr,Anor);
										
										String CNPJin = textField_CNPJ.getText();
										String NomeOFin = textField_NomeOf.getText();
										String NomeDivin = textField_NomeDiv.getText();
										CompAerea t = new CompAerea(CNPJin,NomeOFin,NomeDivin,Set);
										limparCont();
									}
								}
							}
						}
					}
				}

				
			}
		});
		JbCadastrar.setBounds(285, 146, 104, 23);
		contentPane.add(JbCadastrar);
		
		textField_Dia = new JTextField();
		textField_Dia.setColumns(10);
		textField_Dia.setBounds(409, 49, 28, 20);
		contentPane.add(textField_Dia);
		
		textField_Mes = new JTextField();
		textField_Mes.setColumns(10);
		textField_Mes.setBounds(409, 75, 27, 20);
		contentPane.add(textField_Mes);
		
		textField_Ano = new JTextField();
		textField_Ano.setColumns(10);
		textField_Ano.setBounds(409, 106, 27, 20);
		contentPane.add(textField_Ano);
		
		JLabel lblDia = new JLabel("Dia");
		lblDia.setBounds(331, 52, 46, 14);
		contentPane.add(lblDia);
		
		JLabel lblMes = new JLabel("Mes");
		lblMes.setBounds(331, 78, 46, 14);
		contentPane.add(lblMes);
		
		JLabel lblAno = new JLabel("Ano");
		lblAno.setBounds(331, 109, 46, 14);
		contentPane.add(lblAno);
		
		JLabel lblDatadeFundação = new JLabel("Data de Fundação");
		lblDatadeFundação.setBounds(331, 24, 152, 14);
		contentPane.add(lblDatadeFundação);

	}
	//Metodo para Limpar os conteudos apos o cadastro
	private void limparCont(){
		textField_CNPJ.setText("");
		textField_NomeOf.setText("");
		textField_NomeDiv.setText("");
		textField_Dia.setText("");
		textField_Mes.setText("");
		textField_Ano.setText("");
	}

}
