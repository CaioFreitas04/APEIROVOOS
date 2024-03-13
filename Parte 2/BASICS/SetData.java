import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JSlider;
import javax.swing.JScrollBar;
import javax.swing.JTree;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import com.toedter.calendar.JCalendar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SetData {

	private JFrame frmSetdat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SetData window = new SetData();
					window.frmSetdat.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SetData() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSetdat = new JFrame();
		frmSetdat.setTitle("SETDat");
		frmSetdat.setBounds(100, 100, 450, 300);
		frmSetdat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSetdat.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.setBounds(335, 184, 89, 23);
		frmSetdat.getContentPane().add(btnNewButton);
		
		JButton btnMarcar = new JButton("Marcar");
		btnMarcar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMarcar.setBounds(335, 135, 89, 23);
		frmSetdat.getContentPane().add(btnMarcar);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(10, 11, 297, 239);
		frmSetdat.getContentPane().add(calendar);
	}
}
