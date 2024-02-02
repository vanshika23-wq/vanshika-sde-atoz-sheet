
public class firstandlast {

	public static int first(int []arr,int k) {
		
		int l=0,h=arr.length-1,ans=-1;
		while(l<=h) {
			int mid=l+(h-l)/2;
			if(arr[mid]==k) {
				ans=mid;
				h=mid-1;
			}
			else if(arr[mid]<k) l=mid+1;
			else {
				h=mid-1;
			}
		}
		return ans;
		
	}
	
public static int last(int []arr,int k) {
		
		int l=0,h=arr.length-1,ans=-1;
		while(l<=h) {
			int mid=l+(h-l)/2;
			if(arr[mid]==k) {
				ans=mid;
				l=mid+1;
			}
			else if(arr[mid]<k) l=mid+1;
			else {
				h=mid-1;
			}
		}
		return ans;
		
	}

public static void main(String args[]) {
	int arr[]= {1,2,3,4,4,4,5,8};
	int floor=first(arr,4);
	if(floor==-1) System.out.println(-1);
	int ceil=last(arr,4);
	System.out.println(floor);
	System.out.println(ceil);
}
	
}
//[1,2,3,4,4,4,6,7,9]