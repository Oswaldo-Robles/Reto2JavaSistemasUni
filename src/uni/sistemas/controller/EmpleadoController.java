
package uni.sistemas.controller;

import uni.sistemas.model.Empleado;
import uni.sistemas.model.EmpleadoAsalariado;
import uni.sistemas.model.EmpleadoPorComision;
import uni.sistemas.model.EmpleadoPorHoras;
import uni.sistemas.util.Constante;

public class EmpleadoController {
    
    public static Empleado crearEmpleado(int tipo, String nombre, String apellido, int nSeguroSocial, char sexo, double n1, double n2 ){
        Empleado oper = null;
        
        switch(tipo){
            case Constante.EMPLEADOASALARIADO:
                oper = new EmpleadoAsalariado(n1, tipo, nombre, apellido, nSeguroSocial, sexo);
                break;
            case Constante.EMPLEADOHORAS:
                oper = new EmpleadoPorHoras(n1, (int) n2, tipo, nombre, apellido, nSeguroSocial, sexo);
                break;
            case Constante.EMPLEADOCOMISION:
                oper = new EmpleadoPorComision(n1, n2,tipo, nombre, apellido, nSeguroSocial, sexo);
                break;
        }
        return oper;
    }
    
}
