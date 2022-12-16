
public class Q6 {
	
	public static int countWords(String s) {
		String str[]=s.split("\\s+",0);
		return str.length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countWords("sss ggre sggg    gsgfsgrr   sggs    "));
	}

}
