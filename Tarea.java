
/**
 * Write a description of class Tarea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tarea
{
    // instance variables - replace the example below with your own
    private String nombreTarea;
    private boolean terminada;
    /**
     * Constructor for objects of class Tarea
     */
    public Tarea(String nombreTarea)
    {
        this.nombreTarea = nombreTarea;
        terminada = false;
    }
    
    public boolean getTerminada()
    {
        return terminada;
    }
    
    public String getNombreTarea()
    {
        return nombreTarea;
    }
    
    public void setTareaFinalizada()
    {
        terminada = true;
    }
    
}
