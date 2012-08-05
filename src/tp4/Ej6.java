package tp4;

public class Ej6 {
    private static final String[] P_UNIDADES = {"", "un ", "dos ", "tres ", "cuatro ", "cinco ", "seis ", "siete ", "ocho ", "nueve "};
    private static final String[] P_DECENAS = {"diez ", "once ", "doce ", "trece ", "catorce ", "quince ", "dieciseis ", "diecisiete ", "dieciocho ", "diecinueve", "veinte ", "treinta ", "cuarenta ", "cincuenta ", "sesenta ", "setenta ", "ochenta ", "noventa "};
    private static final String[] P_CENTENAS = {"", "ciento ", "doscientos ", "trecientos ", "cuatrocientos ", "quinientos ", "seiscientos ", "setecientos ", "ochocientos ", "novecientos "};

    public static String traducir(int numero) {
        String literal = "";
	    if (numero == 0) {
            literal = "cero ";
        } else if (numero > 999) {
            literal = getMiles(""+numero);
        } else if (numero > 99) {
            literal = getCentenas(""+numero);
        } else if (numero > 9) {
            literal = getDecenas(""+numero);
        } else {
            literal = getUnidades(""+numero);
        }
        return literal;
    }

    private static String getUnidades(String numero) {// 1 - 9
        String num = numero.substring(numero.length() - 1);
        return P_UNIDADES[Integer.parseInt(num)];
    }

    private static String getDecenas(String num) {// 99                        
        int n = Integer.parseInt(num);
        
        if (n < 10) {
            return getUnidades(num);
        } else if (n > 19) {
            String u = getUnidades(num);
            if (u.equals("")) { 
                return P_DECENAS[Integer.parseInt(num.substring(0, 1)) + 8];
            } else {
                return P_DECENAS[Integer.parseInt(num.substring(0, 1)) + 8] + "y " + u;
            }
        } else {
            return P_DECENAS[n - 10];
        }
    }

    private static String getCentenas(String num) {
        if( Integer.parseInt(num)>99 ){
            if (Integer.parseInt(num) == 100) {
                return " cien ";
            } else {
                 return P_CENTENAS[Integer.parseInt(num.substring(0, 1))] + getDecenas(num.substring(1));
            } 
        }else{ 
            return getDecenas(Integer.parseInt(num)+"");            
        }        
    }

    private static String getMiles(String numero) {
        String c = numero.substring(numero.length() - 3);
        String m = numero.substring(0, numero.length() - 3);
        String n="";

        if (Integer.parseInt(m) > 0) {
            n = getCentenas(m);           
            return n + "mil " + getCentenas(c);
        } else {
            return "" + getCentenas(c);
        }

    }
    
    public static void main(String[] args) {
    	for (int i = 0; i < 40; i++) {
    		double d = Math.random();
    		int rnd = (int) (9999 * d);
    		System.out.println(rnd+":"+traducir(rnd));
		}
	}
}
