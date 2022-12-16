
public class Q2 {

	public static int parityBit(int n) {
		int parity=0;
		while(n!=0) {
			parity = parity^(n&1);
			n= n>>>1;
		}
		return parity;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(parityBit(3));
	}

}
