package exDictionar;

public class Test {

	public static void main(String[] args) {
		
		Dictionar dict= new Dictionar();
		dict.addCuvant("mar", "apple");
		dict.addCuvant("masina", "car");
		dict.addCuvant("casa", "house");
		dict.addCuvant("geam", "window");
		dict.addCuvant("pahar", "glass");
		
		dict.afisareCuvinte();
		
		System.out.println(dict.translate("geam"));
		
		System.out.println();
		dict.afisareCuvRo();
		
		System.out.println();
		dict.afisareCuvEng();
		System.out.println();
		
		dict.setNewTranslate("masina", "audi");
		System.out.println(dict.translate("masina"));
		
	}
}
