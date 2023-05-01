package Model;

import java.util.ArrayList;

public class Disenhador extends Empleado {
	private ArrayList<String> herramientas;

	public Disenhador(String nombre, int salario, String cargo, ArrayList<String> herramientas) {
		super(nombre, salario, "Diseñador");
		this.herramientas=herramientas;
	}

	public ArrayList<String> getHerramientas() {
		return this.herramientas;
	}

	public void setHerramientas(ArrayList<String> herramientas) {
		this.herramientas=herramientas;
	}

	public String toString() {
		return getType()+" "+getNombre();
	}

	public String getType() {
		return (getCargo());
	}
}