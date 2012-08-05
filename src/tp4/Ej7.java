package tp4;

public class Ej7 {
	
	public static boolean isValidDate(int year, int month, int day) {
		if(month<1 || month>12) 
			return false;
		
		int numDays= Ej4.getNumDays(month, year);
		
		if(day > numDays || day < 1)
			return false;
		
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isValidDate(0, 1, 3));
		System.out.println(isValidDate(2012, 13, 3));
		System.out.println(isValidDate(2012, 2, 29));
		System.out.println(isValidDate(2012, 2, 30));
		System.out.println(isValidDate(2011, 2, 29));
		System.out.println(isValidDate(2011, 2, 28));
	}
	
}
