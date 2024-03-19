package S2P3;

public class Ex4 {
	
		public static int Left(int i){ 
			return 3*i-1;
		}
		
		public static int mid(int i){ 
			return 3*i;
		}
		
		public static int right(int i) { 
			return 3*i+1;
		}

		public static void swap(int []A ,int i, int j){
			int temp = A[i];
			A[i] = A[j];
			A[j] = temp;
		}
		
		public static void heapify3_down (int []A , int i){
			int max;
			int L = Left(i);
			int m = mid(i);
			int r = right(i);
			
			//if left is max value
			if (L<A.length && A[L]> A[i]) max = L;
			else max = i;
			
			//if middle is max value
			if (m<A.length && A[m]> A[max]) max = m;
			
			//if right is max value
			if (r<A.length && A[r]> A[max]) max = r;
			
			if (max!=i){
				swap(A, i, max);
				heapify3_down(A , max);
			}		

		}
	
	}


