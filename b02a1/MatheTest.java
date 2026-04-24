public class MatheTest {
    public static boolean testAbs(int zahl){
        boolean tmp;
        if(Mathe.abs(-10) == 10){
            tmp = true;
            //tmp = false;  // Zum testen des Testes        
        } else {
            tmp = false;
            // tmp = false; // Zum testen des Testes
        }
        return tmp;
    }
    public static boolean testMax3(int zahl1, int zahl2, int zahl3){
        boolean tmp;
        if(Mathe.max3(1,2,3) == 3){
            tmp = true;
            //tmp = false;  // Zum testen des Testes        
        } else {
            tmp = false;
            // tmp = false; // Zum testen des Testes
        }
        return tmp;
    }
}

