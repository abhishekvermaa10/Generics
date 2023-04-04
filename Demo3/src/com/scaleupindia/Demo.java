package com.scaleupindia;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo {
	public static void main(String[] args) {
		display("Java");
		display(3);
		displayGeneric("Java");
		displayGeneric(3);
	}

	public static void display(String item) {
		System.out.println(item.getClass().getName() + " = " + item);
	}

	public static void display(Integer item) {
		System.out.println(item.getClass().getName() + " = " + item);
	}

	public static <E> void displayGeneric(E item) {
		System.out.println(item.getClass().getName() + " = " + item);
	}
}