package uni.sistemas.model;

/**
 *
 * @author Oswaldo Robles
 */
public class Empleado {

    private int tipoEmpleado;
    private String nombre;
    private String apellido;
    private int numeroSeguroSocial;
    private char sexo;

    public Empleado() {
    }

    public Empleado(int tipoEmpleado, String nombre, String apellido, int numeroSeguroSocial, char sexo) {
        this.tipoEmpleado = tipoEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.sexo = sexo;
    }

    public int getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(int tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public void setNumeroSeguroSocial(int numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String mostrarDatos() {
        return "Datos del trabajados: "
                + "\nTipo: " + this.tipoEmpleado
                + "\nNombre: " + this.nombre
                + "\nApellido: " + this.apellido
                + "\nNúmero de seguro social: " + this.numeroSeguroSocial
                + "\nSexo: " + this.sexo;
    }

}
