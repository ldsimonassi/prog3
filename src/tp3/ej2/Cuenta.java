package tp3.ej2;

public class Cuenta {
	String nombre;
	String propietario;
	double saldo;
	
	public Cuenta() {
		this("nombre", "propietario", 0);
	}
	
	public Cuenta(String nombre, String propietario, double saldo) {
		this.nombre = nombre;
		this.propietario = propietario;
		this.saldo = saldo;
	}
	
	
	public void depositar(double monto) {
		saldo += monto;
	}
	
	public void extraer(double monto) {
		saldo -= monto;
	}
	
	public void cerrar() {
		propietario = null;
		saldo = 0;
	}
	
	
	@Override
	public String toString() {
		return "La cuenta ["+nombre+"] perteneciente a ["+propietario+"] tiene un saldo de ["+saldo+"]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
