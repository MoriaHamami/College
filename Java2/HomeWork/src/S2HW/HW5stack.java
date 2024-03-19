package S2HW;

import java.util.Stack;

public class HW5stack {

	//Q1+2 - Gilad did in lesson #3
	
	//Q2 - Moodel answers Gilad:
    public static boolean isPaliFloat(String str)
    {
        Stack<Character> stack = new Stack<>();
        int i = 0;

        // loop for push
        for (; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch == '.')
            {
                i++; // skip the dot
                break;
            }
            else
                stack.push(ch);
        }

        // loop for pop
        for (; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch != stack.pop())
                return false;
        }

        return stack.empty();   // if the stack empty - great!!
    }
	
	//Q3 - Moodel answers Gilad:
	public void push_arr_sorted(Stack<Integer> stack, int[] arr)
    {
        Stack<Integer> temp = new Stack<>();

        for(int num: arr)
        {
            while (!stack.empty() && stack.peek() < num)   
            // while the current num is bigger continue to pop
            {
                temp.push(stack.pop());
            }

            stack.push(num);

            while (!temp.empty())   // return all to the stack
            {
                stack.push(temp.pop());
            }
        }
    }
	
	 //Q4
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
