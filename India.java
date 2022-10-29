package programmBasics;

abstract class India {

	abstract void speakLanguage();

	abstract void eat();

	abstract void dress();

	static String capital = "New Delhi";

	public India(String primeMinister) {
		System.out.println("Our Prime Minister is :" + primeMinister);
	}

	public India() {
		this("Narendira Modi");
	}

}
