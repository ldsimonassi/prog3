package tp4;

public class Ej1 {
	public static boolean isPrime(int number) {
		for(int i= 2; i < number ; i++) {
			if((number % i) == 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		long primes = 0;
		for (int i = 1; i < 1000000; i++) {
			if(isPrime(i))
				primes ++;
			if(i % 10000 == 0) {
				System.out.println("Primes:"+primes+" total:"+i +" ratio\t"+((double)primes/(double)i));
			}
		}
		System.out.println("Cantidad de numeros primos:" + primes);
	}
}
