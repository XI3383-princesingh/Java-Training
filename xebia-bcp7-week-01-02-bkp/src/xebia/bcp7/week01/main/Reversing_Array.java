package xebia.bcp7.week01.main;
/* Reviewed by SKP on 27-02-2022

+Code Evaluated at 158/200
+Code Formatted, Reviewed*/
import java.util.Arrays;
import java.util.Scanner;

public class Reversing_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		int j = 0, k = n - 1;
		while (j < k) {
			int temp = arr[j];
			arr[j] = arr[k];
			arr[k] = temp;
			j++;
			k--;
		}
		sc.close();
		System.out.println(Arrays.toString(arr));
	}

}
