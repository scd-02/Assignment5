
public class Q3 {

	public static long swapBit(long n,int i,int j) {
		long mask=0;
		if(((n>>>i)&1)!=((n>>>j)&1)) {
			mask=(1l<<i)|(1l<<j);
		}
		return n^mask;
	}
	
	public static void main(String[] args) {
		System.out.println(swapBit(12,2,0));
		
	}

}
