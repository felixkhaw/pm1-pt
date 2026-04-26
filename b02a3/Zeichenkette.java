public class Zeichenkette {
	public static String grussMitZeit(int stunde, String name){
		String ergebnis = "";
		if(name.length() == 1){
			System.out.println("Error: Es gibt keinen Namen mit nur einem Buchstaben");
			throw new IllegalArgumentException("Ungültiger Parameter");
		}
		// Wenn stunde größer oder gleich 24 ist, ist der Wert außerhalb des gewünschten Bereiches.
		if(stunde >= 24){
			System.out.println("Error: Der Parameter Stunde ist nicht im gewünschten Bereich");
			throw new IllegalArgumentException("Ungültiger Parameter");
		}

		if(stunde<=12){
			ergebnis = "Guten Morgen, " + name + " !";
		} else {
			if(stunde>=18){
				ergebnis = "Guten Abend, " + name + " !";
			}
		}
		return ergebnis;
	}

	public static String zitronenEis(int n){
		String super_n = "";
		String z_n = "";
		while(n>0){
			super_n += "super ";
			z_n += "Z";
			--n;
		}
		return super_n + "leckeres " + z_n + "itroneneis";
	}
}
