
public class Q5 {

	public static String reverseUsingSB(String s) {
		StringBuffer sb=new StringBuffer(s);
		return sb.reverse().toString();
	}
	public static void main(String[] args) {
		
		System.out.println(reverseUsingSB("Sourav"));
	}

}
