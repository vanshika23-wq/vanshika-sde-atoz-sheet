
public class kthMissing {

	public static int missingK(int []vec,int n,int k) {
		for(int i=0;i<n;i++) {
			if(vec[i]<=k) k++;
		}
		return k;
	}
	
	public static int missingKBS(int []vec,int n,int k) {
		int l=0,h=vec.length-1;
		while(l<=h) {
			int mid=(l+h)/2;
			int missing =vec[mid]-(mid+1);
			if(missing<k) {
				l=mid+1;
			}
			else {
				h=mid-1;
			}
		}
		return l+k;
	}
	
	
	
	public static void main(String[] args) {
        int[] vec = {4, 7, 9, 10};
        int n = 4, k = 4;
        int ans = missingK(vec, n, k);
        System.out.println("The missing number is: " + ans);
        int an = missingKBS(vec, n, k);
        System.out.println("The missing number is: " + an);
    }
	
}
