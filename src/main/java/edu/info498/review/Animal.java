package edu.info498.review;

/**
 * A parent class for Animals
 * @author Joel Ross
 */
public abstract class Animal
{
	public Animal(){
		//empty constructor
	}

	public void walk() {
		System.out.println(this+" walks.");
	}

	public void speak() {
		//Be sure to override this!!
	}

	public String toString() {
		return "An Animal";
	}
}

