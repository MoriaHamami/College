package S2P2;

import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;

public class Ex2 {
	
	//Q1.a
	public static ArrayList<Character> spreadCardsOnTable(char[]cards){ 
		//Check for invalid input
		ArrayList<Character> cards_list = new ArrayList<Character>();
		if(cards.length<2) return cards_list;
				
		//Put array in queue
		Queue<Character> queue= new LinkedList<>();
		int white_count=0;
		int black_count=0;
		for(int i=0; i<=cards.length-1; i++) {
			queue.add(cards[i]);
			//If input isn't 'B' or 'W' invalid- return empty.
			if (cards[i] != 'W' && cards[i] != 'B') return cards_list;
			if(cards[i] == 'W') white_count++;
			if(cards[i] == 'B') black_count++;
		}
	
		//If input of deck of cards doesn't include same amount of 'W' and 'B' invalid
		if (black_count !=  white_count) return cards_list;
		
		//Now we will add to the ArrayList the cards from the table in order
		int counter=-1;
		while(!queue.isEmpty()) { 
			counter++;
			if (counter%2==0) cards_list.add(queue.poll()); 
			else queue.add(queue.poll()); 
		}
		
		return cards_list;
	}
	
	//Q1.b
	public static char[] createOriginalLayout(int n){ 
		//Check for invalid input
		char invalid[]={'i','n','v','a','l','i','d', ' ', 'i', 'n', 'p', 'u', 't'};
		if (n<=0) return invalid;
		char array[]= new char [n];
		
		//Put the wanted card order on table in array
		for(int i=0; i<n; i++) {
			if (i%2==0) array[i]='W';
			else array[i]='B';
		}
		
		//Reorganize the wanted order in the new array 
		char arr[]= new char [n];
		arr[0]=array[0];
		for(int i=0, count=0, m=1; m<n; i=(i+1)%n) {
			if (arr[i] !='W' && arr[i] !='B') { 
				count++;
			}
			if (count==2) { 
				arr[i]=array[m];
				count=0;
				m++;
			}
		}

		return arr;
	}
	
	//Q2.a
	public static int maxStack(Stack<Integer>st) {
		if(st.size()==0)return -1;
		Stack<Integer> stack=new Stack<>();
		stack.push(st.pop());
		while(st.size()!=0) {
			if(st.peek()>stack.peek())stack.push(st.pop());
			else st.pop();
		}
		return stack.peek();
	}
	
	//Q2.b
	public static int maxSumAdj(ArrayBlockingQueue<Integer>q) {
		int currMax=Integer.MIN_VALUE;
		int cnt=0;
		for(int i=0;i<q.size();i++) {
			int numB=q.peek(); //saves the head of the queue before the exchange
			q.add(q.poll());
			cnt++; //counting to prevent head+tail situation
			int currNum=q.peek(); //saves the head of the queue after the exchange
			if((numB+currNum>currMax)&&cnt<q.size()) currMax=numB+currNum; //initialize the value of the current maximum if necessary 
		}
		return currMax;
	}
	
	//Q3
	public static Point[] maximaOfPoints(Point []s) {
		
		if (s.length==0)return null;
		
		Point []mid=new Point[s.length];
		int found=0;
		int size=0;
		
		for(int j=0;j<s.length;j++) {
			for(int i=0;i<s.length;i++) {
				if((s[i].getX()>s[j].getX())&&(s[i].getY()>s[j].getY()))break;
					found++; 
			}
			if(found==s.length) mid[size++]=s[j];
			found=0;
		}
		Point []res=new Point[size];
		for(int i=0;i<size;i++) {
				res[i]=mid[i];
		}
		return res;
	}
	
	//Q4
	public static void ifExists(int[]a, int[]b, int x) {

		int low=0; 
		int high=a.length-1;
		boolean found=false;
		
		while(low<b.length && high>=0) {
			if(a[high]+b[low]==x) {
				System.out.println("a["+high+"]="+a[high]+", b["+low+"]="+b[low]);
				found=true;
				//Continue search in order to find other options
				if(low!=b.length-2) low++;
				else high--;
			}
			else if (a[high]+b[low]<x) low++;
			else high--;
		}
		
		if(!found) System.out.println("false");
		
	}

}
