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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Resistor_3GUI extends JFrame {

	private JPanel w_pane;
	private JTextField lbl_sonuc;
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
		setTitle("3 Bantlı Direnc");
		setResizable(false);
		setType(Type.POPUP);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		w_pane = new JPanel();
		w_pane.setBackground(new Color(219, 219, 219));
		w_pane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(w_pane);
		w_pane.setLayout(null);

		JComboBox jc_bas1 = new JComboBox(bant_3.getBas1());
		jc_bas1.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		jc_bas1.setSelectedIndex(1);
		jc_bas1.setToolTipText("1.Basamagi sec");
		jc_bas1.setMaximumRowCount(9);
		jc_bas1.setBackground(new Color(255, 255, 255));
		jc_bas1.setBounds(21, 146, 122, 21);
		w_pane.add(jc_bas1);

		JComboBox jc_bas2 = new JComboBox(bant_3.getBas2());
		jc_bas2.setBackground(new Color(255, 255, 255));
		jc_bas2.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		jc_bas2.setSelectedIndex(4);
		jc_bas2.setToolTipText("2.Basamagi sec");
		jc_bas2.setMaximumRowCount(10);
		jc_bas2.setBounds(153, 146, 133, 21);
		w_pane.add(jc_bas2);

		JComboBox jc_carpan = new JComboBox(bant_3.getCarpan());
		jc_carpan.setBackground(new Color(255, 255, 255));
		jc_carpan.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		jc_carpan.setToolTipText("Carpan Rengini Sec");
		jc_carpan.setMaximumRowCount(12);
		jc_carpan.setBounds(296, 146, 130, 21);
		w_pane.add(jc_carpan);

		JLabel lbl_bas1 = new JLabel("1.BASAMAK");
		lbl_bas1.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		lbl_bas1.setBounds(60, 123, 97, 13);
		w_pane.add(lbl_bas1);

		JLabel lbl_bas2 = new JLabel("2. BASAMAK");
		lbl_bas2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 11));
		lbl_bas2.setBounds(187, 123, 97, 13);
		w_pane.add(lbl_bas2);

		JLabel lbl_carpan = new JLabel("CARPAN");
		lbl_carpan.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 11));
		lbl_carpan.setBounds(318, 123, 97, 13);
		w_pane.add(lbl_carpan);

		JButton btn_hesapla = new JButton("Hesapla");
		btn_hesapla.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 12));
		btn_hesapla.setBackground(new Color(255, 255, 255));

		btn_hesapla.setBounds(165, 193, 97, 30);
		w_pane.add(btn_hesapla);

		lbl_sonuc = new JTextField();
		lbl_sonuc.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lbl_sonuc.setText("Sonuc : 24.0 Ω");
		lbl_sonuc.setEditable(false);
		lbl_sonuc.setBounds(21, 250, 394, 30);

		w_pane.add(lbl_sonuc);
		lbl_sonuc.setColumns(10);

		JButton lbl_boya_2 = new JButton();
		lbl_boya_2.setBackground(Color.YELLOW);
		lbl_boya_2.setEnabled(false);
		lbl_boya_2.setBounds(195, 27, 13, 68);
		w_pane.add(lbl_boya_2);

		JButton lbl_boya_3 = new JButton();
		lbl_boya_3.setBackground(Color.BLACK);
		lbl_boya_3.setEnabled(false);
		lbl_boya_3.setBounds(249, 27, 13, 68);
		w_pane.add(lbl_boya_3);

		JButton lbl_boya_1 = new JButton();
		lbl_boya_1.setBackground(Color.RED);
		lbl_boya_1.setEnabled(false);
		lbl_boya_1.setBounds(144, 27, 13, 68);
		w_pane.add(lbl_boya_1);

		JLabel lbl_direnc = new JLabel();
		lbl_direnc.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\eclipse-workspace\\ZDirencKodlari\\resistor.jpg"));
		lbl_direnc.setBounds(46, 10, 329, 103);
		w_pane.add(lbl_direnc);

		btn_hesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bant_3.hesapla(jc_bas1, jc_bas2, jc_carpan, lbl_sonuc);
			}
		});
		jc_bas1.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				bant_3.boya(jc_bas1.getSelectedIndex() + 1, lbl_boya_1);

			}
		});
		jc_bas2.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				bant_3.boya(jc_bas2.getSelectedIndex(), lbl_boya_2);

			}
		});
		jc_carpan.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				bant_3.boya(jc_carpan.getSelectedIndex(), lbl_boya_3);

			}
		});
	}
}
