package Training;

/* Reviewed by SKP on 27-02-2022

+Code Evaluated at 158/200
+Code Formatted, Reviewed*/
abstract class Laptop {
	int brand;
	int cost;

	abstract void Work();

}

class HP extends Laptop {

	@Override
	void Work() {
		// TODO Auto-generated method stub
		System.out.println("HP is mostly used by students");

	}
}

class asus extends Laptop {

	@Override
	void Work() {
		// TODO Auto-generated method stub
		System.out.println("Asus is mostly used by Gamers");

	}
}

class macbook extends Laptop {

	@Override
	void Work() {
		// TODO Auto-generated method stub
		System.out.println("macbook is mostly used by bloggers and editors");

	}
}

public class Abstraction {
	public static void main(String[] args) {
		HP phantom = new HP();
		phantom.Work();

		macbook m1 = new macbook();
		m1.Work();

		asus rog = new asus();
		rog.Work();
	}

}
