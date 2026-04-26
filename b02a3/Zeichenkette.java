public class Zeichenkette {
	public static String grussMitZeit(int stunde, String name){
		String ergebnis = "";
//		if(stunde >= 24){
//			System.out.println("Error: Der Parameter Stunde ist nicht im gewünschten Bereich");
//		}

		if(stunde<= 12){
			ergebnis = "(Stunde: " + stunde + ") => Guten Morgen, " + name + " !";
		} else {
			if(stunde>=18){
				ergebnis = "(Stunde: " + stunde + ") => Guten Abend, " + name + " !";
			} else {
				ergebnis = "(Stunde: " + stunde + ") => Guten Tag, " + name + " !";
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
