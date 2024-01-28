
public class MaximumSubarray {
 
  public static void main(String args[]) {
	int [] arr= {5,-2,5,-7,1};
	int maxEnd=arr[0];
	int res=arr[0];
	for(int i=1;i<arr.length;i++) {
		maxEnd=Math.max(maxEnd+arr[i], arr[i]);
		res=Math.max(maxEnd, res);
	}
	System.out.println(res);
  }
}
