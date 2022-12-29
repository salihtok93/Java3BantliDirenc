package Deneme1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Window.Type;

public class Renkkodmain extends JFrame {

	private JPanel contentPane;
	private JTextField sonucc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Renkkodmain frame = new Renkkodmain();
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

	public Renkkodmain() {
		setResizable(false);
		setType(Type.POPUP);
		String[] bas1 = { "1 Kahverengi", "2 Kırmızı", "3 Turuncu", "4 Sarı", "5 Yesil", "6 Mavi", "7 Mor", "8 Gri",
				"9 Beyaz" };
		String[] bas2 = { "0 Siyah", "1 Kahverengi", "2 Kırmızı", "3 Turuncu", "4 Sarı", "5 Yesil", "6 Mavi", "7 Mor",
				"8 Gri", "9 Beyaz" };
		String[] carpan = { "x1 Siyah", "x10 Kahverengi", "x100 Kırmızı", "x1k Turuncu", "x10k Sarı", "x100k Yesil",
				"x1M Mavi", "x10M Mor", "X100M Gri", "X1G Beyaz", "%10 Altın", "%100 Gumus" };
		setTitle("3 Bantli Direnc");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(219, 219, 219));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JComboBox grup = new JComboBox(bas1);
		grup.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		grup.setSelectedIndex(1);
		grup.setToolTipText("1.Basamagi sec");
		grup.setMaximumRowCount(9);
		grup.setBackground(new Color(255, 255, 255));
		grup.setBounds(21, 146, 122, 21);
		contentPane.add(grup);

		JComboBox grup_1 = new JComboBox(bas2);
		grup_1.setBackground(new Color(255, 255, 255));
		grup_1.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		grup_1.setSelectedIndex(4);
		grup_1.setToolTipText("2.Basamagi sec");
		grup_1.setMaximumRowCount(10);
		grup_1.setBounds(153, 146, 133, 21);
		contentPane.add(grup_1);

		JComboBox grup_2 = new JComboBox(carpan);
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

		JButton renk2 = new JButton("");
		renk2.setBackground(Color.YELLOW);
		renk2.setEnabled(false);
		renk2.setBounds(195, 27, 13, 68);
		contentPane.add(renk2);

		JButton renk3 = new JButton("");
		renk3.setBackground(Color.BLACK);
		renk3.setEnabled(false);
		renk3.setBounds(249, 27, 13, 68);
		contentPane.add(renk3);

		JButton renk1 = new JButton("");
		renk1.setBackground(Color.RED);
		renk1.setEnabled(false);
		renk1.setBounds(144, 27, 13, 68);
		contentPane.add(renk1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\HUAWEI\\eclipse-workspace\\ZDirencKodlari\\resistor.jpg"));
		lblNewLabel_3.setBounds(46, 10, 329, 103);
		contentPane.add(lblNewLabel_3);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boya(grup, grup_1, grup_2, renk1, renk2, renk3);
				hesapla(grup, grup_1, grup_2, sonucc);
			}
		});
	}

	public static void hesapla(JComboBox<String> a, JComboBox<String> b, JComboBox<String> c, JTextField d) {
		int k1 = a.getSelectedIndex() + 1;
		int k2 = b.getSelectedIndex();
		int k3 = c.getSelectedIndex();
		double crp;
		String snc = "";
		snc += k1;
		snc += k2;

		if (k3 == 10) {
			crp = 0.1;
		} else if (k3 == 11) {
			crp = 0.01;
		} else {
			crp = Math.pow(10, k3);
		}

		Double sonuc = Integer.parseInt(snc) * crp;

		if (sonuc.toString().length() >= 6 && sonuc.toString().length() < 9) {
			sonuc = Integer.parseInt(snc) * crp / (Math.pow(10, 3));
			d.setText("Sonuc : " + sonuc + "kΩ");
		} else if (sonuc.toString().length() >= 9 && sonuc.toString().length() <= 11) {
			sonuc = Integer.parseInt(snc) * crp / (Math.pow(10, 6));
			d.setText("Sonuc : " + sonuc + "MΩ");
		} else if (sonuc.toString().length() > 11) {
			sonuc = Integer.parseInt(snc) * crp / (Math.pow(10, 9));
			d.setText("Sonuc : " + sonuc + "GΩ");
		} else {
			d.setText("Sonuc : " + sonuc + " Ω");
		}

	}

	public static void boya(JComboBox<String> a, JComboBox<String> b, JComboBox<String> c, JButton d, JButton e,
			JButton f) {
		int k1 = a.getSelectedIndex() + 1;
		int k2 = b.getSelectedIndex();
		int k3 = c.getSelectedIndex();
		boya_yard(k1, d);
		boya_yard(k2, e);
		boya_yard(k3, f);

	}
	public static void boya_yard(int a,JButton x) {
		switch (a) {
		case 0:
			x.setBackground(Color.BLACK);
			break;
		case 1:
			x.setBackground(Color.decode("#964b00"));
			break;
		case 2:
			x.setBackground(Color.RED);
			break;
		case 3:
			x.setBackground(Color.ORANGE);
			break;
		case 4:
			x.setBackground(Color.YELLOW);
			break;
		case 5:
			x.setBackground(Color.GREEN);
			break;
		case 6:
			x.setBackground(Color.blue);
			break;
		case 7:
			x.setBackground(Color.decode("#660099"));
			break;
		case 8:
			x.setBackground(Color.GRAY);
			break;
		case 9:
			x.setBackground(Color.WHITE);
			break;
		case 10:
			x.setBackground(Color.decode("#CFB53B"));
			break;
		case 11:
			x.setBackground(Color.decode("#C0C0C0"));
			break;
		}
	}
}
