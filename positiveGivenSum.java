
public class positiveGivenSum {

	public static void main(String[] args) {
		int s=0;
		int arr[]= {7,4,7,2,3};
		int sum=9;
		int cur=0;
		for(int e=0;e<arr.length;e++) {
			while(cur>sum && s<e) {
				cur-=arr[s];
				s++;
			}
			if(cur==sum) System.out.println(cur);
			cur+=arr[e];
		}

	}

}
