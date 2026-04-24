public class Mathe {
    public static int fak(int n){
        int tmp = 0;
        while(n>0){
            System.out.println("Runde: " + n);
            if(tmp == 0){
                tmp = n;
            }
            System.out.println("tmp: " + tmp + " = " + tmp + " * " + n +"\n");
            tmp = tmp * (n-1);
            --n;
        }
        return tmp;   
    }
}
