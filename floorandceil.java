//The floor of x is the largest element in the array which is smaller than or equal to x.
//The ceiling of x is the smallest element in the array greater than or equal to x.
public class floorandceil {

	public static int floor(int arr[],int k) {
		int l=0,h=arr.length-1,ans=-1;
		while(l<=h) {
			int mid=l+(h-l)/2;
			if(arr[mid]<=k) {
				ans=mid;
				l=mid+1;
			}
			else {
				h=mid-1;
			}
			
		}
		return ans;
	}
	
	public static int ceil(int arr[],int k) {
		int l=0,h=arr.length-1,ans=-1;
		while(l<=h) {
			int mid=l+(h-l)/2;
			if(arr[mid]>=k) {
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
		int arr[]= {1,2,3,4,5,8};
		int floor=floor(arr,6);
		int ceil=ceil(arr,6);
		System.out.println(floor);
		System.out.println(ceil);
	}
	
}
