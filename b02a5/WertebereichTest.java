public class WertebereichTest {
  public static void main(String[] args){
    System.out.println("Test mit 110: Wertebereich.testIntervallNullBisHundert\n" +      Wertebereich.testIntervallNullBisHundert(110));
    System.out.println("Test mit 80: Wertebereich.testIntervallNullBisHundert\n" +      Wertebereich.testIntervallNullBisHundert(80));
    System.out.println("Test mit 6: Wertebereich.testIntervallMinusZwanzigBisPlusZwanzig\n" +      Wertebereich.testIntervallMinusZwanzigBisPlusZwanzig(6));
    System.out.println("Test mit 10: Wertebereich.testIntervallMinusZwanzigBisPlusZwanzig\n" +      Wertebereich.testIntervallMinusZwanzigBisPlusZwanzig(10));
    System.out.println("Test mit -7: testUngeradeNichtNegativeZahl\n" +      Wertebereich.testUngeradeNichtNegativeZahl(-7));
    System.out.println("Test mit 7: testUngeradeNichtNegativeZahl\n" +      Wertebereich.testUngeradeNichtNegativeZahl(7));
	System.out.println("Test mit x=7, y=10: testYXkleinerxYoBk12\n" +      Wertebereich.testYXkleinerxYoBk12(7,10));
	System.out.println("Test mit x=10, y=7: testYXkleinerxYoBk12\n" +      Wertebereich.testYXkleinerxYoBk12(10,7));
	System.out.println("Test mit x=14, y=13: testYXkleinerxYoBk12\n" +      Wertebereich.testYXkleinerxYoBk12(14,13));
	}
}
