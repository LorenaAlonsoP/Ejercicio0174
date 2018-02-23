
/**
 * Write a description of class Comida here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Comida
{
    // instance variables - replace the example below with your own
    private String nombreComida;
    private int caloriasComida;

    /**
     * Constructor for objects of class Comida
     */
    public Comida(String nombreComida, int caloriasComida)
    {
        this.nombreComida = nombreComida;
        this.caloriasComida = caloriasComida;
    }

    /** 
     * Devolver nombre Comida
     */
    public String getNombreComida()
    {
        return nombreComida;
    }
    
    /**
     * Devolver calorias de la comida
     */
    public int getCaloriasComida()
    {
        return caloriasComida;
    }
}
