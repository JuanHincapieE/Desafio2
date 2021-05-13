package dominio;

public class Directo extends Empleado {

    private static final double SALUD = 0.07;
    private static final double PENSION = 0.065;
    private long salario;


    public Directo(String nombre, long salario) {
        super(nombre);
        this.salario = salario;
    }

    public long getSalario() {
        return salario;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }

    public long calcularSalud() {
        long salud;
        salud = (long)(this.salario*SALUD);
        return salud;

    }

    public long calcularPension() {
        long pension;
        pension = (long)(this.salario*PENSION);
        return pension;

    }


    @Override
    public long calcularSalario() {
        long salarioFinal, salud, pension;
        salud = calcularSalud();
        pension = calcularPension();
        salarioFinal = this.salario - salud - pension;
        return salarioFinal;
    }


    @Override
    public String toString() {
        return "Directo";
    }
}
