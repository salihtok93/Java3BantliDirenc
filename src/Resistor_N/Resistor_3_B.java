package Resistor_N;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class Resistor_3_B extends Base_Resistor {

	public void hesapla(JComboBox<String> a, JComboBox<String> b, JComboBox<String> c, JTextField d) {
		int k1 = a.getSelectedIndex() + 1;
		int k2 = b.getSelectedIndex();
		int k3 = c.getSelectedIndex();
		double crp;
		String birim;
		int snc = 10 * k1 + k2;

		if (k3 == 10) {
			crp = 0.1;
		} else if (k3 == 11) {
			crp = 0.01;
		} else {
			crp = Math.pow(10, k3);
		}

		Double sonuc = snc * crp;

		if (sonuc >= 1000000000) {
			sonuc = sonuc / 1000000000;
			birim = " GΩ";
		} else if (sonuc >= 1000000 && sonuc < 1000000000) {
			sonuc = sonuc / 1000000;
			birim = " MΩ";
		} else if (sonuc >= 1000 && sonuc < 1000000) {
			sonuc = sonuc / 1000;
			birim = " kΩ";
		} else {
			birim = " Ω";
		}
		d.setText("Sonuc : " + sonuc + birim);

	}

	public void boya(int a, JButton x) {
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
