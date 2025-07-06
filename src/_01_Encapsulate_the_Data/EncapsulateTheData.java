package _01_Encapsulate_the_Data;

public class EncapsulateTheData {

	// 1. Encapsulate all the members.
	//yuhh
	// 2. Implement the setter restrictions described above each member variable.

	// 3. Pass all the JUnit tests.

	/* 
	 * All negative arguments should set itemsReceived to 0.
	 */

	private int itemsReceived;
	
	void setItemsReceived(int itemsreceived) {
		if( itemsreceived < 0 ) {
			this.itemsReceived = 0;
			System.out.println("negative"+itemsReceived);
		}else {
			this.itemsReceived = itemsreceived;
			System.out.println("not negative"+itemsReceived);
		}		
	}
	
	int getItemsReceived() {
		return itemsReceived;
	}
	

	/*
	 * degreesTurned must be locked between 0.0 and 360.0 inclusive.
	 * 
	 * 
	 * All parameters outside this range should set degreesTurned to the nearest
	 * bound.
	 */

	private double degreesTurned;
	
	void setDegreesTurned(double degrees) {
		if( degrees < 0.0 ) {
			this.degreesTurned = 0.0;
		}if( degrees > 360.0 ) {
			this.degreesTurned = 360.0;
		}else {
			this.degreesTurned = degrees;
		}		
	}
	
	double getDegreesTurned() {
		return degreesTurned;
	}

	/*
	 * nomenclature must not contain an empty String.
	 * 
	 * An empty String parameter should set nomenclature to a String with a single
	 * space.
	 */

	private String nomenclature;

	void setNomenclature(String nom) {
		if( nom.isEmpty() ) {
			this.nomenclature = " ";
		}else {
			this.nomenclature = nom;
		}		
	}
	
	String getNomenclature() {
		return nomenclature;
	}
	/*
	 * memberObj must not be a String.
	 * 
	 * A String parameter should set memberObj to a new Object();
	 * 
	 * Hint: Use the instanceof operator.
	 * 
	 * Example:
	 * 
	 * Robot rob = new Robot();
	 * 
	 * System.out.println(rob instanceof Robot); // prints true
	 * 
	 * System.out.println(rob instanceof Random); //prints false
	 */

	private Object memberObj;
	
	void setMemberObj( Object nom) {
		if( nom instanceof String  ) {
			this.memberObj = new Object();
		}else {
			this.memberObj = nom;
		}		
	}
	
	Object getMemberObj() {
		return memberObj;
	}

}
