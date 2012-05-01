package tp3.ej5;

public class Fraccionarios {
	int numerador, denominador;

	public Fraccionarios(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	public Fraccionarios sumar(Fraccionarios otro) {
		int denominador = otro.denominador * this.denominador;
		int numerador = (denominador/this.denominador)*this.numerador + (denominador/otro.denominador)*otro.numerador;
		Fraccionarios resultado = new Fraccionarios(numerador, denominador);
		resultado.simplificar();
		return resultado;
	}
	

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	@Override
	public String toString() {
		return numerador+"/"+denominador;
	}
	
	
	public Fraccionarios restar(Fraccionarios otro) {
		return sumar(otro.complemento());
	}
	
	public Fraccionarios complemento() {
		return new Fraccionarios(0-(this.numerador), this.denominador);
	}
	
	public Fraccionarios multiplicar(Fraccionarios otro) {
		int numerador = this.numerador * otro.numerador;
		int denominador = this.denominador * otro.denominador;
		Fraccionarios resultado = new Fraccionarios(numerador, denominador);
		resultado.simplificar();
		return resultado;
	}
	
	public Fraccionarios inverso() {
		return new Fraccionarios(this.denominador, this.numerador);
	}
	
	public Fraccionarios dividir(Fraccionarios otro) {
		return multiplicar(otro.inverso());
	}
	
	public void simplificar(){
		int mcd = maximoComunDivisor(numerador, denominador);
		if(mcd!=1) {
			numerador /= mcd;
			denominador /= mcd;
		}
	}
	
	static int maximoComunDivisor(int a, int b) {
	   if (b==0) 
	     return a;
	   else
	     return maximoComunDivisor(b, a % b);
	}
	
	
	public static void main(String[] args) {
		Fraccionarios a= new Fraccionarios(4, 3);
		Fraccionarios b= new Fraccionarios(1, 2);
		Fraccionarios c= a.sumar(b);
		System.out.println("c=a+b:"+c);
		
		
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("!b:"+b.complemento());
		
		Fraccionarios d = c.restar(b);
		System.out.println("d=c-b:"+d);
		
		
		Fraccionarios e= c.dividir(a);
		System.out.println("e=c/a:"+e);
		
		Fraccionarios f= a.multiplicar(b);
		System.out.println("f=a*b:"+f);
		
	}
	
}
