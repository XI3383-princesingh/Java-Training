package Training;
/* Reviewed by SKP on 27-02-2022

+Code Evaluated at 158/200
+Code Formatted, Reviewed*/
public class SearchString {
	public static void main(String[] args) {
		String arr[] = { "apple", "orange", "grape", "kiwi" };
		String item = "grape";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				System.out.println(item + " " + "is present at position " + (i + 1));
			}
		}

	}
}
