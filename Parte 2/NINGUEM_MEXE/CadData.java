package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadData extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_Dia;
	private JTextField textField_Mês;
	private JTextField textField_Ano;
	private Data X;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadData frame = new CadData();
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
	public CadData() {
		setTitle("Cadastrar Data");
		setBounds(100, 100, 333, 194);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_Dia = new JTextField();
		textField_Dia.setBounds(93, 55, 77, 20);
		contentPane.add(textField_Dia);
		textField_Dia.setColumns(10);
		
		JButton JbMarcar = new JButton("Marcar");
		JbMarcar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Mes;
				String Dia;
				String Ano;
				int Mesr;
				int Diar;
				int Anor;
				Mes = textField_Mês.getText();
				Dia = textField_Dia.getText();
				Ano = textField_Ano.getText();
				Mesr = Integer.parseInt(Mes);
				Diar = Integer.parseInt(Dia);
				Anor = Integer.parseInt(Ano);
				Data Set = new Data(Diar,Mesr,Anor);
				X = Set;
			}
			
		});
		JbMarcar.setBounds(204, 62, 89, 23);
		contentPane.add(JbMarcar);
		
		JButton JbVoltar = new JButton("Voltar");
		JbVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		JbVoltar.setBounds(203, 106, 89, 23);
		contentPane.add(JbVoltar);
		
		JLabel lblDia = new JLabel("Dia");
		lblDia.setBounds(24, 58, 46, 14);
		contentPane.add(lblDia);
		
		textField_Mês = new JTextField();
		textField_Mês.setColumns(10);
		textField_Mês.setBounds(93, 86, 77, 20);
		contentPane.add(textField_Mês);
		
		textField_Ano = new JTextField();
		textField_Ano.setColumns(10);
		textField_Ano.setBounds(93, 117, 77, 20);
		contentPane.add(textField_Ano);
		
		JLabel lblMês = new JLabel("Mês");
		lblMês.setBounds(24, 85, 46, 14);
		contentPane.add(lblMês);
		
		JLabel lblAno = new JLabel("Ano");
		lblAno.setBounds(23, 120, 46, 14);
		contentPane.add(lblAno);
	}
	

}
