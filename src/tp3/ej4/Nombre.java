package tp3.ej4;

public class Nombre {
	String primerNombre, segundoNombre, apellido;
	
	public Nombre() {
		this("Luis", "Dario", "Simonassi");
	}
	
	public Nombre(String primerNombre, String segundoNombre, String apellido) {
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return primerNombre + " " + segundoNombre + ", " + apellido;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}
