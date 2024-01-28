
public class RemoveDuplicates {

	public static void main (String args[]) {
		int [] arr= {1,2,4,5,7,7};
		int res=1;
		for(int i=1;i<6;i++) {
			if(arr[i]!=arr[res-1]) {
				arr[res]=arr[i];
				res++;
			}
		}
	//	for(int  i=0;i<arr.length;i++) {
		System.out.print(res);
	//}
	}
}
