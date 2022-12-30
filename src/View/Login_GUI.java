package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Login_GUI extends JFrame {

	private JPanel w_pane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_GUI frame = new Login_GUI();
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
	public Login_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 507, 240);
		w_pane = new JPanel();
		w_pane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(w_pane);
		w_pane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Renk İle Direnc Hesaplama Uygulamasına Hosgeldiniz");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 26, 443, 54);
		w_pane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("3 Bantlı Direnc");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Resistor_3GUI r3GUI = new Resistor_3GUI();
				r3GUI.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		btnNewButton_1.setBounds(10, 101, 197, 63);
		w_pane.add(btnNewButton_1);
		
		JButton btnBantlDirenc = new JButton("4 Bantlı Direnc");
		btnBantlDirenc.setBackground(Color.WHITE);
		btnBantlDirenc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Resistor_4GUI r4GUI = new Resistor_4GUI();
				r4GUI.setVisible(true);
				dispose();
			}
		});
		btnBantlDirenc.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		btnBantlDirenc.setBounds(271, 101, 182, 63);
		w_pane.add(btnBantlDirenc);
	}
}
