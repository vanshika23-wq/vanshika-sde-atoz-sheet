
public class maxCircularSum {

	public static void main(String args[]) {
		int arr[]= {5,-2,3,4};
		int res=0;
		for(int i=0;i<arr.length;i++) {
			int currsum=arr[i];
			int curmax=arr[i];
			for(int j=1;j<arr.length;j++) {
				int index=(i+j)%arr.length;
				currsum+=arr[index];
				curmax=Math.max(curmax, currsum);
	//			res=curmax;
			}
			res=Math.max(res,curmax);
		}
		System.out.println(res);
		
		int normal=normalSum(arr);
		if(normal<0) System.out.println(normal);
		int arr_sum=0;
		for(int i=0;i<arr.length;i++) {
			arr_sum+=arr[i];
			arr[i]=-arr[i];
		}
		int sum=normalSum(arr);
		int resSum=sum+arr_sum;
		System.out.println(resSum);
		
	}

	private static int normalSum(int[] arr) {
		int maxEnd=arr[0];
		int res=arr[0];
		for(int i=1;i<arr.length;i++) {
			maxEnd=Math.max(maxEnd+arr[i],arr[i]);
			res=Math.max(maxEnd, res);
		}
		return res;
	}
}
