package Model;

import java.util.ArrayList;
import Model.Empleado;
import Model.Proyecto;

public class Empresa {
	private ArrayList<Empleado> empleados;
	private ArrayList<Proyecto> proyectos;
	public Empresa() {
		this.empleados = new ArrayList<>();
		this.proyectos = new ArrayList<>();

	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public ArrayList<Proyecto> getProyectos() {
		return proyectos;
	}

	public boolean addEmpleados(Empleado empleado) {
		for (Empleado empleado1:this.empleados){
			if(empleado1.getNombre().equals(empleado.getNombre())){
				return false;
			}
		}
		empleados.add(empleado);
		return true;
	}

	public boolean addProyecto(Proyecto proyecto) {
		for(Proyecto proyecto1:this.proyectos){
			if(proyecto1.getNombre().equals(proyecto.getNombre())){
				return false;
			}
		}
		proyectos.add(proyecto);
		return true;
	}

	public boolean asignarEmpleado(Empleado empleado, Proyecto proyecto) {
		for(Empleado empleado1:proyecto.getEmpleados()){
			if(empleado1.equals(empleado)){
				return false;
			}
		}
		proyecto.getEmpleados().add(empleado);
		return true;
	}

	public int calculoGastoSalario() {
		int gastoSalario=0;
		for(Empleado empleado:this.empleados){
			gastoSalario=gastoSalario+empleado.getSalario();
		}
		return gastoSalario;
	}
}