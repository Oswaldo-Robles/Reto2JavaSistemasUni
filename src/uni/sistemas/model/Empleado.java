
package uni.sistemas.model;

/**
 *
 * @author Oswaldo Robles
 */
public class Empleado {
    private String nombre;
    private String apellido; 
    private int numeroSeguroSocial;
    private char sexo;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, int numeroSeguroSocial, char sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.sexo = sexo;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
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
    
   
    
}
