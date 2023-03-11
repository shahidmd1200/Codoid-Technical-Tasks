package org.codoidjava;

// 2. How do we reverse a string?

public class ReversedStringClass {
	public static void main(String[] args) {
		
		String value = "Mohamed Shahid";
		StringBuilder a = new StringBuilder(value);
		a.reverse();
		
		System.out.println(a.toString());

	}
}
