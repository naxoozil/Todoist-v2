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
    
    public int getNumeroTareas()
    {
        return listaTareas.size();
    }
    
    /**
     * Marcamos una tarea como completada si no esta hecha(false)
     */
    public void marcarComoCompletada(int posicion)
    {
        if(posicion > 0 && posicion <= listaTareas.size()) 
        {
            if(listaTareas.get(posicion - 1).getTerminada() == false){
                listaTareas.get(posicion - 1).setTareaFinalizada();
            }
        }
    }
    
    public void mostrarTareasCoincidentes(String comprobadorDeTexto)
    {
        int contador = 0;
        int numeroDeTareasEnTexto = 0; //Creo una variable para llevar la cuenta de las tareas que coinciden

        while(contador < getNumeroTareas()){
            if(listaTareas.get(contador).getNombreTarea().contains(comprobadorDeTexto)){
                System.out.println(contador + "- " + listaTareas.get(contador).getNombreTarea());   
                numeroDeTareasEnTexto = numeroDeTareasEnTexto + 1;   //Aumento el contador si encuentra una tarea igual
            }
            contador++;
        }

        if(numeroDeTareasEnTexto == 0){
            System.out.println("Error, no hay tarea con esa busqueda");    //Sino hay ninguna tarea con ese nombre, no muestra nada    
        }
        else
        {
            System.out.println( numeroDeTareasEnTexto +" tareas encontradas con el texto " + comprobadorDeTexto);
        }
    }
    
    
}
