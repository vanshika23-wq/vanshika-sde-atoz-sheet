public class countSetBits {

	
	static int countSetBit(int n) {
		int ans=0;
		int i=0;
		while((1<<i)<=n) {
			int change=1<<i;
			boolean k = false;
			for(int j=0;j<=n;j++) {
				if(k==true) ans+=1;
				if(change==1) {
					k=!k;
					change=1<<i;
				}
				else {
					change--;
				}
			}
			i++;
		}
		return ans;
	}
	
	//time complexity- o(n*logn)
	/*static int countSetBit(int n) {
		int bits=0;
		for(int i=1;i<=n;i++) {
			bits+=count(i);
		}
		return bits;
	}
		static int count(int x) {
			if(x<=0) return 0;
			return (x%2==0?0:1)+count(x/2);
		} */
	
	
	
	public static void main(String args[]) {
	int n = 4;
    System.out.print("Total set bit count is ");
    System.out.print(countSetBit(n));
	}
}
