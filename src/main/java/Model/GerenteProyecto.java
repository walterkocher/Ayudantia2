package Model;

import java.util.ArrayList;
import Model.Proyecto;

public class GerenteProyecto extends Empleado {
	private ArrayList<Proyecto> proyectos = new ArrayList<Proyecto>();

	public GerenteProyecto(String nombre, int salario, String cargo, ArrayList<Proyecto> proyectos) {
		super(nombre, salario, "Gerente");
		this.proyectos=proyectos;
	}

	public ArrayList<Proyecto> getProyectos() {
		return this.proyectos;
	}

	public void setProyecto(ArrayList<Proyecto> proyectos) {
		this.proyectos=proyectos;
	}

	public String toString() {
		return getType()+" "+getNombre();
	}

	public String getType() {
		return (getCargo());
	}
}