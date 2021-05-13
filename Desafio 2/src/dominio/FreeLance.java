package dominio;

public class FreeLance extends Empleado {

    private long valorHora;
    private int horasTrabajadas;

    public FreeLance(String nombre, long valorHora, int horasTrabajadas) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public long getValorHora() {
        return valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setValorHora(long valorHora) {
        this.valorHora = valorHora;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public long calcularSalario() {
        long salarioFreelance;
        salarioFreelance = this.horasTrabajadas*this.valorHora;
        return salarioFreelance;
    }

    @Override
    public String toString() {
        return "FreeLance";
    }
}
