
package uni.sistemas.model;

/**
 *
 * @author Oswaldo
 */
public class EmpleadoAsalariado extends Empleado{
    private double pagoSemanal; 
    private double pagoTotal;

    public EmpleadoAsalariado() {
    }

    public EmpleadoAsalariado(double pagoSemanal, String nombre, String apellido, int numeroSeguroSocial, char sexo) {
        super(nombre, apellido, numeroSeguroSocial, sexo);
        this.pagoSemanal = pagoSemanal;
        this.pagoTotal = 4*this.pagoSemanal;
    }

    public double getPagoSemanal() {
        return pagoSemanal;
    }

    public void setPagoSemanal(double pagoSemanal) {
        this.pagoSemanal = pagoSemanal;
    }

    public double getPagoTotal() {
        return pagoTotal;
    }

    public void setPagoTotal(double pagoTotal) {
        this.pagoTotal = pagoTotal;
    }
   
    @Override
    public String mostrarDatos() {
        return """
               ==============="""
                + super.mostrarDatos()
                + "\nPago Semanal :" + this.pagoSemanal
                + "\nSueldo Mensual :" + this.pagoSemanal;
    }
    
}
