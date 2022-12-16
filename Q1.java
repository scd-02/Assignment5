
public class Q1 {

	public static int countBit(int x) {
		int count=0;
		while(x!=0) {
			x=x>>>1;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countBit(16));
	}

}
