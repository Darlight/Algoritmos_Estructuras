/*
Autores:    Mario Perdomo 18029
            Josue Sagastume 18173

Fecha: 01 de febrero de 2019
Proposito: Esta clase es el Stack o pila, y esta implementa
a la interfaz Stack. Esta clase contiene los metodos que se
utilizaran para interactuar con la pila
 */
//Se importa la libreria necesaria
import java.util.ArrayList;

//Esta clase es generica, pues aun no sabemos de que tipo van a ser
//lo valores que maneje
public class StackArrayList<E> implements Stack<E> {

    //Unico atributo de la clase, un arraylist generico
    protected ArrayList<E> data;


    //Constructor
    public StackArrayList()
    {
        data = new ArrayList<E>();
    }

    //Este metodo se encarga de agregar en el ultimo lugar
    //al elemento pasado como parametro
    public void push(E item) {
        data.add(item);
    }

    //Este metodo se encarga de quitar el ultimo elemento
    //que se encuentra en el Stack, pues First-in Last-out
    public E pop() {
        return data.remove((data.size()-1));
    }

    //Este metodo se encarga de darnos el valor del ultimo
    //elemento en el Stack
    public E peek() {
        return data.get((data.size()-1));
    }

    //Este metodo no otorga el tamano del Stack
    public int size()
    {
        return data.size();
    }

    //Este metodo nos dice si el Stack esta vacio o no
    public boolean empty()
    {
        return size() == 0;
    }

}
