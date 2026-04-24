public class Mathe {
    public static int abs(int zahl){
        // System.out.print("Die eingegebene Zahl war " + zahl + "\n");
        int tmp;
        if(zahl < 0){
            tmp = zahl * (-1);
        } else {
            tmp = zahl;
        }
        return tmp;
    }

    public static int max3(int zahl1, int zahl2, int zahl3){
        int max;
        if(zahl1 > zahl2){
            if(zahl2 > zahl3){
                max = zahl1;
            } else {
                max = zahl2;
            }
        } else {
            max = zahl3;
        }
        return max;
    }
}
