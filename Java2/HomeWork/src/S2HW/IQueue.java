package S2HW;

public interface IQueue
{
    public boolean add(int num);
    public int pop();
    public int peek();
    public void clear();
    public int size();
    public boolean find(int num);
    public boolean isEmpty();
}
