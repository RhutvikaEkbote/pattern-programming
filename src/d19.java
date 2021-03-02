
public class d19 {
	public static void main(String[] args) {
		int k = 5;
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5 - i; j++) {

				System.out.print(k + " ");
				k--;
			}
			System.out.println();
			k=5;

		}
	}
}
