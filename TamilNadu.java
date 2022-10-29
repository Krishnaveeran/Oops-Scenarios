package programmBasics;

public class TamilNadu extends SouthIndia {

	static String capital = "Chennai";

	void speakLanguage() {
		System.out.println("Tamil is  a mother tongue for tamilnadu people");
	}

	void eat() {
		System.out.println("Rice, Idly and Dosa are consumed by tamilnadu people ");
	}

	void dress() {
		System.out.println("Men-Dhoti  Women-Saree");
	}

	void cultivate() {
		System.out.println("Rice and Sugar cane cultivation");
	}

	void livingStyle() {
		System.out.println("Above Average development");
	}

	public static void main(String[] args) {
		SouthIndia si = new TamilNadu();
		System.out.println("Calling by object reference: "+si.capital);
		System.out.println(SouthIndia.capital);
		System.out.println(TamilNadu.capital);
		si.livingStyle();
		si.cultivate();
		si.dress();
		si.eat();
		si.speakLanguage();
	}
}
