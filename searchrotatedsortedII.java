
public class searchrotatedsortedII {

	public static boolean sear(int []arr,int k) {
		int l=0,h=arr.length-1;
		while(l<=h) {
			int mid=(l+h)/2;
			if(arr[mid]==k) return true;
			if(arr[mid]==arr[l] && arr[mid]==arr[h]) {
				l++;
				h--;
				continue;
			}
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
		return false;
	}
	
	public static void main(String args[]) {
		int [] arr= {4,4,5,6,7,0,0,1,2,2,3};
		boolean nas=sear(arr,2);
		System.out.println(nas);
	}	
}
