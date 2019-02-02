import java.util.ArrayList;

public class StackArrayList<E> implements Stack<E> {

    protected ArrayList<E> data;

    public StackArrayList()
    {
        data = new ArrayList<E>();
    }

    public void push(E item) {
        data.add(item);
    }

    public E pop() {
        return data.remove((data.size()-1));
    }

    public E peek() {
        return data.get((data.size()-1));
    }

    public int size()
    {
        return data.size();
    }

    public boolean empty()
    {
        return size() == 0;
    }

}