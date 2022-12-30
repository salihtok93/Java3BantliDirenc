package Resistor_N;

import java.awt.Color;

import javax.swing.JButton;

public class Base_Resistor {
	String[] bas1 = { "1 Kahverengi", "2 Kırmızı", "3 Turuncu", "4 Sarı", "5 Yesil", "6 Mavi", "7 Mor", "8 Gri",
			"9 Beyaz" };
	String[] bas2 = { "0 Siyah", "1 Kahverengi", "2 Kırmızı", "3 Turuncu", "4 Sarı", "5 Yesil", "6 Mavi", "7 Mor",
			"8 Gri", "9 Beyaz" };
	String[] bas3 = { "0 Siyah", "1 Kahverengi", "2 Kırmızı", "3 Turuncu", "4 Sarı", "5 Yesil", "6 Mavi", "7 Mor",
			"8 Gri", "9 Beyaz" };
	String[] carpan = { "x1 Siyah", "x10 Kahverengi", "x100 Kırmızı", "x1k Turuncu", "x10k Sarı", "x100k Yesil",
			"x1M Mavi", "x10M Mor", "X100M Gri", "X1G Beyaz", "%10 Altın", "%100 Gumus" };

	String[] tolerans = { "Yok", "%1 Kahverengi", "%2 Kırmızı", "%3 Turuncu", "%4 Sarı", "%0.5 Yesil", "%0.25 Mavi",
			"0.10 Mor", "0.05 Gri", "%5 Altın", "%10 Gumus" };
	


	public String[] getBas1() {
		return bas1;
	}

	public String[] getBas2() {
		return bas2;
	}
	
	

	public String[] getBas3() {
		return bas3;
	}

	public String[] getCarpan() {
		return carpan;
	}

	public String[] getTolerans() {
		return tolerans;
	}
	
	public double carpan_bul(int c) {
		double crp;
		if (c == 10) {
			crp = 0.1;
		} else if (c == 11) {
			crp = 0.01;
		} else {
			crp = Math.pow(10, c);
		}
		return crp;
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
