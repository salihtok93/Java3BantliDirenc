package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Resistor_N.Resistor_4_B;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Resistor_4GUI extends JFrame {
	
	Resistor_4_B bant_4 = new Resistor_4_B();

	private JPanel contentPane;
	private JTextField lbl_sonuc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resistor_4GUI frame = new Resistor_4GUI();
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
	public Resistor_4GUI() {
		setTitle("4 Bantlı Direnc");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 554, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel lbl_bas1 = new JLabel("1.BASAMAK");
		lbl_bas1.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		lbl_bas1.setBounds(51, 137, 97, 13);
		contentPane.add(lbl_bas1);
		
		JLabel lbl_bas2 = new JLabel("2. BASAMAK");
		lbl_bas2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 11));
		lbl_bas2.setBounds(175, 137, 97, 13);
		contentPane.add(lbl_bas2);
		
		JLabel lbl_carpan = new JLabel("CARPAN");
		lbl_carpan.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 11));
		lbl_carpan.setBounds(442, 137, 97, 13);
		contentPane.add(lbl_carpan);
		
		JComboBox jc_bas1 = new JComboBox(bant_4.getBas1());
		jc_bas1.setToolTipText("1.Basamagi sec");
		jc_bas1.setSelectedIndex(1);
		jc_bas1.setMaximumRowCount(9);
		jc_bas1.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		jc_bas1.setBackground(Color.WHITE);
		jc_bas1.setBounds(28, 160, 106, 21);
		contentPane.add(jc_bas1);
		
		JComboBox jc_bas2 = new JComboBox(bant_4.getBas2());
		jc_bas2.setToolTipText("2.Basamagi sec");
		jc_bas2.setSelectedIndex(4);
		jc_bas2.setMaximumRowCount(10);
		jc_bas2.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		jc_bas2.setBackground(Color.WHITE);
		jc_bas2.setBounds(163, 160, 110, 21);
		contentPane.add(jc_bas2);
		
		JComboBox jc_carpan = new JComboBox(bant_4.getCarpan());
		jc_carpan.setToolTipText("Carpan Rengini Sec");
		jc_carpan.setMaximumRowCount(12);
		jc_carpan.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		jc_carpan.setBackground(Color.WHITE);
		jc_carpan.setBounds(420, 160, 106, 21);
		contentPane.add(jc_carpan);
		
		JButton btn_hesapla = new JButton("Hesapla");
		btn_hesapla.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 12));
		btn_hesapla.setBackground(Color.WHITE);
		btn_hesapla.setBounds(227, 226, 97, 30);
		contentPane.add(btn_hesapla);
		
		lbl_sonuc = new JTextField();
		lbl_sonuc.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_sonuc.setText("Sonuc : 244.0 Ω");
		lbl_sonuc.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lbl_sonuc.setEditable(false);
		lbl_sonuc.setColumns(10);
		lbl_sonuc.setBounds(74, 296, 394, 30);
		contentPane.add(lbl_sonuc);
		
		JButton lbl_boya_3 = new JButton();
		lbl_boya_3.setEnabled(false);
		lbl_boya_3.setBackground(Color.YELLOW);
		lbl_boya_3.setBounds(287, 41, 13, 68);
		contentPane.add(lbl_boya_3);
		
		JButton lbl_boya_1 = new JButton();
		lbl_boya_1.setEnabled(false);
		lbl_boya_1.setBackground(Color.RED);
		lbl_boya_1.setBounds(210, 41, 13, 68);
		contentPane.add(lbl_boya_1);
		
		JButton lbl_boya_2 = new JButton();
		lbl_boya_2.setEnabled(false);
		lbl_boya_2.setBackground(Color.YELLOW);
		lbl_boya_2.setBounds(252, 41, 13, 68);
		contentPane.add(lbl_boya_2);
		
		JButton lbl_boya_4 = new JButton();
		lbl_boya_4.setEnabled(false);
		lbl_boya_4.setBackground(Color.BLACK);
		lbl_boya_4.setBounds(326, 41, 13, 68);
		contentPane.add(lbl_boya_4);
		
		JLabel lbl_direnc = new JLabel();
		lbl_direnc.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\eclipse-workspace\\ZDirencKodlari\\resistor.jpg"));
		lbl_direnc.setBounds(112, 24, 329, 103);
		contentPane.add(lbl_direnc);
		
		JLabel lbl_bas3 = new JLabel("3. BASAMAK");
		lbl_bas3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 11));
		lbl_bas3.setBounds(304, 137, 97, 13);
		contentPane.add(lbl_bas3);
		
		JComboBox jc_bas3 = new JComboBox(bant_4.getBas3());
		jc_bas3.setToolTipText("2.Basamagi sec");
		jc_bas3.setSelectedIndex(4);
		jc_bas3.setMaximumRowCount(10);
		jc_bas3.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		jc_bas3.setBackground(Color.WHITE);
		jc_bas3.setBounds(283, 160, 110, 21);
		contentPane.add(jc_bas3);
		
		JButton btn_geri = new JButton("GERİ");
		btn_geri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_GUI lGUI = new Login_GUI();
				lGUI.setVisible(true);
				dispose();
			}
		});
		btn_geri.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		btn_geri.setBounds(441, 368, 85, 21);
		contentPane.add(btn_geri);
		
		
		btn_hesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bant_4.hesapla(jc_bas1, jc_bas2, jc_carpan,jc_bas3, lbl_sonuc);
			}
		});
		jc_bas1.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				bant_4.boya(jc_bas1.getSelectedIndex() + 1, lbl_boya_1);

			}
		});
		jc_bas2.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				bant_4.boya(jc_bas2.getSelectedIndex(), lbl_boya_2);

			}
		});
		jc_bas3.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				bant_4.boya(jc_bas3.getSelectedIndex(), lbl_boya_3);

			}
		});
		jc_carpan.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				bant_4.boya(jc_carpan.getSelectedIndex(), lbl_boya_4);

			}
		});
		
		
	}
}
