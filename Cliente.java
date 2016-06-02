
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
    private String nombre;
    private String dni;
    
    public Cliente(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public String getDni(){
        return dni;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String toString(){
        return "Nombre: " + nombre + "\n" + "DNI: " + dni;
    }
}
