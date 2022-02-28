package xebia.bcp7.week01.main;
/* Reviewed by SKP on 27-02-2022

+Code Evaluated at 158/200
+Code Formatted, Reviewed*/
import java.util.Scanner;

public class Cyclic_Queue {
	public static int n = 4;
	public static int Queue[] = new int[n];
	public static int Front = -1;
	public static int Rear = -1;

	public static void Insert(int a) {
		if (Front == -1) {
			Front = 0;
		}
		if (Front == 0 && Rear == n - 1 || (Front == Rear + 1 && Rear != -1)) {
			System.out.println("Queue Overflow");
			return;
		}
		if (Rear == n - 1) {
			Rear = -1;
		}
		Rear++;
		Queue[Rear] = a;

	}

	public static int Delete() {
		if (Front == -1) {
			System.out.println("Queue Underflow");
			return 0;
		}
		if (Front == Rear) {
			Front = -1;
			Rear = -1;
			return 0;
		}
		if (Front == n - 1) {
			Front = 0;
		}
		int item = Queue[Front];
		Front++;
		return item;

	}

	public static void Display() {
		if (Rear < Front) {
			for (int i = Front; i < n; i++) {
				System.out.print(Queue[i] + "\t");
			}
			for (int j = 0; j <= Rear; j++) {
				System.out.print(Queue[j] + "\t");
			}
		} else {
			for (int i = Front; i <= Rear; i++) {
				System.out.print(Queue[i] + "\t");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cont;

		do {
			System.out.println(
					"What do you want to do?" + "\n" + "1.Insert" + "\n" + "2.Delete" + "\n" + "3.Display" + "\n");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter Element to push");
				int a = sc.nextInt();
				Insert(a);
				break;
			case 2:
				System.out.println("Item Deleted: " + Delete());
				break;
			case 3:
				Display();
				break;
			default:
				System.out.println("Wrong Input");
			}
			System.out.println("\n" + "Do you want to continue?" + "\n" + "1. Yes" + "\n" + "2. No" + "\n");
			cont = sc.nextInt();
		} while (cont == 1);
		sc.close();
	}

}
