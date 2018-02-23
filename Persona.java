
/**
 * Write a description of class Persona here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Persona
{
    // instance variables - replace the example below with your own
    private String nombrePersona;
    private boolean sexoPersona;
    private int pesoPersona;
    private int alturaPersona;
    private int edadPersona;
    private int caloriasIngeridas;
    private int nuevasCaloriasIngeridas;
    private int metabolismoBasal;
    /**
     * Constructor for objects of class Persona
     */
    public Persona(String nombrePersona, boolean sexoPersona, int pesoPersona, int alturaPersona, int edadPersona)
    {
        this.nombrePersona = nombrePersona;
        this.sexoPersona = sexoPersona;
        this.pesoPersona = pesoPersona;
        this.alturaPersona = alturaPersona;
        this.edadPersona = edadPersona;
        caloriasIngeridas = 0;
        nuevasCaloriasIngeridas = 0;
        if(sexoPersona = true) {
            metabolismoBasal = (10 * pesoPersona) + (6 * alturaPersona) + (5 * edadPersona) + 5;
        }
        else {
            metabolismoBasal = (10 * pesoPersona) + (6 * alturaPersona) + (5 * edadPersona) - 161;
        }
    }

    /**
     * Devuelve el nombre de la persona
     */
    public String nombrePersona() 
    {
        return nombrePersona;
    }

    /**
     * Devuelve el sexo de la persona
     */
    public boolean sexoPersona() 
    {
        sexoPersona = true;
        return sexoPersona;
    }

    /**
     * Devuelve el peso de la persona
     */
    public int pesoPersona() 
    {
        return pesoPersona;
    }

    /**
     * Devuelve el altura de la persona
     */
    public int alturaPersona() 
    {
        return alturaPersona;
    }

    /**
     * Devuelve el edad de la persona
     */
    public int edadPersona() 
    {
        return edadPersona;
    }

    /**
     * Devolver numero de calorías ingeridas
     */
    public int getCaloriasIngeridas()
    {
        return caloriasIngeridas;
    }

    /**
     * Metodo comer
     */
    public int comer(Comida comida) 
    {
        if(caloriasIngeridas < metabolismoBasal) {
            nuevasCaloriasIngeridas = comida.getCaloriasComida();
            caloriasIngeridas = caloriasIngeridas + nuevasCaloriasIngeridas;
        }
        else {
            System.out.println("No puedo comer más.");
            nuevasCaloriasIngeridas = -1;
        }
        return nuevasCaloriasIngeridas;
    }
}
