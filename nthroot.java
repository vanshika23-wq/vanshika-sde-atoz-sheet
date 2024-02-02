
public class nthroot {
	
	
	
	
	
	public static void main(String[] args) {
        int n = 3, m = 27;
        int ans = NthRoot(n, m);
        System.out.println("The answer is: " + ans);
        int an = NthRootBS(n, m);
        System.out.println("The answer is: " + an);
    }

	private static int NthRootBS(int n, int m) {
		int l=1,h=m;
		while(l<=h) {
			int mid=(l+h)/2;
			int midN=fun(mid,n,m);
			if(midN==1) return mid;
			else if(midN==0) l=mid+1;
			else {
				h=mid-1;
			}
		}
		return -1;
	}

	private static int NthRoot(int n, int m) {
		
		for(int i=1;i<=m;i++) {
			int ans=fun(i,n,m);
		    if(ans ==1) return i;
		    else if (ans==2) break;
		}
		return -1;
		
	}

	private static int fun(int i, int n,int m) {
		
		long ans=1;
		for(int j=1;j<=n;j++) {
			ans=ans*i;
			if(ans>m) return 2;
		}
		if(ans==m) return 1;
		return 0;
		
	}
	
	
	

}
