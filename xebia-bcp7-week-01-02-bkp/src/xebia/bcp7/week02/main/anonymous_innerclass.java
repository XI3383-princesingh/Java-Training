package xebia.bcp7.week02.main;
/* Reviewed by SKP on 27-02-2022

+Code Evaluated at 158/200
+Code Formatted, Reviewed*/
class A {

	public void display() {
		System.out.println("Inside normal class");
	}

	class B {
		public void display() {
			System.out.println("Inside inner class");
		}
	}
}

public class anonymous_innerclass {
	public static void main(String[] args) {
		A obj = new A();
		obj.display();

		A obj1 = new A() {
			public void display() {
				System.out.println("Inside anonymous class");
			}
		};
		obj1.display();
		A.B obj2 = obj1.new B();
		obj2.display();

	}
}
