import java.util.ArrayList;

public class ArrayListStack<E> implements StackInterface
{

    ArrayList<E> stack = new ArrayList<E>();

    public String toString()
    {
        String str = "";
        for(E e : stack)
        {
            str += e.toString();
        }
        return str;
    }

    public ArrayListStack<E> split(int i)
    {
        ArrayListStack<E> a = new ArrayListStack<E>();
        if(i != 0 && i != stack.size())
        {
            for(int j = 0; j < i; j++)
            {
                a.push((E) this.pop());
            }
        }

        return a;
    }

    @Override
    public boolean empty()
    {
        return stack.size() == 0;

    }

    @Override
    public Object peek()
    {
        if(!empty())
        {
            return stack.get(0);
        }
        else
        {
            return null;
        }
    }

    @Override
    public Object pop()
    {
        return stack.remove(0);
    }

    @Override
    public Object push(Object obj) {
        E e = (E) obj;
        stack.add(0, e);
        return e;
    }


}
