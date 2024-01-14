
public class addBinaryString {
	
	
	static String addBinary (String a , String b){
		
		int i=a.length()-1;
		int j = b.length()-1;
		int carry=0;
		StringBuilder str=new StringBuilder();
		while(i>=0 || j>=0 || carry==1) {
			int sum=carry;
			if(i>=0) sum+=a.charAt(i)-'0';
			if(j>=0) sum+=b.charAt(j)-'0';
			str.append((char)(sum%2+'0'));
			carry=sum/2;
			i--;
			j--;
			
		}
		return str.reverse().toString();
	}
	
	
	public static void main (String args[]) {

	String a = "1101", b="100";
    
    System.out.println(addBinary(a, b));
	}
}
