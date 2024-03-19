package lesson4;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;


/**
 * ____IMPORTANT NOTES____
 * In assignments, you have to stick to the instructions you were given, read everything
 * and make sure you understand. Before you submit you must verify that you followed the instructions.
 *
 * 1) If the name wasn't Ex2.java (case-sensitive) -> -5 points
 * 2) If it required additional imports than the ones that were written -> -5 points
 * 3) In each part if the program was killed (not intentionally) -> -x points as the amount
 *    of points in this part
 * 4) Endless loop/ stack overflow -> -x points as the amount of points in this part
 * 5) Wrong signature of function -> -x points as the amount of points in this part
 * 6) throw Error instead of Exception - Error is something we can't catch, so it will kill the program.
 *    see more: https://techdifferences.com/difference-between-error-and-exception.html -> -3-5 points
 * 7) When dealing with wrong inputs, you shouldn't print to the console the error you should throw exception.
 * 8) couldn't compile the program -> 0
 */
public class Main {
    static int SCORE = 100;
    static String DOC = "";

    // 1A
    static void check_spreadCardsOnTable(){
        DOC += "Q1A\n";
        char[] cards = {'a', 'b', 'c', 'd','e','f'};
        String order = "[a, c, e, b, f, d]";
        ArrayList<Character> ans = Ex2.spreadCardsOnTable(cards);
        SCORE -= ans.toString().equals(order) ? 0 : 3;
        DOC += "Answer: " + order + ", Your: " + ans.toString() + "\n";


        char[] cards2 = {'a', 'a', 'a', 'a','a','a', 'a', 'a', 'a', 'a','a','a', 'a', 'a', 'a', 'a','a','a'};
        order = "[a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a]";
        ans = Ex2.spreadCardsOnTable(cards2);
        SCORE -= ans.toString().equals(order) ? 0 : 3;
        DOC += "Answer: " + order + ", Your: " + ans.toString() + "\n";


        char[] cards3 = {'1', '2', '3', '4','5','6', '7', '8', '9', '0','1','2', '3', '4', '5', '6','7','8', '9', '0'};
        order = "[1, 3, 5, 7, 9, 1, 3, 5, 7, 9, 2, 6, 0, 4, 8, 4, 2, 0, 8, 6]";
        ans = Ex2.spreadCardsOnTable(cards3);
        SCORE -= ans.toString().equals(order) ? 0 : 3;
        DOC += "Answer: " + order + ", Your: " + ans.toString() + "\n";


        char[] cards4 = {'1'};
        order = "[1]";
        ans = Ex2.spreadCardsOnTable(cards4);
        SCORE -= ans.toString().equals(order) ? 0 : 3;
        DOC += "Answer: " + order + ", Your: " + ans.toString() + "\n";


        char[] cards5 = new char[20];
        order = "";
        ans = Ex2.spreadCardsOnTable(cards5);
        SCORE -= ans.toString().equals(order) ? 0 : 3;
        DOC += "Answer: " + order + ", Your: " + ans.toString() + "\n";


        DOC += "\n________________________________________________________________________";
        DOC += "Current score: ---" + SCORE + "---\n";
        DOC += "________________________________________________________________________\n";

    }



    // 1B
    static void check_createOriginalLayout(){
        DOC += "\nQ1B\n";
        char[] cards = Ex2.createOriginalLayout(6);
        String order = "[W, B, B, B, W, W]";
        SCORE -= Arrays.toString(cards).equals(order) ? 0 : 3;
        DOC += "Answer: " + order + ", Your: " + Arrays.toString(cards) + "\n";


        char[] cards2 = Ex2.createOriginalLayout(10);
        order = "[W, B, B, W, W, W, B, B, W, B]";
        SCORE -= Arrays.toString(cards2).equals(order) ? 0 : 3;
        DOC += "Answers: " + order;
        order = "[W, B, B, B, W, W, B, W, W, B]";
        SCORE += Arrays.toString(cards2).equals(order) ? 3 : 0;
        DOC += " or " + order + ", Your: " + Arrays.toString(cards2) + "\n";


        char[] cards3 = Ex2.createOriginalLayout(30);
        order = "[W, B, B, B, W, W, B, B, W, B, B, W, W, W, B, B, W, B, B, B, W, W, B, W, W, B, B, W, W, W]";
        SCORE -= Arrays.toString(cards3).equals(order) ? 0 : 3;
        DOC += "Answers: " + order;
        order = "[W, B, B, W, W, W, B, B, W, B, B, W, W, W, B, W, W, B, B, B, W, W, B, B, W, B, B, B, W, W]";
        SCORE += Arrays.toString(cards3).equals(order) ? 3 : 0;
        DOC += " or " + order + ", Your: " + Arrays.toString(cards3) + "\n";


        // This is valid -> only number less than 0 is wrong
        char[] cards4 = Ex2.createOriginalLayout(0);
        order = "[]";
        SCORE -= Arrays.toString(cards4).equals(order) ? 0 : 3;
        DOC += "Answer: " + order + ", Your: " + Arrays.toString(cards4) + "\n";


        try {
            char[] cards5 = Ex2.createOriginalLayout(-1);
        }
        catch (Exception | Error e){
            String exception = e.toString();
            SCORE -= exception.contains("NegativeArraySizeException") ? 3 : 0;
//            System.out.println(exception);
        }


        DOC += "\n________________________________________________________________________";
        DOC += "Current score: ---" + SCORE + "---\n";
        DOC += "________________________________________________________________________\n";
    }


