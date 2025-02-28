package uni.sistemas.model;

public class EmpleadoPorHoras extends Empleado {

    private double pagoHora;
    private double cantidadHorasTrabajadas;

    public EmpleadoPorHoras() {
    }

    public EmpleadoPorHoras(double pagoHora, double cantidadHorasTrabajadas, int tipoEmpleado, String nombre, String apellido, int numeroSeguroSocial, char sexo) {
        super(tipoEmpleado, nombre, apellido, numeroSeguroSocial, sexo);
        this.pagoHora = pagoHora;
        this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
    }


    public double getPagoHora() {
        return pagoHora;
    }

    public void setPagoHora(double pagoHora) {

        this.pagoHora = pagoHora;
    }

    public double getCantidadHorasTrabajadas() {
        return cantidadHorasTrabajadas;
    }

    public void setCantidadHorasTrabajadas(int cantidadHorasTrabajadas) {
        this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
    }

    public double pagoTotal() {
        return this.cantidadHorasTrabajadas * this.pagoHora;
    }

    @Override
    public String mostrarDatos() {
        return """
               ==============="""
                + super.mostrarDatos()
                + "\nPago por hora :" + this.pagoHora
                + "\nHoras trabajadas:" + this.cantidadHorasTrabajadas
                + "\nSueldo Mensual :" + pagoTotal();
    }

}
