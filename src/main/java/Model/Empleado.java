package Model;

public abstract class Empleado {
	private String nombre;
	private int salario;
	private String cargo;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSalario() {
		return this.salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return this.cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Empleado(String nombre, int salario, String cargo) {
		this.nombre=nombre;
		this.salario=salario;
		this.cargo=cargo;
	}

	public abstract String getType();

	public String toString() {
		return getType()+" "+getNombre();
	}
}