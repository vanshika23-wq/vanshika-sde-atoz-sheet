public class shipWithinDDays {

	
	public static int leastWeightCapacity(int [] weights,int d) {
		int maxi = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
            maxi = Math.max(maxi, weights[i]);
        }

        for (int i = maxi; i <= sum; i++) {
            if (count(weights, i) <= d) {
                return i;
            }
        }
        //dummy return statement:
        return -1;
	}
	
	public static int leastWeightCapacityBS(int [] weights,int d) {
		int maxi = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
            maxi = Math.max(maxi, weights[i]);
        }

        int l=maxi,h=sum;
        while(l<=h) {
        	int mid=(l+h)/2;
        	if(count(weights,mid)<=d) {
        		h=mid-1;
        	}
        	else {
        		l=mid+1;
        	}
        }
        //dummy return statement:
        return l;
	}
	
	
	private static int count(int[] weights, int cap) {
		int days = 1; //First day.
        int load = 0;
        int n = weights.length; //size of array.
        for (int i = 0; i < n; i++) {
            if (load + weights[i] > cap) {
                days += 1; //move to next day
                load = weights[i]; //load the weight.
            } else {
                //load the weight on the same day.
                load += weights[i];
            }
        }
        return days;

	}


	public static void main(String[] args) {
        int[] weights = {5, 4, 5, 2, 3, 4, 5, 6};
        int d = 5;
        int ans = leastWeightCapacity(weights, d);
        System.out.println("The minimum capacity should be: " + ans);
        int an = leastWeightCapacityBS(weights, d);
        System.out.println("The minimum capacity should be: " + an);
    }
	
	
}
