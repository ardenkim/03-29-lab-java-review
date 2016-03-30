package edu.info498.review;

public class Husky extends Dog implements Huggable {

	public Husky(String name){
		super(name, "Husky");
	}

	public Husky() {
		this("Fido");
	}

	public void pullSled() {
		System.out.println(this+" is pulling sled.");
	}

	public void bark() {
		System.out.println(this+" says: woof!");
	}

	public void hug() {
		System.out.println("A husky is squished in a great big hug.");
	}
	public void test() {
		System.out.println("test");
	}
}