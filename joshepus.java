
public class joshepus {

	public static int josh(int n,int k) {
		if(n==1) return 0;
		return (josh((n-1), k)+k)%n;
	}
	
	public static void main (String args[]) {
		int n=josh(5,3);
		System.out.println(n);
	}
}
//TC-O(n)