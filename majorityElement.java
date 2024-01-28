
public class majorityElement {

	public static void main(String[] args) {
		int arr[]= {8,5,8,6,8,8,5,8};
		int count=1,res=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==arr[res]) {
				count++;
			}
			else {
				count--;
			}
			if(count==0) {
				res=i;
				count=1;
			}
		}
		count =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==arr[res]) {
				count++;
			}
			if(count>arr.length/2) {
				System.out.println(res);
			}
		}
		
	}

}
