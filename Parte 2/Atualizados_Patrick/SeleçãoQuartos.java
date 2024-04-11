package vision;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenuBar;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class SeleçãoQuartos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuItem JmiStandart3,JmiStandart2,JmiStandart1,JmiPremium1,JmiPremium2,JmiPremium3;
	private int std1,std2,std3,Premium1,Premium2,Premium3;
	private Hotel HotelY;
	private Cliente ClienteZ;
	private Reserva ReservaX;
	private JLabel lblValorDiaria;
	private JLabel lblValorTotal;
	private JButton JbComprar;


	/**
	 * Create the frame.
	 */
	public SeleçãoQuartos(Reserva X, Hotel Y,Cliente Z) {
		setTitle("Seleção de Quarto");
		HotelY = Y;
		ReservaX = X;
		ClienteZ = Z;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 615, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		TrataMenusitens tratar = new TrataMenusitens();
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenu JmQuartos = new JMenu("Quartos");
		JmQuartos.setForeground(Color.BLACK);
		JmQuartos.setFont(new Font("Arial", Font.BOLD, 15));
		JmQuartos.setBounds(6, 6, 111, 19);
		contentPane.add(JmQuartos);
		
		JMenu JmVips = new JMenu("Vips");
		JmQuartos.add(JmVips);
		
		JmiPremium1 = new JMenuItem("Para uma Pessoa");
		JmVips.add(JmiPremium1);
		JmiPremium1.addActionListener(tratar);
		
		JmiPremium2 = new JMenuItem("Para duas Pessoas");
		JmVips.add(JmiPremium2);
		JmiPremium2.addActionListener(tratar);
		
		JmiPremium3 = new JMenuItem("Para três Pessoas");
		JmVips.add(JmiPremium3);
		JmiPremium3.addActionListener(tratar);
		
		JMenu JmStandart = new JMenu("Standart");
		JmQuartos.add(JmStandart);
		
		JmiStandart1 = new JMenuItem("Para uma Pessoa");
		JmStandart.add(JmiStandart1);
		JmiStandart1.addActionListener(tratar);
		
		JmiStandart2 = new JMenuItem("Para duas Pessoas");
		JmStandart.add(JmiStandart2);
		JmiStandart2.addActionListener(tratar);
		
		JmiStandart3 = new JMenuItem("Para três Pessoas");
		JmStandart.add(JmiStandart3);
		
		lblValorDiaria = new JLabel("");
		lblValorDiaria.setFont(new Font("Arial", Font.BOLD, 15));
		lblValorDiaria.setEnabled(false);
		lblValorDiaria.setBounds(90, 144, 253, 34);
		contentPane.add(lblValorDiaria);
		
		lblValorTotal = new JLabel("");
		lblValorTotal.setFont(new Font("Arial", Font.BOLD, 15));
		lblValorTotal.setEnabled(false);
		lblValorTotal.setBounds(90, 190, 253, 34);
		contentPane.add(lblValorTotal);
		
		JbComprar = new JButton("Adicionar ao Carrinho");
		JbComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClienteZ.adicionarAoCarrinho(ReservaX);
				dispose();
				JOptionPane.showMessageDialog(null,"Comprar realizada com sucesso","Item Adicionado ao Carrinho",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		JbComprar.setEnabled(false);
		JbComprar.setBounds(423, 190, 170, 28);
		contentPane.add(JbComprar);
		
		JmiStandart3.addActionListener(tratar);
		
		int qdtstd1 = Y.qtdQuartosDisponiveisParaReserva(X, "Std", 1 ) ;
		int qdtstd2 = Y.qtdQuartosDisponiveisParaReserva(X, "Std", 2 ) ;
		int qdtstd3 = Y.qtdQuartosDisponiveisParaReserva(X, "Std", 3 ) ;
		
		std1 = qdtstd1;
		std2 = qdtstd2;
		std3 = qdtstd3;
		
		int qdtPremium1 = Y.qtdQuartosDisponiveisParaReserva(X, "Premium", 1 ) ;
		int qdtPremium2 = Y.qtdQuartosDisponiveisParaReserva(X, "Premium", 2 ) ;
		int qdtPremium3 = Y.qtdQuartosDisponiveisParaReserva(X, "Premium", 3 ) ;
		
		Premium1 = qdtPremium1;
		Premium2 = qdtPremium2;
		Premium2 = qdtPremium3;
		
	}
	
	private class TrataMenusitens implements ActionListener{
		

			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == JmiPremium1) {
					if(Premium1 <= 0) {
						JOptionPane.showMessageDialog(null,"Alerta!!","Não Tem Quartos Disponiveis",JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						HotelY.addReserva(ReservaX, "Premium", 1);
						String Valor_Total = ("Valor Total:"+ReservaX.getPreco());
						String Diaria =("Valor da Diaria : R$"+ ReservaX.getQuarto().getValorDiaria());
						lblValorDiaria.setText(Diaria);
						lblValorDiaria.setEnabled(true);
						lblValorTotal.setText(Valor_Total);
						lblValorTotal.setEnabled(true);
						JbComprar.setEnabled(true);
					}
					
				}
				if(e.getSource() == JmiPremium2) {
					if(Premium2 <= 0) {
						JOptionPane.showMessageDialog(null,"Alerta!!","Não Tem Quartos Disponiveis",JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						HotelY.addReserva(ReservaX, "Premium", 2);
						String Valor_Total = ("Valor Total:"+ReservaX.getPreco());
						String Diaria =("Valor da Diaria : R$"+ ReservaX.getQuarto().getValorDiaria());
						lblValorDiaria.setText(Diaria);
						lblValorDiaria.setEnabled(true);
						lblValorTotal.setText(Valor_Total);
						lblValorTotal.setEnabled(true);
						JbComprar.setEnabled(true);
					}	
				}
				if(e.getSource() == JmiPremium3) {
					if(Premium3 <= 0) {
						JOptionPane.showMessageDialog(null,"Alerta!!","Não Tem Quartos Disponiveis",JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						HotelY.addReserva(ReservaX, "Premium", 3);
						String Valor_Total = ("Valor Total:"+ReservaX.getPreco());
						String Diaria =("Valor da Diaria : R$"+ ReservaX.getQuarto().getValorDiaria());
						lblValorDiaria.setText(Diaria);
						lblValorDiaria.setEnabled(true);
						lblValorTotal.setText(Valor_Total);
						lblValorTotal.setEnabled(true);
						JbComprar.setEnabled(true);
					}
				}
				if(e.getSource() == JmiStandart1) {
					if(std1 <= 0) {
						JOptionPane.showMessageDialog(null,"Alerta!!","Não Tem Quartos Disponiveis",JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						HotelY.addReserva(ReservaX, "Std", 1);
						String Valor_Total = ("Valor Total:"+ReservaX.getPreco());
						String Diaria =("Valor da Diaria : R$"+ ReservaX.getQuarto().getValorDiaria());
						lblValorDiaria.setText(Diaria);
						lblValorDiaria.setEnabled(true);
						lblValorTotal.setText(Valor_Total);
						lblValorTotal.setEnabled(true);
						JbComprar.setEnabled(true);
					}
				}
				if(e.getSource() == JmiStandart2) {
					if(std2 <= 0) {
						JOptionPane.showMessageDialog(null,"Alerta!!","Não Tem Quartos Disponiveis",JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						HotelY.addReserva(ReservaX, "Std", 2);
						String Valor_Total = ("Valor Total:"+ReservaX.getPreco());
						String Diaria =("Valor da Diaria : R$"+ ReservaX.getQuarto().getValorDiaria());
						lblValorDiaria.setText(Diaria);
						lblValorDiaria.setEnabled(true);
						lblValorTotal.setText(Valor_Total);
						lblValorTotal.setEnabled(true);
						JbComprar.setEnabled(true);
					}
				}
				if(e.getSource() == JmiStandart3) {
					if(std3 <= 0) {
						JOptionPane.showMessageDialog(null,"Alerta!!","Não Tem Quartos Disponiveis",JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						HotelY.addReserva(ReservaX, "Std", 3);
						String Valor_Total = ("Valor Total:"+ReservaX.getPreco());
						String Diaria =("Valor da Diaria : R$"+ ReservaX.getQuarto().getValorDiaria());
						lblValorDiaria.setText(Diaria);
						lblValorDiaria.setEnabled(true);
						lblValorTotal.setText(Valor_Total);
						lblValorTotal.setEnabled(true);
						JbComprar.setEnabled(true);
					}
				}
				
				
		}
	}
}
