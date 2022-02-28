package xebia.bcp7.week01.main;
/* Reviewed by SKP on 27-02-2022

+Code Evaluated at 158/200
+Code Formatted, Reviewed*/
class Parent {
	void walk() {
		System.out.println("I can Walk");
	}

	void Jump() {
		System.out.println("I can Jump");
	}
}

class Child1 extends Parent {
	void play() {
		System.out.println("I can play");
	}
}

class Child2 extends Parent {
	void Drive() {
		System.out.println("I can drive");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		Child1 a = new Child1();
		a.play();
		a.walk();

		Child2 b = new Child2();
		b.Drive();
		b.Jump();

	}

}
