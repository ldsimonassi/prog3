package tp4;

public class Ej3 {
	public static double getY(double pendiente, double ordenada, double x) {
		return ordenada + (pendiente * x);
	}
	
	public static void main(String[] args) {
		double pendiente = 0.5;
		double ordenada = 1;
		
		System.out.println("Y = "+pendiente+"*x + "+ordenada);
		for(int i=0 ; i< 10; i++){
			System.out.println("x:"+i+" y:"+ getY(pendiente, ordenada, (double)i));
		}
	}
}
