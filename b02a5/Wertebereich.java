public class Wertebereich {
    public static boolean testIntervallNullBisHundert(int x){
		boolean status;
		for(int i = 0; i<=100; i++){
			if(i == x){
				status = true;
			} else {
				status = false;
			}
		}
		return status;
	}

	public static boolean testIntervallMinusZwanzigBisPlusZwanzig(int x){
		boolean status;
		for(int i = -20; i<=20; i++){
			if(i == x){
				for(int i = 4; i<=8; i++){
					status = true;
				}
			} else {
				status = false;
			}
		}
		return status;
	}
}
