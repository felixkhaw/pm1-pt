public class Wertebereich {
    public static boolean testIntervallNullBisHundert(int x){
		  for(int i = 0; i < 100; i++){
			  if(i == x){
				  return true;
			  }
		  }
		  return false;
	  }

	public static boolean testIntervallMinusZwanzigBisPlusZwanzig(int x){
		for(int i = -20; i<=20; i++){
		  // System.out.println("For wird ausgeführt!");
			if(i == x){
			  // System.out.println("If in for 1 wird ausgeführt!");
				for(int j = 4; j<=8; j++){
				  if(j == x){
				    return false;
				  }
				}
				return true;
			}
		}
		return false;
	}
	
	public static boolean testUngeradeNichtNegativeZahl(int x){
		return (x % 2 != 0) && (x >= 0);
	}
	
	public static boolean testYXkleinerxYoBk12(int x, int y){
		return (x < y) || ( x > 12 && y > 12);
	}
}

