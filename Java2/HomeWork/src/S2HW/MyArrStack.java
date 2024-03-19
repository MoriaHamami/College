package S2HW;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class MyArrStack implements IStack
{
    private int[] _stack;
    private int _size;
    private int _capacity;

    public MyArrStack(int capacity)
    {
        _capacity = capacity;
        _stack = new int[_capacity];
        _size = 0;
    }

    @Override
    public boolean push(int num)
    {
        if (_size == _capacity)
            throw new IndexOutOfBoundsException("the stack is full");

        _stack[_size++] = num;
        return true;
    }

    @Override
    public int pop()
    {
        if (_size == 0)
            throw new NoSuchElementException("No elements present in Stack");
        return _stack[--_size];
    }

    @Override
    public int top()
    {
        int num = pop();
        push(num);
        return num;
    }

    @Override
    public void clear()
    {
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
        for (int i = 0; i < _size; i++)
        {
            if (_stack[i] == num)
                return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty()
    {
        return false;
    }
}
