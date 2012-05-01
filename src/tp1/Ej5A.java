package tp1;

import java.util.Scanner;

public class Ej5A {
	
	public static void main(String[] args) {
		final short ADD = (short)'A'-(short)'a';
		final short MAX = (short)'z';
		final short MIN = (short)'a';
		
		Scanner input = new Scanner(System.in);
		input.useDelimiter("\n");
		System.out.println("Escriba un caracter para pasar a mayusculas");
		String str = input.next();
		
		if(str.length()==0 || str.length()>1) {
			System.err.println("Error, ["+str+"] no es un caracter v‡lido");
		} else {
			short in = (short)str.charAt(0);
			if(in>MAX || in<MIN) {
				System.err.println("Error, ["+(char)in+"] no es una minuscula v‡lida ");
			} else {
				short result = (short) (in + ADD);
				System.out.println("La mayuscula de ["+(char)in+"] es ["+(char)result+"]");
			}
		}
	}
}