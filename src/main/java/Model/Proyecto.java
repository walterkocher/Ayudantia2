package Model;

import java.util.ArrayList;
import Model.Empleado;

public class Proyecto {
	private String nombre;
	private String descripcion;
	private ArrayList<Empleado> empleados;

	public Proyecto(String nombre, String descripcion, ArrayList<Empleado> empleados) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.empleados = empleados;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}