    // 2A
    static void check_maxStack(){
        DOC += "\nQ2A\n";
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < 101; i++)
            st.push(i);
        int max = Ex2.maxStack(st);
        SCORE -= max == 100 ? 0 : 2;
        DOC += "Answer: 100, Your: " + max + "\n";


        st.clear();
        for(int i = 0; i < 1000001; i++)
            st.push(i);
        max = Ex2.maxStack(st);
        SCORE -= max == 1000000 ? 0 : 2;
        DOC += "Answer: 1000000, Your: " + max + "\n";


        st.clear();
        for(int i = 0; i < 1000001; i++)
            st.push(-i);
        max = Ex2.maxStack(st);
        SCORE -= max == 0 ? 0 : 2;
        DOC += "Answer: 0, Your: " + max + "\n";


        DOC += "\n________________________________________________________________________";
        DOC += "Current score: ---" + SCORE + "---\n";
        DOC += "________________________________________________________________________\n";
    }

    // 2B
    static void check_maxSumAdj(){
        DOC += "\nQ2B\n";
        try {
            int[]arr= {8,9,31,1,33,4,3,8,7,32}; //ans = 40
            ArrayBlockingQueue<Integer> q = new ArrayBlockingQueue<>(arr.length);
            for (int j : arr) {
                q.add(j);
            }
            String before = q.toString();
            int max = Ex2.maxSumAdj(q);
            SCORE -= max == 40 ? 0 : 3;
            String after = q.toString();
            SCORE -= before.equals(after) ? 0 : 1;
            DOC += "Answer: 40, Your: " + max + "\n";


            int[]arr1= {98,60,31,1,33,4,3,8,7,32}; //ans = 158
            q = new ArrayBlockingQueue<>(arr1.length);
            for (int j : arr1) {
                q.add(j);
            }
            before = q.toString();
            max = Ex2.maxSumAdj(q);
            SCORE -= max == 158 ? 0 : 3;
            after = q.toString();
            SCORE -= before.equals(after) ? 0 : 1;
            DOC += "Answer: 158, Your: " + max + "\n";


            int[]arr2= {8,9,31,1,33,4,3,8,37,32}; //ans = 69
            q = new ArrayBlockingQueue<>(arr2.length);
            for (int j : arr2) {
                q.add(j);
            }
            before = q.toString();
            max = Ex2.maxSumAdj(q);
            SCORE -= max == 69 ? 0 : 3;
            after = q.toString();
            SCORE -= before.equals(after) ? 0 : 1;
            DOC += "Answer: 69, Your: " + max + "\n";


            int[]arr3= {8,9}; //ans = 17
            q = new ArrayBlockingQueue<>(arr3.length);
            for (int j : arr3) {
                q.add(j);
            }
            before = q.toString();
            max = Ex2.maxSumAdj(q);
            SCORE -= max == 17 ? 0 : 3;
            after = q.toString();
            SCORE -= before.equals(after) ? 0 : 1;
            DOC += "Answer: 17, Your: " + max + "\n";


            // ans = -7
            q = new ArrayBlockingQueue<>(arr.length);
            q.add(-9);
            q.add(-31);
            q.add(-1);
            q.add(-33);
            q.add(-4);
            q.add(-3);
            q.add(-8);
            q.add(-7);
            q.add(0);
            before = q.toString();
            max = Ex2.maxSumAdj(q);
            SCORE -= max == -7 ? 0 : 3;
            after = q.toString();
            SCORE -= before.equals(after) ? 0 : 1;
            DOC += "Answer: -7, Your: " + max + "\n";
        }
        catch (Exception e){
        }


        DOC += "\n________________________________________________________________________";
        DOC += "Current score: ---" + SCORE + "---\n";
        DOC += "________________________________________________________________________\n";
    }


    // 3
    /**
     * This should be the format of the answer -> [(4.0, 1.0), (3.0, 2.0), (2.0, 3.0), (0.0, 4.0)]
     * In this question you had an option to add methods to the class Point you saw, not modify - add.
     * Which is why any other toString format wasn't valid.
     */
    static void check_maximaOfPoints(){
        DOC += "\nQ3\n";
        Point[] ans;
        String maxPoints = "";
        String str = "";
        try {
            Point[] p1 = new Point[8];
            p1[0] = new Point(1, 2);
            p1[1] = new Point(2, 3);
            p1[2] = new Point(0, 0);
            p1[3] = new Point(4, 1);
            p1[4] = new Point(0, 4);
            p1[5] = new Point(0, 1);
            p1[6] = new Point(3, 1);
            p1[7] = new Point(3, 2);
            ans = Ex2.maximaOfPoints(p1);
            maxPoints = "[(4.0,1.0),(3.0,2.0),(2.0,3.0),(0.0,4.0)]";
            sortX(ans);
            sortY(ans);
            str = Arrays.toString(ans).replace(" ", "");
            SCORE -= str.equals(maxPoints) ? 0 : 5;
            DOC += "Answer: " + maxPoints + ", Your: " + str + "\n";
        } catch (Exception e){}


        try{
        Point[] p2 = new Point[31];
        for (int i = 0; i < 31; i++){
            p2[i] = new Point(30 - i, i);
        }
        ans = Ex2.maximaOfPoints(p2);
        maxPoints = "[(30.0, 0.0), (29.0, 1.0), (28.0, 2.0), (27.0, 3.0), (26.0, 4.0), (25.0, 5.0), (24.0, 6.0), (23.0, 7.0), (22.0, 8.0), (21.0, 9.0), (20.0, 10.0), (19.0, 11.0), (18.0, 12.0), (17.0, 13.0), (16.0, 14.0), (15.0, 15.0), (14.0, 16.0), (13.0, 17.0), (12.0, 18.0), (11.0, 19.0), (10.0, 20.0), (9.0, 21.0), (8.0, 22.0), (7.0, 23.0), (6.0, 24.0), (5.0, 25.0), (4.0, 26.0), (3.0, 27.0), (2.0, 28.0), (1.0, 29.0), (0.0, 30.0)]";
        maxPoints = maxPoints.replace(" ", "");
        sortX(ans);
        sortY(ans);
        str = Arrays.toString(ans).replace(" ", "");
        SCORE -= str.equals(maxPoints) ? 0 : 5;
        DOC += "Answer: " + maxPoints + ", Your: " + str + "\n";
        } catch (Exception e){}


        try{
        Point[] p3 = new Point[31];
        for (int i = 0; i < 31; i++){
            p3[i] = new Point(i, i);
        }
        ans = Ex2.maximaOfPoints(p3);
        maxPoints = "[(30.0,30.0)]";
        sortX(ans);
        sortY(ans);
        str = Arrays.toString(ans).replace(" ", "");
        SCORE -= str.equals(maxPoints) ? 0 : 5;
        DOC += "Answer: " + maxPoints + ", Your: " + str + "\n";
        } catch (Exception e){}


        try{
        Point[] p4 = new Point[31];
        for (int i = 0; i < 31; i++){
            p4[i] = new Point(-i, -i);
        }
        ans = Ex2.maximaOfPoints(p4);
        maxPoints = "[(0.0,0.0)]";
        sortX(ans);
        sortY(ans);
        str = Arrays.toString(ans).replace(" ", "");
        SCORE -= str.equals(maxPoints) ? 0 : 5;
        DOC += "Answer: " + maxPoints + ", Your: " + str + "\n";
        } catch (Exception e){}


        DOC += "\n________________________________________________________________________";
        DOC += "Current score: ---" + SCORE + "---\n";
        DOC += "________________________________________________________________________\n";
    }


    // 4

    /**
     * In this question you were asked to print the answer in the
     * next format: "a[0]=2, b[0]=10" if the sum exists and "false" if it doesn't.
     * It was specified in the Assignment itself, any other format was rejected
     */
    static void check_ifExists(){
        DOC += "\nQ4\n";
        int[] a = {2, 4, 5, 7}, b={10, 20, 30, 40};
        int[] a1 = new int[1000];
        int[] b1 = new int[1000];
        for(int i = 0; i < 1000; i++){
            a1[i] = i + 1;
            b1[i] = i + 1;
        }
//----------------------
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.out;
        System.setOut(ps);
// ---------------------

        int x = 48;
        Ex2.ifExists(a, b, x);
        String ans = baos.toString().replace(" ", "");
        baos.reset();

        x = 12;
        Ex2.ifExists(a, b, x);
        String ans2 = baos.toString().replace(" ", "");
        baos.reset();

        x = 47;
        Ex2.ifExists(a, b, x);
        String ans3 = baos.toString().replace(" ", "");
        baos.reset();

        x = 35;
        Ex2.ifExists(a, b, x);
        String ans4 = baos.toString().replace(" ", "");
        baos.reset();

        x = 22;
        Ex2.ifExists(a, b, x);
        String ans5 = baos.toString().replace(" ", "");
        baos.reset();

        x = 2000;
        Ex2.ifExists(a1, b1, x);
        String ans6 = baos.toString().replace(" ", "");
        baos.reset();

        x = 0;
        Ex2.ifExists(a1, b1, x);;
        String ans7 = baos.toString().replace(" ", "");
        baos.reset();

        x = 1;
        Ex2.ifExists(a1, b1, x);
        String ans8 = baos.toString().replace(" ", "");
        baos.reset();

        x = 2;
        Ex2.ifExists(a1, b1, x);
        String ans9 = baos.toString().replace(" ", "");

// ---------
        System.out.flush();
        System.setOut(old);
// ---------

        String res = "false\n";
        SCORE -= ans.equals(res) ? 0 : 3;
        DOC += "Answer: " + res + ", Your: " + ans + "\n";

        res = "a[0]=2,b[0]=10\n";
        SCORE -= ans2.equals(res) ? 0 : 3;
        DOC += "Answer: " + res + ", Your: " + ans2 + "\n";

        res = "a[3]=7,b[3]=40\n";
        SCORE -= ans3.equals(res) ? 0 : 3;
        DOC += "Answer: " + res + ", Your: " + ans3 + "\n";

        res = "a[2]=5,b[2]=30\n";
        SCORE -= ans4.equals(res) ? 0 : 3;
        DOC += "Answer: " + res + ", Your: " + ans4 + "\n";

        res = "a[0]=2,b[1]=20\n";
        SCORE -= ans5.equals(res) ? 0 : 3;
        DOC += "Answer: " + res + ", Your: " + ans5 + "\n";

        res = "a[999]=1000,b[999]=1000\n";
        SCORE -= ans6.equals(res) ? 0 : 3;
        DOC += "Answer: " + res + ", Your: " + ans6 + "\n";

        res = "false\n";
        SCORE -= ans7.equals(res) ? 0 : 3;
        DOC += "Answer: " + res + ", Your: " + ans7 + "\n";

        res = "false\n";
        SCORE -= ans8.equals(res) ? 0 : 3;
        DOC += "Answer: " + res + ", Your: " + ans8 + "\n";

        res = "a[0]=1,b[0]=1\n";
        SCORE -= ans9.equals(res) ? 0 : 3;
        DOC += "Answer: " + res + ", Your: " + ans9 + "\n";


       DOC += "\n_________________________________________________________________________________________\n";
    }


    public static void sortX(Point[] points) {
        for (int i = 1; i < points.length; i++){
            int j = i;
            Point temp = points[i];
            double a = temp.getX();
            while ((j > 0) && (points[j-1].getX() > a)){
                points[j] = points[j-1];
                j--;
            }
            points[j] = temp;
        }
    }

    public static void sortY(Point[] points) {
        for (int i = 1; i < points.length; i++){
            int j = i;
            Point temp = points[i];
            double a = temp.getY();
            while ((j > 0) && (points[j-1].getY() > a)){
                points[j] = points[j-1];
                j--;
            }
            points[j] = temp;
        }
    }

    public static void main(String[] args) {
            try {check_spreadCardsOnTable();} catch (Exception e) {}
            try {check_createOriginalLayout();} catch (Exception e) {}
            try {check_maxStack();} catch (Exception e) {}
            try {check_maxSumAdj();} catch (Exception e) {}
            try {check_maximaOfPoints();} catch (Exception e) {}
            try {check_ifExists();} catch (Exception e) {}
        DOC += "\n\t\t FINAL SCORE OF TESTS: " + SCORE;
        System.out.println(DOC);

//        try {
//            File file = new File(args[0] + ".txt");
//
//
//            if (file.createNewFile()) {
//                System.out.println("File created: " + file.getName());
//            } else {
//                System.out.println("File already exists.");
//            }
//            FileWriter fw = new FileWriter(file);
//            fw.write(DOC);
//            fw.close();
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
    }
}

