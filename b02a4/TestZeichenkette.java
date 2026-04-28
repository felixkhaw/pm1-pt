public class TestZeichenkette {
    public static void main(String[] args){
		System.out.println("Test der funktion wiederhole der Klasse Zeichenkette mit den Parametern: [1-20], Humba, ','");
		int n = 1;
		while(n<20){
			System.out.println("("+ n +") " + Zeichenkette.wiederhole(n,"Humba", ','));
			++n;			
		}
	}
}
