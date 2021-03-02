
public class star {

	public static void main(String[] args) {
		char arr[][] = new char[4][];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new char[i];
		}
		for (int firstdim = 0; firstdim < arr.length; firstdim++) {
			for (int secdim = 0; secdim < arr[firstdim].length; secdim++) {
				arr[firstdim][secdim] = '*';
			}
		}
		for (int firstdim = 0; firstdim < arr.length; firstdim++) {

			for (int secdim = 0; secdim < arr[firstdim].length; secdim++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}
}
