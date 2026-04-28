public class Zeichenkette {

    public static String wiederhole(int n, String s, char t){
		String tmp = "";
		while(n>0){
			if(n==1){
				tmp += s;
			} else {
				tmp += s;
				tmp += t;
			}
			--n;
		}
		return tmp;
	}
}
