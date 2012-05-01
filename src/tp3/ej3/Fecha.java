package tp3.ej3;

public class Fecha {
	int dia, mes, a–o;
	
	
	public Fecha() {
		this(1, 1, 2000);
	}
	
	public Fecha(int dia, int mes, int a–o){
		this.dia = dia;
		this.mes = mes;
		this.a–o = a–o;
	}
	
	@Override
	public String toString() {
		return dia+"/"+mes+"/"+a–o;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getA–o() {
		return a–o;
	}

	public void setA–o(int a–o) {
		this.a–o = a–o;
	}
	
	
}
