package Resistor_N;

public class Base_Resistor {
	String[] bas1 = { "1 Kahverengi", "2 Kırmızı", "3 Turuncu", "4 Sarı", "5 Yesil", "6 Mavi", "7 Mor", "8 Gri",
			"9 Beyaz" };
	String[] bas2 = { "0 Siyah", "1 Kahverengi", "2 Kırmızı", "3 Turuncu", "4 Sarı", "5 Yesil", "6 Mavi", "7 Mor",
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

	public String[] getCarpan() {
		return carpan;
	}

	public String[] getTolerans() {
		return tolerans;
	}

}
