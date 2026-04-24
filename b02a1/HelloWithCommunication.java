public class HelloWithCommunication {

    public static void main(String[] args) {
     System.out.print(Mathe.abs(-10)+ "\n");
        if(MatheTest.testAbs(-10)){
            System.out.print("Test Erfolgreich: Math.abs() tut was es soll ;) \n");
            System.out.print("Bei eingabe -10 liefert die funktion Mathe.abs(): " + Mathe.abs(-10) + "\n");
        } else {
            System.out.print("Math.abs() hat Probleme\n");
        }
        if(MatheTest.testMax3(1,2,3)){
            System.out.print("Test Erfolgreich: Math.max3() tut was es soll ;) \n");
            System.out.print("Bei eingabe 1,2,3 liefert die funktion Mathe.max3(): " + Mathe.max3(1,2,3) + "\n");
        } else {
            System.out.print("Math.max3() hat Probleme\n");
        }
    }
}
