package _03_Intro_to_Enums;


import java.util.Random;

import javax.swing.JOptionPane;

enum Elements {

	/*
	 * enums (short for enumerated type) are a class-like structure that can contain
	 * a set of specific data values.
	 */

	// Note: Every entry must be unique.
	AIR, EARTH, FIRE, METAL, WATER, WOOD
}

public class IntroToEnums {

	public static void main(String[] args) {

		// 1. In your package explorer, create a new enum file called StatesOfMatter.
		// Hint: This is very similar to how you create a new class file.
	//yuh
		// 2. Give the enum the following values:
		// SOLID, LIQUID, GAS
	//yuh
		// 3. Create an array of StatesOfMatter with all the values using .values().
		// Hint: Use "StatesOfMatter." as if it were a static method.
		States0fMatter[] arr = States0fMatter.values();
		// 4. Ask the user for a state of matter.
		String ans = JOptionPane.showInputDialog(null, "Please enter a state of matter");
		// 5. Iterate through the array and find what the user entered.
		// Hint: .name() or .toString
		
		for( int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			if( ans.equalsIgnoreCase(arr[i].name())) {
				System.out.println(arr[i].ordinal());
				States0fMatter.setCelsiusTemp(States0fMatter.getDefaultValue(arr[i]));
				System.out.println(States0fMatter.getCelsiusTemp()); 
				System.out.println( States0fMatter.convertoFar(States0fMatter.getCelsiusTemp()));
			}
			
		}
		
		
		// 6. Print outs its ordinal(order in the enum list)
		// Hint: .ordinal()
	//done
		// 7. Add a celsiusTemp member variable to StatesOfMatter.
		// Note: Make sure to encapsulate it.
	//done
		// 8. Give it a default value of the temperature each state occurs in water.
		// Hint: Gas = 100, Liquid(room temp) = 25.55, Solid = 0
//done
		// Example
		// enum Months{
		//
		// JAN(31),FEB(28),MAR(31),APR(30),MAY(31),JUN(30),JUL(31),AUG(31),SEP(30),
		// OCT(31),NOV(30),DEC(31);
		//
		// int daysInMonth;
		//
		// private Months(int daysInMonth) {
		// this.daysInMonth = daysInMonth;
		// }

		// 9. Add a convertToFahrenheit method to StatesOfMatter
		// Hint: Return the conversion: F = (C * 9/5) + 32
		
		// 10. Create a variable of the StatesOfMatter type and initialize it randomly.
	    Random r = new Random();
		States0fMatter obj = arr[r.nextInt(3)];
		System.out.println(obj.name());
		
		// 11. Print outs both of its temperatures.
		States0fMatter.setCelsiusTemp(States0fMatter.getDefaultValue(obj));
		System.out.println(States0fMatter.getCelsiusTemp()); 
		System.out.println( States0fMatter.convertoFar(States0fMatter.getCelsiusTemp()));
		// 11. Create a switch statement that switches on the variable you created.
		// Note: When creating the cases, you can omit the "StatesOfMatter."
		String c = JOptionPane.showInputDialog(null, "Please enter a food ( pasta, ice, soda ) ");
		switch (c) {
		case "pasta":
			System.out.println("the tempature of your pasta is..");
			States0fMatter.setCelsiusTemp(States0fMatter.getDefaultValue(States0fMatter.GAS));
			System.out.println(States0fMatter.getCelsiusTemp()); 
			System.out.println( States0fMatter.convertoFar(States0fMatter.getCelsiusTemp()));
			break;
		case "ice":
			System.out.println("the tempature of your ice is..");
			States0fMatter.setCelsiusTemp(States0fMatter.getDefaultValue(States0fMatter.SOLID));
			System.out.println(States0fMatter.getCelsiusTemp()); 
			System.out.println( States0fMatter.convertoFar(States0fMatter.getCelsiusTemp()));
			break;
		case "soda":
			System.out.println("the tempature of your soda is..");
			States0fMatter.setCelsiusTemp(States0fMatter.getDefaultValue(States0fMatter.LIQUID));
			System.out.println(States0fMatter.getCelsiusTemp()); 
			System.out.println( States0fMatter.convertoFar(States0fMatter.getCelsiusTemp()));
			break;
		default:
			System.out.println("this food item is not on the menu");
			break;
		}
		// 12. For each case, print your favorite food or drink that uses that state.
		// e.g. Gas/Boiling for Pasta, Solid/Ice for Popsicles, Liquid for Soda

	}

	
	

}
