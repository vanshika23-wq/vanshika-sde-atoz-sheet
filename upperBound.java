public class upperBound {

	public static int lb(int arr[],int k) {
		int l=0,h=arr.length-1;
		int ans=-1;
		while(l<=h) {
			int mid=l+(h-l)/2;
			if(arr[mid]>k) {
				ans=mid;
				h=mid-1;
			}
			else {
				l=mid+1;
			}
		}
		return ans;
	}
	
	public static void main(String args[]) {
		int arr[]= {1,2,3,4,5,7};
		int ans=lb(arr,6);
		System.out.println(ans);
	}
	
}

