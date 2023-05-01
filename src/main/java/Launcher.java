import Model.*;

import java.util.ArrayList;

public class Launcher {
    public static void main(String[] args) {
        init();
    }
    public static void init(){
        Empresa empresa=new Empresa();
        ArrayList<String> lenguajes=new ArrayList<>();
        lenguajes.add("Java");
        lenguajes.add("Python");
        Desarrollador desarrollador=new Desarrollador("Juan",10000,"Dsarrollador",lenguajes);
        empresa.addEmpleados(desarrollador);
        Proyecto proyecto=new Proyecto("Super proyecto","asdads",empresa.getEmpleados());
        empresa.addProyecto(proyecto);
        GerenteProyecto gerenteProyecto=new GerenteProyecto("pedrito",6000,"GerenteProyecto",empresa.getProyectos());
        empresa.addEmpleados(gerenteProyecto);
        int gastoSueldos= empresa.calculoGastoSalario();
        System.out.println("Suma sueldos: "+gastoSueldos);
    }
}
