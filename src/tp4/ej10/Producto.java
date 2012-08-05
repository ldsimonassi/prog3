package tp4.ej10;

public class Producto {

	static int counter = 0;
	
	String nombre;
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	int id;
	
	public Producto(String nombre) {
		id = counter ++;
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Producto:"+id+":"+nombre;
	}
	
	
	public static void main(String[] args) {
		Producto[] prods = new Producto[] {new Producto("Reloj con luz"), 
				new Producto("Zapatillas rojas"),
				new Producto("Cortinas roller"),
				new Producto("S‡banas")};
		for (int i = 0; i < prods.length; i++) {
			System.out.println(prods[i]);
		}
	}
}
