package Training;
/* Reviewed by SKP on 27-02-2022

+Code Evaluated at 158/200
+Code Formatted, Reviewed*/
public class Compile_time_Polymorphism {
	public static int add(int a, int b) {
		return a + b;
	}

	public static double add(double a, double b) {
		return a + b;
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		System.out.println(add(5, 8));
		System.out.println(add(5, 8, 7));
		System.out.println(add(5.7, 8.65));

	}

}
