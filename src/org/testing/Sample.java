package org.testing;

public class Sample extends Employee {
	public Sample() {
		super();
		System.out.println("child non para cons");
	}

	public Sample(int age) {
		this("Greens", 7654321999l);
		System.out.println("child int para cons");
	}

	public Sample(String name, long mob) {
		this();
		System.out.println("chilg string and long para cons");
		System.out.println("code adding");
	}

	public static void main(String[] args) {
		Sample s = new Sample(29);
	}

}
