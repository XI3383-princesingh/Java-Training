package Training;
/* Reviewed by SKP on 27-02-2022

+Code Evaluated at 158/200
+Code Formatted, Reviewed*/
class parentt {
	void display() {
		System.out.println("Inside parent class");
	}
}

class childd extends parentt {
	void display() {
		System.out.println("inside child class");
	}
}

public class overriding {
	public static void main(String[] args) {
		parentt p = new parentt();
		p.display();
		childd c = new childd();
		c.display();
		parentt pc = new childd();
		pc.display();

	}

}
