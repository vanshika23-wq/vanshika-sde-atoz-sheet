
public class maxSumRangeK {

	public static void main(String args[]) {
		int arr[]= {5,3,6,3,1,6};
		int k=3;
		int sum=Integer.MIN_VALUE;
		int c=0;
		for(int i=0;i+k-1<arr.length;i++) {
			int cur=0;
			for(int j=0;j<k;j++) {
				cur+=arr[i+j];
			}
			sum=Math.max(cur, sum);
		}
		System.out.println(sum);
		sum=0;
		for(int i=0;i<k;i++) {
			sum+=arr[i];
		}
		for(int i=k;i<arr.length;i++) {
			c+=(arr[i]-arr[i-k]);
			sum=Math.max(c, sum);
		}
		System.out.println(sum);
	}
}
