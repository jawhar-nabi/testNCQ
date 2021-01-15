package algo1;

public class Solution {
	    public int[] solution(int N, int[] A) {
	        final int condition = N + 1;
	        int Max = 0;
	        int Update = 0;
	        int counters[] = new int[N];

	        for (int i = 0; i < A.length; i++) {
	            if (A[i] != N+1) {
	            	int pos = A[i] - 1;
	                if (counters[pos] < Update)
	                	counters[pos] = Update + 1;
	                else
	                	counters[pos]++;
	                if (counters[pos] > Max) {
	                    Max = counters[pos];
	                }
	            } else {
	            	Update = Max;
	            }
	        }
	        for (int i = 0; i < N; i++) {
	           if (counters[i] < Update)
	        	   counters[i] = Update;
	        }
	        return counters;
	}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[] x = new int[]{3,4,4,6,1,4,4};
	Solution sol = new Solution();
	int[] test = sol.solution(5,x);
	for (int i =0;i<test.length;i++) {
	System.out.print(test[i]+", ");
	}
		
}

}