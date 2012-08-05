package tp4;

import java.util.ArrayList;

public class Ej5 {
	public static boolean isValidCuit(String cuit) {
		char[] cuitChars = cuit.toCharArray();
		ArrayList<Integer> cuitNumbers = new ArrayList<Integer>(); 
		for (int i = 0; i < cuitChars.length; i++) {
			if(cuitChars[i] == ' ' || cuitChars[i] == '-')
				continue;
			if(cuitChars[i] > '9' && cuitChars[i] < '0')
				throw new IllegalArgumentException("Invalid CUIT character: ["+cuitChars[i]+"]");

			cuitNumbers.add(Integer.valueOf(""+cuitChars[i]));
		}

		int[] mult = new int [] { 5, 4, 3, 2, 7, 6, 5, 4, 3, 2 };
		int total = 0;

		if(cuitNumbers.size() < mult.length) 
			throw new IllegalArgumentException("Invalid cuit length, must be at least:"+ mult.length);

		for (int i = 0; i < mult.length; i++) {
			total += mult[i] * cuitNumbers.get(i);
		}

		int resto = total % 11;

		int digitoValidador = resto == 0 ? 0 :resto == 1 ? 9: 11-resto; 

		return cuitNumbers.get(10) == digitoValidador;
	}
	
	public static void main(String[] args) {
		System.out.println(isValidCuit("30500003886"));
		System.out.println(isValidCuit("30500008454"));
		System.out.println(isValidCuit("30-50001374-1"));
		System.out.println(isValidCuit("30500977848"));
		System.out.println(isValidCuit("30-65511651-2"));
		System.out.println(isValidCuit("30-65511620-2"));
	}
}
