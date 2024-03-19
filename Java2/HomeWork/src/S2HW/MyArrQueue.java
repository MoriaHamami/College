package S2HW;

import java.util.NoSuchElementException;

/**
 * this is a little bit harder to manage
 */
public class MyArrQueue implements IQueue
{
    private int[] _queue;
    private int _start;
    private int _end;
    private int _size;
    private int _capacity;

    public MyArrQueue(int capacity)
    {
        _start = 0;
        _end = -1;
        _size = 0;
        _capacity = capacity;
        _queue = new int[_capacity];
    }

    @Override
    public boolean add(int num)
    {
        if (_size == _capacity)
            throw new IndexOutOfBoundsException("the Queue is full");

        _end = (_end + 1) % _capacity;
        _queue[_end] = num;
        _size++;
        return true;
    }

    @Override
    public int pop()
    {
        if (isEmpty())
            throw new NoSuchElementException("No elements present in Queue");
        int ret_num = _queue[_start];
        _start = (_start + 1) % _capacity;
        _size--;
        return ret_num;
    }

    @Override
    public int peek()
    {
        if (isEmpty())
            throw new NoSuchElementException("No elements present in Queue");
        return _queue[_start];
    }

    @Override
    public void clear()
    {
        _start = 0;
        _end = -1;
        _size = 0;
    }

    @Override
    public int size()
    {
        return _size;
    }

    @Override
    public boolean find(int num)
    {
        for (int i = 0; i <= size(); i++)
        {
            int index = (i + _start) % _capacity;
            if(_queue[index] == num)
                return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty()
    {
        return _size == 0;
    }

    @Override
    public String toString()
    {
        String ret_str = "[";
        for (int i = 0; i < size(); i++)
        {
            int index = (i + _start) % _capacity;
            ret_str += _queue[index];
            if (i < size() - 1)
                ret_str += ", ";
        }
        ret_str += "]";
        //return "MyArrQueue{}";
        return ret_str;
    }

    public static void main(String[] args)
    {
        MyArrQueue queue = new MyArrQueue(5);
        queue.add(5);
        queue.add(3);
        queue.add(2);
        System.out.println(queue);
        System.out.println(queue.pop());
        System.out.println(queue);
        queue.add(5);
        System.out.println(queue);
    }
}
