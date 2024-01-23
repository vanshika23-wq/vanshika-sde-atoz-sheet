
public class subsetSum {
	
	public static boolean sub(int n,int arr[],int sum) {
		if(n==0) return sum==0?true:false;
		return sub(n-1,arr,sum) || sub(n-1,arr,sum-arr[n-1]);
	}
	
	public static void main(String args[]) {
		int [] arr= {3,34,4,12,5,2};
		System.out.print(sub(6,arr,9)); 
	}
	
}
//TC-o(2^n)