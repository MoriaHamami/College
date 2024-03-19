package S2HW;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
import java.util.Random;

public class HW6queue {

	//Q1 - Gilad solved (taken from class "ClassQueue"):
    public String toString(){
        String ans = "[";
        for (int i=0; i<size-1; i++){
            ans = ans + data[(i+front)%maxSize] + ", ";
        }
        ans = ans + data[(size-1+front)%maxSize] + "]";
        return ans;
    }
    
    //Q2 - 
    
    //Q4 - 
    public static boolean palindrom(String str)
    {
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            queue.add(ch);
            stack.push(ch);
        }

        while (!queue.isEmpty() && !stack.empty())
        {
            if (queue.poll() != stack.pop())
                return false;
        }
        return true;
    }

    //Q5 - 
        private static boolean TO_PRINT = true;
        public static void pushSoretd(int num, Queue<Integer> queue)
        {
            int i = 0;
            // until there is a number bigger than the num poll and add it to the end
            for(i = 0; i < queue.size() && queue.peek() < num; i++)
            {
                queue.add(queue.poll());
            }

            queue.add(num); // add the number to the queue

            // there is a new number in the queue, so we consider the previous length
            for(; i < queue.size() - 1; i++)
            {
                queue.add(queue.poll());
            }
        }


    public static Queue<Integer> sortedQueue(int size)
    {
        Queue<Integer> queue = new LinkedList<>();
        Random rand = new Random();
        for (int i = 0; i < size; i++)
        {
            int num = rand.nextInt(1000);   
            // for the exercise just to see that it works
            if (TO_PRINT)
            {
                System.out.println("****************************************\n");
                System.out.println("current number:\t" + num);
                System.out.println("current queue:\t" + queue);
                System.out.println();
            }
            pushSoretdPrinted(num, queue);

        }
        return queue;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
