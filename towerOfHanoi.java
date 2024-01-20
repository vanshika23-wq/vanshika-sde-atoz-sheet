
public class towerOfHanoi {
  //if a,b,c is int then
	public static void toh(int n,char a,char b,char c) {
		if(n==1) {
			//a to b
			System.out.println("move 1 from rod "+a +" to "+c);
			return;
		}
		
		toh(n-1,a,c,b);
		//a to b
		System.out.println("move "+n +" from rod "+a +" to "+c);
		//toh(n-1,c,b,a);
		toh(n-1,b,a,c);
	}
	
	public static void main(String atgs[]) {
		toh(3,'a','b','c');
		
		System.out.print(Math.pow(2, 3)-1);
	}
}



