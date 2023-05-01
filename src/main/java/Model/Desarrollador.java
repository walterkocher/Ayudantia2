package Model;

import java.util.ArrayList;

public class Desarrollador extends Empleado {
	private ArrayList<String> lenguajes;

	public Desarrollador(String nombre, int salario, String cargo, ArrayList<String> lenguajes) {
		super(nombre,salario,"Desarrollador");
		this.lenguajes=lenguajes;
	}

	public ArrayList<String> getLenguajes() {
		return this.lenguajes;
	}

	public void setLenguaje(ArrayList<String> lenguajes) {
		this.lenguajes=lenguajes;
	}

	public String toString() {
		return getType()+" "+getNombre();
	}

	public String getType() {
		return (getCargo());
	}
}