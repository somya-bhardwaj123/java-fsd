package multiplecatchblocks;

public class Multiplecatchblocks {

	public static void main(String[] args) {

		try {
			int a[] = new int[7];
			a[7] = 30 / 5;
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}
		System.out.println("rest of the code");
	}

}
