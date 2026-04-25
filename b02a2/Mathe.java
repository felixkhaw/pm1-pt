public class Mathe {
	public static int fakLoop(int n){
		int tmp;
		if(n < 0){
			return -1;
		} else {
			tmp = n;
		}

		while(n > 1){
			tmp = tmp * (n-1);
	    --n;
		}
		return tmp;
}

	public static int fakRek(int n){
		if(n == 0){ return 1; }
		int fak = n * fakRek(n-1);
		return fak;
	}

	public static void quadrateAusgabeRueck(int n){
		while(n>0){
			int quad = n*n;
			System.out.println("Das Quadrat der Zahl " + n + " ist " + quad);
			--n;
		}
	}
}
