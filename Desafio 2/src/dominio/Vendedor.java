package dominio;

public class Vendedor extends Directo{

    private static final double VENTAS_MENOR_SALARIO = 0.05;
    private static final double VENTAS_MAYOR_SALARIO = 0.045;
    private long ventasDelMes;

    public Vendedor(String nombre, long salario, long ventasDelMes) {
        super(nombre, salario);
        this.ventasDelMes = ventasDelMes;
    }

    public long calcularComision() {
        long comision;
        if (this.getSalario() < 1000000) {
            comision = (long)(this.getSalario()*VENTAS_MENOR_SALARIO);
            return comision;

        } else  {
            comision = (long)(this.getSalario()*VENTAS_MAYOR_SALARIO);
            return comision;
        }

    }

    @Override
    public long calcularSalario() {
        long salarioVendedor;
        salarioVendedor = this.getSalario() + calcularComision();
        return salarioVendedor;
    }

    @Override
    public String toString() {
        return "Vendedor";
    }
}
