public class minDaysMBouq {
	
	public static int roseGarden(int arr[],int k,int m) {
		long val=(long)m*k;
		int n=arr.length;
		if(val>n) return -1;
		int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
		}
		 for (int i = min; i <= max; i++) {
	            if (possible(arr, i, m, k))
	                return i;
	        }
	        return -1;
	}
	
	

	private static boolean possible(int[] arr, int i, int m, int k) {
		int sum=0,c=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[j]<=i) c++;
			else {
				sum+=c/k;
				c=0;
			}
		}
		sum+=c/k;
		return sum>=m;
	}

	
	private static int roseGardenBS(int[] arr, int k, int m) {
		long val=(long)m*k;
		int n=arr.length;
		if(val>n) return -1;
		int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
		}
		int l=min,h=max;
		while(l<=h) {
			int mid=(l+h)/2;
			if(possible(arr,mid,m,k)) {
				h=mid-1;
			}
			else {
				l=mid+1;
			}
		}
		return l;
	}


	public static void main(String[] args) {
        int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
        int k = 3;
        int m = 2;
        int ans = roseGarden(arr, k, m);
        if (ans == -1)
            System.out.println("We cannot make m bouquets.");
        else
            System.out.println("We can make bouquets on day " + ans);
        int an = roseGardenBS(arr, k, m);
        if (an == -1)
            System.out.println("We cannot make m bouquets.");
        else
            System.out.println("We can make bouquets on day " + an);
    }



	
	
	
}
