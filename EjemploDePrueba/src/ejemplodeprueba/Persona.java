/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodeprueba;

/**
 *
 * @author User
 */
public class Persona {
    private int cara;
    private int edad;
    private String nombre;
    private String apellido;
    private Casa casa;
    
    
    public Persona (int edad, String nombre,String apellido, Casa casa ){
        
        this.apellido=apellido;
        this.casa= casa ;
        this.edad=edad;
        this.nombre = nombre; 
        
        
    }

    public Persona(int cara, int edad, String nombre, String apellido, Casa casa) {
        this.cara = cara;
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.casa = casa;
    }
    
    
    
}
