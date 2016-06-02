import java.util.ArrayList;
/**
 * Write a description of class Puerto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puerto
{
    private int[] index;
    private ArrayList<Alquiler> alquileres;
    /**
     * Constructor for objects of class Puerto
     */
    public Puerto()
    {
        alquileres = new ArrayList<>();
        index = new int[];
    }

    /**
     * Add a rent 
     */
    public int addAlquiler(int numeroDias, Cliente cliente, Barco barco)
    {   
        int posicionEnLaQueQuedaElBarco = -1;
        int contador = 0;
        while(contador<alquileres.size() && posicionEnLaQueQuedaElBarco==-1) {
            //si se cumple la condición es porque no se ha eliminado ningún alquiler
            if(index == -1){
                //comprobamos que el array está vacio si es true o lleno si es false
                if(alquileres.isEmpty()){
                    alquileres.add(contador, new Alquiler(numeroDias, cliente, barco));
                    posicionEnLaQueQuedaElBarco = contador;
                    //esta condición añade el alquiler en la primera posicion ya que el array estaba vacío, pero en las siguientes veces
                    //que se invoque el método ya no estará vacío por lo tanto ya no entrará en esta condición
                    contador++;
                }
                //si tiene alguna posicion ocupada
                else{
                    alquileres.add(contador, new Alquiler(numeroDias, cliente, barco));
                    posicionEnLaQueQuedaElBarco = contador;
                    contador++;
                }
            }
            //si se cumple esta otra condicion es porque hemos borrado algún amarre y el siguiente que se añada deberá ir en esta posición
            else{
                alquileres.add(index, new Alquiler(numeroDias, cliente, barco));
                posicionEnLaQueQuedaElBarco = index;
            }
            contador++;
        }
        return posicionEnLaQueQuedaElBarco;
    }

    /**
     * Show state of port
     */
    public void verEstadoAmarres()
    {
        for(int i = 0;i <alquileres.size();i++) {
            System.out.println("Amarre nº" + i);
            if(alquileres.get(i) == null) {
                System.out.println("Libre");
            }
            else{
                System.out.println("ocupado");
                System.out.println(alquileres.get(i));
            }      
        }
    }

    /**
     * Liberate moorage. Returns -1 if posicion is not valid
     */
    public float liquidarAlquiler(int posicion)
    {
        float valor = -1;
        index.add(posicion);
        if(posicion < alquileres.size() && posicion >= 0){
            if(alquileres.get(posicion) != null){
                valor = alquileres.get(posicion).getCosteAlquiler();
                alquileres.remove(posicion);
            }
        }
        return valor;
    }

}

