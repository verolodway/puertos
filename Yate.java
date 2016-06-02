
/**
 * Write a description of class Yate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Yate extends EmbarcacionDeportiva
{
    private int camarotes;
    
    public Yate(int camarotes, int potencia, String matricula, float eslora, int annoFabricacion){
        super(potencia, matricula, eslora, annoFabricacion);
        this.camarotes = camarotes;
    }
    
    public int getCoeficienteBernua(){
        return super.getCoeficienteBernua() + camarotes;
    }
    
    public String toString(){
        return "Número de camarotes: " + camarotes + "\n" + "Potencia: " + potencia + "\n" + super.toString();
    }
}
