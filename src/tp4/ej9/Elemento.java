package tp4.ej9;

public class Elemento {
	
	static int numElem = 0;
	String nombre;
	
	public static int numeroDeElementos() {
		return numElem;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Elemento(String nombre) {
		this.nombre = nombre;
		numElem ++;
	}
	
	
	public static void main(String[] args) {
		new Elemento("Radio");
		new Elemento("Camioneta");
		new Elemento("Mueble");
		System.out.println(Elemento.numeroDeElementos());
	}
}
