
public class StringSubset {
	
	public static void sub(String s,String res,int i) {
		if(i==s.length()) {
			System.out.print(res+" ");
			return;
		}
		sub(s,res,i+1);
		sub(s,res+s.charAt(i),i+1);
		
	}
	
	public static void main(String args[]) {
		sub("ABC","",0);
	}

}
