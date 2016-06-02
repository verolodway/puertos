
/**
 * Write a description of class EmbarcacionDeportiva here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmbarcacionDeportiva extends Barco
{
    protected int potencia;
    
    public EmbarcacionDeportiva(int potencia, String matricula, float eslora, int annoFabricacion){
        super(matricula, eslora, annoFabricacion);
        this.potencia = potencia;
    }
    
    public int getCoeficienteBernua(){
        return potencia;
    }
    
    public String toString(){
        return "Potencia: " + potencia + "\n" + super.toString();
    }
}
