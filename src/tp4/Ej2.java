package tp4;

public class Ej2 {
	public static int min(int i1, int i2, int i3, int i4) {
		return Math.min(Math.min(i1, i2), Math.min(i3, i4));
	}
	
	public static void main(String[] args) {
		System.out.println(min(2, 4, 7, 9));
		System.out.println(min(9, 4, 7, 2));
		System.out.println(min(4, 9, 7, 2));
		System.out.println(min(7, 9, 9, 2));
	}
}
