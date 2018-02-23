import java.util.*;
/**
 * Write a description of class Comida here.
 * 
 * @author (Michael Díaz) 
 * @version (a version number or a date)
 */
public class Comida
{
    // instance variables - replace the example below with your own
    private String nombreComida;
    private int caloriasComida;

    /**
     * Constructor de la clase comida en el se introducen el nombre de
     * la comida y las calorias que tiene sin decimales.
     */
    public Comida(String nombreComida, int caloriasComida)
    {
        // initialise instance variables
        this.nombreComida = nombreComida;
        this.caloriasComida = caloriasComida;
    }
    
    /**
     * Devuelve el nombre de la comida introducida.
     */
    public String getNombreComida(){
        return nombreComida;
    }
    
    /**
     * Devuelve las calorias de la comida introducida.
     */
    public int getCaloriasComida(){
        return caloriasComida;
    }
    
    /**
     * Permite cambiar el nombre de la comida que tenemos por otra.
     */
    public void setNombreComida(String nombreComidaNuevo)
    {
        nombreComida = nombreComidaNuevo;
    }
    
    /**
     * Permite cambiar las calorias de la comida que tenemos 
     * por otra cantidad.
     */
    public void setCaloriasComida(int nuevasCalorias)
    {
        caloriasComida = nuevasCalorias;
    }

}
