public class trappingRainWater {	
	public static int rain(int []arr) {
		int res=0;
		int [] left=new int[arr.length];
		left[0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			left[i]=Math.max(arr[i], left[i-1]);
		}
		int [] right= new int[arr.length];
		right[arr.length-1]=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--) {
			right[i]=Math.max(arr[i], right[i+1]);
		}
		for(int i=0;i<arr.length;i++) {
			res+=Math.min(left[i], right[i])-arr[i];
		}
		return res;
	}
	public static void main(String args[]) {
		int [] arr= {3,0,1,2,5};
		int res=rain(arr);
		System.out.print(res);
	}

}