import java.util.ArrayList;
import java.util.List;

public class PermutationString {
	
	public static void per(StringBuilder s,boolean []f,List<Character> l,List<List<Character>> res) {
		if(l.size()==s.length()) {
			res.add(new ArrayList<Character>(l));
			for(char c:l) {
				System.out.print(c);
			}
			return;
		}
			
			
		for (int i=0;i<s.length();i++) {
			if(!f[i]){
				f[i]=true;
				l.add(s.charAt(i));
				per(s,f,l,res);
				l.remove(l.size()-1);
				f[i]=false;
				
			}
        }
    }
	
	

	public static void per(StringBuilder s,int i) {
		if(i==s.length()-1) {
			System.out.print(s+" ");
			return;
		}
			
			
		for (int j = i; j < s.length(); j++) {
            swap(s, i, j);
            per(s, i + 1);
            swap(s, i, j);
        }
    }

    public static void swap(StringBuilder s, int i, int j) {
        char temp = s.charAt(i);
        s.setCharAt(i, s.charAt(j));
        s.setCharAt(j, temp);
    }
	
	public static void main (String args[]) {
		StringBuilder s=new StringBuilder("ABC");
		per(s,0);
		boolean []f=new boolean[s.length()];
		List<Character> l = new ArrayList<Character>();
		List<List<Character>> res= new ArrayList<List<Character>>();
		per(s,f,l,res);
		
	}
}
