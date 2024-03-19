package S2HW;

public interface IStack
{
    public boolean push(int num);
    public int pop();
    public int top();
    public void clear();
    public int size();
    public boolean find(int num);
    public boolean isEmpty();
}
