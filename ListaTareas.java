import java.util.ArrayList;
/**
 * Write a description of class ListaTareas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListaTareas
{
    // instance variables - replace the example below with your own
    private ArrayList <Tarea> listaTareas;

    /**
     * Constructor for objects of class ListaTareas
     */
    public ListaTareas()
    {
        listaTareas = new ArrayList <Tarea>();
    }

    /**
     * Añadimos una tarea con un nombre dado por el usuario 
     */
    public void annadirTarea(String nombreTarea)
    {
        Tarea nuevaTarea = new Tarea(nombreTarea);
        listaTareas.add(nuevaTarea);
        
    }
    
    /**
     *Muestra todas las tareas existentes numeradas empezando en 1 
     *pudiendo ver si estan completadas o no
     */
    public void mostrarTareas()
    {
        int contador = 0;
        while(contador < listaTareas.size()){
            
            System.out.println((contador + 1) + " - " + listaTareas.get(contador).getNombreTarea()
             + " " + listaTareas.get(contador).getTerminada());   
            contador++;

        }
    } 
    
    
    
}
