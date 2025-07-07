package _03_Intro_to_Enums;

public enum States0fMatter {

	 SOLID,LIQUID, GAS;
	 
	 private static double celsiusTemp;
	 
	 static void setCelsiusTemp(double cels) {
		 celsiusTemp = cels;
	 }
	 static double getCelsiusTemp() {
		 return celsiusTemp;
	 }
	 static double getDefaultValue(States0fMatter state) {
		 if(state == LIQUID ) {
			 return 25.55;
		 } else if( state == SOLID) {
			 return 0.0;
		 }else {
			 return 100.0;
		 }
	 }
	 static double convertoFar( double C ) {
		 double F = (C * 9/5) + 32;
		 return   F;
	 }
	 
}
