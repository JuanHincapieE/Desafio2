package dominio;

import java.util.ArrayList;

public class Nomina {
    private ArrayList<Empleado> empleado = new ArrayList<>();

    public ArrayList<Empleado> getEmpleados() {
        return empleado;
    }

    public void calcularNomina() {
        this.empleado.forEach(empleados -> {
            System.out.println("El/la empleado/a " + empleados.getNombre() + " tiene un salario de: " + empleados.calcularSalario());
        });


    }

    public void listarDirectos() {
        empleado.forEach(empleados -> {
            if(empleados instanceof Vendedor) {
                System.out.println(empleados.getNombre()+" es vendedor");
            } else if (empleados instanceof Directo) {
                System.out.println(empleados.getNombre() + " es directo");
            }
        });


    }

    public void listarFreeLancers() {
        empleado.forEach(empleados -> {
            if(empleados instanceof FreeLance) {
                System.out.println(empleados.getNombre() + " es FreeLancer");
            }
        });

    }

    public void listarPromotores() {
        empleado.forEach(empleados -> {
            if(empleados instanceof Promotor) {
                System.out.println(empleados.getNombre() + " es promotor");
            }
        });

    }
}
