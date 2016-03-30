package edu.info498.review;

import java.util.*;

/**
 * A basic class for running and testing the Dog class
 */
public class Tester {

	public static void main(String[] args){
		Dog dog = new Dog();
		dog.bark();
		dog.walk();
		Dog[] pups = Dog.createPuppies(3);
		System.out.println(Arrays.toString(pups));
		Husky husky = new Husky();
		husky.bark();
		husky.pullSled();
		husky.hug();
		TeddyBear ted = new TeddyBear();
		ted.hug();

		Dog v1 = new Husky();
		Husky v2 = (Husky)v1;
		Huggable v3 = new Husky();
		Huggable v4 = new TeddyBear();

		ArrayList<Huggable> hugList = new ArrayList<Huggable>();
		hugList.add(new Husky());
		hugList.add(new TeddyBear());

		for(Huggable thing : hugList) { //enhanced for loop ("foreach" loop)
		    thing.hug();
		}
	}
}