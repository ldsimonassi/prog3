package tp4;

public class Ej4 {
	public static int getNumDays(int month, int year) {
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
				return 31;
			case 4: case 6: case 9: case 11: 
				return 30;
			case 2:
				if((year%4) == 0) 
					return 29;
				else
					return 28;
			default:
				throw new IllegalArgumentException("Invalid month:"+month);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(getNumDays(7, 2012));
		System.out.println(getNumDays(2, 2012));
		System.out.println(getNumDays(2, 2011));
		System.out.println(getNumDays(2, 2010));
		System.out.println(getNumDays(2, 2009));
		System.out.println(getNumDays(2, 2008));
	}
}
