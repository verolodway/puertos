
/**
 * Write a description of class Barco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Barco
{
    protected String matricula;
    protected float eslora;
    protected int annoFabricacion;
    
    public Barco(String matricula, float eslora, int annoFabricacion){
        this.matricula = matricula;
        this.eslora = eslora;
        this.annoFabricacion = annoFabricacion;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public float getEslora(){
        return eslora;
    }
    
    public abstract int getCoeficienteBernua();
    
    public int getAnnoFabricacion(){
        return annoFabricacion;
    }
    
    public String toString(){
        return "Matrícula: " + matricula + "\n" + "Eslora: " + eslora + "\n" + "Año de fabricación: " + annoFabricacion;
    }
}
