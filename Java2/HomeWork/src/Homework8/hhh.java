package Homework8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class hhh
{
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

    public static void pushSoretdPrinted(int num, Queue<Integer> queue)
    {
        int i = 0;
        // until there is a number bigger than the num poll and add it to the end
        for(i = 0; i < queue.size() && queue.peek() < num; i++)
        {
            queue.add(queue.poll());
            System.out.println("in sorting:\t" + queue);
        }

        queue.add(num); // add the number to the queue
        System.out.println("now added num:\t" + num + "\t\tQueueState:" + queue);


        // there is a new number in the queue, so we consider the previous length
        for(; i < queue.size() - 1; i++)
        {
            queue.add(queue.poll());
            System.out.println("rest of the elements:\t" + queue);
        }
        System.out.println();
    }

    public static Queue<Integer> sortedQueue(int size)
    {
        Queue<Integer> queue = new LinkedList<>();
        Random rand = new Random();
        for (int i = 0; i < size; i++)
        {
            int num = rand.nextInt(1000);   // for the exercise just to see that it works
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

    public static void main(String[] args)
    {
        System.out.println(sortedQueue(5));
    }

}
