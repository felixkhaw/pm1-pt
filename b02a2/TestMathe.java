public class TestMathe {
	public static void main(String[]args){
		if (args.length != 1) {
			System.out.println("Verwendung java test: <zahl>");
			return;
		}

		int fak = Integer.parseInt(args[0]);

		if(Mathe.fakLoop(fak) == -1){
			System.out.println("Fehler, falsche Eingabe!");
			return;
		}
		
		System.out.println("Die Faktultät von " + fak + " mit Math.fakLoop() ist: " + Mathe.fakLoop(fak));
		System.out.println("Die Faktultät von " + fak + " mit Math.fakLoop() ist: " + Mathe.fakRek(fak));
		Mathe.quadrateAusgabeRueck(fak);
	}
}
