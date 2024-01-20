import java.util.ArrayList;
import java.util.Arrays;

public class ropeCuttingArray {

	public static ArrayList<Integer> RopeCutting (int arr[], int n) {
        int cur=0;
        Arrays.sort(arr);
        ArrayList list = new ArrayList<>();
        for(int i=1;i<n;i++){
            if(arr[i]-arr[cur]>0){
                cur=i;
                list.add(n-i);
            }
        }
        return list;
    }
	
	public static void main (String args[]) {
		int arr[] = {4,6,7,1,5};
		ArrayList<Integer> list = RopeCutting(arr,4);
		for(int i:list) {
			System.out.println(i);
		}
	}
	
}
