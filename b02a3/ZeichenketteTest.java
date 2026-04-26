public class ZeichenketteTest {
	public static void main(String[] args){
		System.out.println("Testen der Klasse Zeichenkette.java");
		int n = 0;
		while(n<24){
			System.out.println("Aufruf der Methode grussMitZeit mit den Parametern " + n + " und Jo");
			System.out.println(Zeichenkette.grussMitZeit(n, "Jo"));
			++n;
		}
		System.out.println("Aufruf der Methode zitronenEis mit dem Parameter 5");
		System.out.println(Zeichenkette.zitronenEis(5));
	}
}
