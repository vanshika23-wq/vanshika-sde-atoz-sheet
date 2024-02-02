
public class smallestDivThreshold {

	private static int smallestDivisor(int[] arr, int limit) {
		int min=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			min=Math.max(min, arr[i]);
		}
		
		for (int d = 1; d <= min; d++) {
            //Find the summation result:
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += Math.ceil((double)(arr[i]) / (double)(d));
            }
            if (sum <= limit)
                return d;
        }
        return -1;
	}
	
	
	private static int smallestDivisorBS(int[] arr, int limit) {
		int min=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			min=Math.max(min, arr[i]);
		}
		int l=1,h=min;
		while(l<=h) {
			int mid=(l+h)/2;
			if (sumByD(arr, mid) <= limit) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
			
		}
		return l;
	}
	
	
	private static int sumByD(int[] arr, int mid) {
		int s=0;
		for(int i=0;i<arr.length;i++) {
			s+=Math.ceil((double)arr[i]/(double)mid);
		}
		return s;
	}


	public static void main(String[] args) {
        int[] arr = {8,4,2,3};
        int limit = 10;
        int ans = smallestDivisor(arr, limit);
        System.out.println("The minimum divisor is: " + ans);
        int an = smallestDivisorBS(arr, limit);
        System.out.println("The minimum divisor is: " + an);
    }

	
	
}
