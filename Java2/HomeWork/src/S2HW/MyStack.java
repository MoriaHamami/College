package S2HW;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * implement through linked list
 * very very simple
 */
public class MyStack implements IStack{

    private LinkedList<Integer> _stack;
    private int _size;

    public MyStack()
    {
        _stack = new LinkedList<>();
        _size = 0;
    }

    @Override
    public boolean push(int num)
    {
        _stack.add(0, num);
        _size++;
        return true;
    }

    @Override
    public int pop()
    {
        if (_size == 0)
            throw new NoSuchElementException("No elements present in Stack");
        _size--;
        return _stack.poll();
    }

    @Override
    public int top()
    {
        return _stack.get(0);
    }

    @Override
    public void clear()
    {
        _stack.clear();
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
        return _stack.contains(num);
    }

    @Override
    public boolean isEmpty()
    {
        return _size == 0;
    }
}
