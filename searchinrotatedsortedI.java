
public class searchinrotatedsortedI {

	//[4,5,6,7,0,1,2,3]
	
	public static int sear(int []arr,int k) {
		int l=0,h=arr.length-1,ans=-1;
		while(l<=h) {
			int mid=(l+h)/2;
			if(arr[mid]==k) ans=mid;
			if(arr[l]<=arr[mid]) {
				if(k>=arr[l] && k<=arr[mid]) {
					h=mid-1;
				}
				else {
					l=mid+1;
				}
			}
			else {
				if(k>arr[mid] && k<=arr[h]) {
					l=mid+1;
				}
				else {
					h=mid-1;
				}
			}
		}
		return ans;
	}
	
	public static void main(String args[]) {
		int [] arr= {4,5,6,7,0,1,2,3};
		int nas=sear(arr,2);
		System.out.println(nas);
	}
	
}
