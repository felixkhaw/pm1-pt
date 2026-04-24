public class Mathe {
    public static int abs(int zahl){
        System.out.print("Die eingegebene Zahl war " + zahl + "\n");
        int tmp;
        if(zahl < 0){
            tmp = zahl * (-1);
        } else {
            tmp = zahl;
        }
        return tmp;
    }
}
