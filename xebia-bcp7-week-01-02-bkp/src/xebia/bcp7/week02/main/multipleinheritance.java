package xebia.bcp7.week02.main;
/* Reviewed by SKP on 27-02-2022

+Code Evaluated at 158/200
+Code Formatted, Reviewed*/
interface parent1 {
	public void displayparent1();
}

interface parent2 {
	public void displayparent2();
}

class child implements parent1, parent2 {

	@Override
	public void displayparent2() {
		// TODO Auto-generated method stub
		System.out.println("This is display method of parent 2");
	}

	@Override
	public void displayparent1() {
		// TODO Auto-generated method stub
		System.out.println("This is display method of parent 1");
	}

}

public class multipleinheritance {
	public static void main(String[] args) {
		child obj = new child();
		obj.displayparent1();
		obj.displayparent2();
	}
}
