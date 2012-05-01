package tp1;

import java.util.Scanner;

public class Ej5B {
	
	public static void main(String[] args) {
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
				char result= Character.toUpperCase((char)in);
				System.out.println("La mayuscula de ["+(char)in+"] es ["+result+"]");
			}
		}
	}
}