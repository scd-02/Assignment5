
public class Q11 {
	
	public static String reverseString(String s) {
		String res="";
		for(int i=s.length()-1;i>=0;i--) {
			res +=s.charAt(i);
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(reverseString("Sourav"));
		
	}

}
