
package uni.sistemas.model;

public class EmpleadoPorComision extends Empleado {
    double tasaComision;
    double ventaBruta; 

    public EmpleadoPorComision() {
    }

    public EmpleadoPorComision(double tasaComision, double ventaBruta, int tipoEmpleado, String nombre, String apellido, int numeroSeguroSocial, char sexo) {
        super(tipoEmpleado, nombre, apellido, numeroSeguroSocial, sexo);
        this.tasaComision = tasaComision;
        this.ventaBruta = ventaBruta;
    }


    public double getTasaComision() {
        return tasaComision;
    }

    public void setTasaComision(double tasaComision) {
        this.tasaComision = tasaComision;
    }

    public double getVentaBruta() {
        return ventaBruta;
    }

    public void setVentaBruta(double ventaBruta) {
        this.ventaBruta = ventaBruta;
    }
    
    public double pagoTotal() {
        return (this.ventaBruta * this.tasaComision)/100;
    }

    @Override
    public String mostrarDatos() {
        return """
               ==============="""
                + super.mostrarDatos()
                + "\nVenta Bruta:" + this.ventaBruta
                + "\nComisión acordada:" + this.tasaComision + " % "
                + "\nTotal a pagar:"+pagoTotal();
    }
    
    
    
}
