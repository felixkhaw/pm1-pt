public class Mathe {
    public static int fak(int n){
        int tmp;
        // Den Fall abdecken das n eine negative Zahl ist.
        if(n < 0){
            tmp = n * (-1);
        } else {
            tmp = n;
        }
        
	    int i = 1;
        while(n > 1){
            System.out.println("Runde: " + i);
            // System.out.println("tmp: " + tmp + "*" + (n-1) + " = " +  tmp*(n-1) );
            tmp = tmp * (n-1);
		
	    ++i;
	    --n;
        }
	    return tmp;
    }
}
