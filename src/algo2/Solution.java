package algo2;

public class Solution {
	      public int[] solution(int[] a, int[] b) {

	        int[] result = new int[a.length];

	        int n = getMax(a);
	        int p = getMax(b);

	        int[] cache = setCache(n, p);

	        for (int i = 0; i<a.length; i++) {
	            result[i] = cache[a[i]] % (int) Math.pow(2, b[i]);
	        }

	        return result;
	    }

	    private static int getMax(int[] liste) {
	        int max = liste[0];

	        for (int i = 0; i<liste.length; i++) {
	            if (liste[i] > max) {
	                max = liste[i];
	            }
	        }

	        return max;
	    }

	    public static int[] setCache(int n, int p) {
	        int[] cache = new int[n+1];
	        int previous  = 1;
	        int current = 1;

	        cache[0] = 1;
	        cache[1] = 1;

	        int i = 3;

	        while (i <= n+1){
	            int temp = current;
	            current = (previous + current)  % (int) Math.pow(2, p);
	            previous = temp;

	            cache[i-1] = current;

	            i++;
	        }

	        return cache;
	    }
	

}
