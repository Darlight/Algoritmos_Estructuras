/*
Autores:    Mario Perdomo 18029
            Josue Sagastume 18173

Fecha: 01 de febrero de 2019
Proposito: Esta clase es la interfaz de Stack, y es generica
porque no se sabe con que tipo de dato se trabajara. La clase
StackArrayList hereda sus metodos de esta interfaz.
 */
public interface Stack<E> {

    public void push(E item);

    public E pop();

    public E peek();

    public boolean empty();

    public int size();

}
