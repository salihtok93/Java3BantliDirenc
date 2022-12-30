package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Resistor_N.Resistor_3_B;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Resistor_3GUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField sonucc;
	Resistor_3_B bant_3 = new Resistor_3_B();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resistor_3GUI frame = new Resistor_3GUI();
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

	public Resistor_3GUI() {
		setResizable(false);
		setType(Type.POPUP);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(219, 219, 219));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JComboBox<String> grup = new JComboBox<String>(bant_3.getBas1());
		grup.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		grup.setSelectedIndex(1);
		grup.setToolTipText("1.Basamagi sec");
		grup.setMaximumRowCount(9);
		grup.setBackground(new Color(255, 255, 255));
		grup.setBounds(21, 146, 122, 21);
		contentPane.add(grup);

		JComboBox<String> grup_1 = new JComboBox<String>(bant_3.getBas2());
		grup_1.setBackground(new Color(255, 255, 255));
		grup_1.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		grup_1.setSelectedIndex(4);
		grup_1.setToolTipText("2.Basamagi sec");
		grup_1.setMaximumRowCount(10);
		grup_1.setBounds(153, 146, 133, 21);
		contentPane.add(grup_1);

		JComboBox<String> grup_2 = new JComboBox<String>(bant_3.getCarpan());
		grup_2.setBackground(new Color(255, 255, 255));
		grup_2.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		grup_2.setToolTipText("Carpan Rengini Sec");
		grup_2.setMaximumRowCount(12);
		grup_2.setBounds(296, 146, 130, 21);
		contentPane.add(grup_2);

		JLabel lblNewLabel = new JLabel("1.BASAMAK");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		lblNewLabel.setBounds(60, 123, 97, 13);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("2. BASAMAK");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_1.setBounds(187, 123, 97, 13);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("CARPAN");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_2.setBounds(318, 123, 97, 13);
		contentPane.add(lblNewLabel_2);

		JButton btn = new JButton("Hesapla");
		btn.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 12));
		btn.setBackground(new Color(255, 255, 255));

		btn.setBounds(165, 193, 97, 30);
		contentPane.add(btn);

		sonucc = new JTextField();
		sonucc.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		sonucc.setText("Sonuc : 24.0 Ω");
		sonucc.setEditable(false);
		sonucc.setBounds(21, 250, 394, 30);

		contentPane.add(sonucc);
		sonucc.setColumns(10);

		JButton renk2 = new JButton();
		renk2.setBackground(Color.YELLOW);
		renk2.setEnabled(false);
		renk2.setBounds(195, 27, 13, 68);
		contentPane.add(renk2);

		JButton renk3 = new JButton();
		renk3.setBackground(Color.BLACK);
		renk3.setEnabled(false);
		renk3.setBounds(249, 27, 13, 68);
		contentPane.add(renk3);

		JButton renk1 = new JButton();
		renk1.setBackground(Color.RED);
		renk1.setEnabled(false);
		renk1.setBounds(144, 27, 13, 68);
		contentPane.add(renk1);

		JLabel lblNewLabel_3 = new JLabel();
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\eclipse-workspace\\ZDirencKodlari\\resistor.jpg"));
		lblNewLabel_3.setBounds(46, 10, 329, 103);
		contentPane.add(lblNewLabel_3);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bant_3.boya(grup, grup_1, grup_2, renk1, renk2, renk3);
				bant_3.hesapla(grup, grup_1, grup_2, sonucc);
			}
		});
	}

}
