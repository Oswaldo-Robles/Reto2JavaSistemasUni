package uni.sistemas.model;

/**
 *
 * @author Oswaldo
 */
public class EmpleadoAsalariado extends Empleado {

    private double pagoSemanal;

    public EmpleadoAsalariado() {
    }

    public EmpleadoAsalariado(double pagoSemanal, int tipoEmpleado, String nombre, String apellido, int numeroSeguroSocial, char sexo) {
        super(tipoEmpleado, nombre, apellido, numeroSeguroSocial, sexo);
        this.pagoSemanal = pagoSemanal;
    }


    public double getPagoSemanal() {
        return pagoSemanal;
    }

    public void setPagoSemanal(double pagoSemanal) {
        this.pagoSemanal = pagoSemanal;
    }

    public double pagoTotal() {
        return this.pagoSemanal * 4;
    }

    @Override
    public String mostrarDatos() {
        return """
               ==============="""
                + super.mostrarDatos()
                + "\nPago Semanal :" + this.pagoSemanal
                + "\nSueldo Mensual :" + pagoTotal();
    }

}
