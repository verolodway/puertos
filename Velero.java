
/**
 * Write a description of class Velero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Velero extends Barco
{
    private int numeroMastiles;
    
    public Velero(int numeroMastiles, String matricula, float eslora, int annoFabricacion){
        super(matricula, eslora, annoFabricacion);
        this.numeroMastiles = numeroMastiles;
    }
    
    public int getCoeficienteBernua(){
        return numeroMastiles;
    }
    
    public String toString(){
        return "Número de mástiles: " + numeroMastiles + "\n" + super.toString();
    }
}
