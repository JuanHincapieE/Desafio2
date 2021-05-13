package dominio;

public class Promotor extends Empleado {

    private static final int COMPRA_VOLANTE = 17000;
    private int volantesRepartidos;
    private long valorVolante;
    private int comprasVolantes;
    public Promotor(String nombre, int volantesRepartidos, long valorVolante, int comprasVolantes) {
        super(nombre);
        this.comprasVolantes = comprasVolantes;
        this.valorVolante = valorVolante;
        this.volantesRepartidos = volantesRepartidos;
    }

    @Override
    public long calcularSalario() {
        long salarioPromotor;
        salarioPromotor = this.valorVolante*this.volantesRepartidos + (COMPRA_VOLANTE * this.comprasVolantes);
        return salarioPromotor;
    }

    @Override
    public String toString() {
        return "Promotor";
    }
}
