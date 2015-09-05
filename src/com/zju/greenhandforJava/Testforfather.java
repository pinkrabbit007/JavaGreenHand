package com.zju.greenhandforJava;
public class Testforfather {

	public Testforfather() {
		// System.out.println("Construct Test father");
		age = 50;
		showage();
		System.out.println("age  is " + age);
	}

	void dosomething() {
		System.out.println("Dosomething Test father");
	}

	public int age;

	void showage() {
		System.out.println("age  is " + age);
	}
}

class Testforchild extends Testforfather {
	public Testforchild() {
		super();
		System.out.println("Construct Test child");
		// age = 10;
		// showage();
	}

	void dosomething() {
		System.out.println("Dosomething Test child");
	}

	public int age;

	void showage() {
		System.out.println("age  is " + age);
	}
}