package S2HW;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyQueue implements IQueue
{
    private LinkedList<Integer> _queue;
    private int _size;

    public MyQueue()
    {
        _queue = new LinkedList<>();
        _size = 0;
    }

    @Override
    public boolean add(int num)
    {
        _queue.addLast(num);
        return true;
    }

    @Override
    public int pop()
    {
        if (_size == 0)
            throw new NoSuchElementException("No elements present in Stack");
        _size--;
        return _queue.poll();
    }

    @Override
    public int peek()
    {
        if (_size == 0)
            throw new IndexOutOfBoundsException();
        return _queue.get(0);
    }

    @Override
    public void clear()
    {
        _queue.clear();
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
        return _queue.contains(num);
    }

    @Override
    public boolean isEmpty()
    {
        return _size == 0;
    }
}
