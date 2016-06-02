public class Alquiler
{
    private int numeroDias;
    private Cliente cliente;
    private Barco barco;
    private static final int VALOR_FIJO_ALQUILER = 300;
    private static final int MULTIPLICADOR_ESLORA = 10;

     /**
     * Constructor for objects of class Alquiler
     */
    public Alquiler(int dias, Cliente cliente, Barco barco)
    {
        numeroDias = dias;
        this.cliente = cliente;
        this.barco = barco;
    }
    
    /**
     * Return all the data
     */
    @Override
    public String toString()
    {
        String data = "- Cliente: \n";
        data += cliente;
        data += "- Barco: \n";
        data += barco;
        data += "Número de dias: " + numeroDias + "\n";
        data += "Coste del alquiler: " + getCosteAlquiler() + "\n";
        return data;
    }

    /**
     * Return the cost
     */
    public float getCosteAlquiler()
    {
			return numeroDias*(barco.getEslora()*MULTIPLICADOR_ESLORA) +
        (VALOR_FIJO_ALQUILER*barco.getCoeficienteBernua());	
    }
}



