
public class kokoEatingBanana {

	public static void main(String[] args) {
        int[] v = {7, 15, 6, 3};
        int h = 8;
        int ans = minimumRateToEatBananas(v, h);
        System.out.println("Koko should eat at least " + ans + " bananas/hr.");
        int an = minimumRateToEatBananasBS(v, h);
        System.out.println("Koko should eat at least " + an + " bananas/hr.");
    }

	private static int minimumRateToEatBananasBS(int[] v, int h) {
		int low = 1, high = findMax(v);

        //apply binary search:
        while (low <= high) {
            int mid = (low + high) / 2;
            int totalH = time(v, mid);
            if (totalH <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
	}

	private static int minimumRateToEatBananas(int[] v, int h) {
		
		int th=0;
		int m=findMax(v);
		for(int i=1;i<=m;i++) {
			th=time(v,i);
			if(th<=h) return i;
		}
		return -1;
		
	}

	
	private static int time(int[] v, int h) {
		int th=0;
		for(int i=0;i<v.length;i++) {
			th+=Math.ceil((double)(v[i])/(double)(h));
		}
		return th;
	}

	public static int findMax(int[] v) {
	        int maxi = Integer.MIN_VALUE;;
	        int n = v.length;
	        //find the maximum:
	        for (int i = 0; i < n; i++) {
	            maxi = Math.max(maxi, v[i]);
	        }
	        return maxi;
	    }
	}
	
	
	
	

