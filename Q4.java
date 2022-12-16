
public class Q4 {
	public static long multiBit(long n1,long n2) {
		long res=0;
		while(n2>0) {
			if((n2&1)!=0) {
				res = addBit(res,n1);
			}
			n1=n1<<1;
			n2=n2>>1;
		}
		return res;
	}
	
	public static long addBit(long a, long b) {
		long sum=0, carryin=0,k=1,tempa=a,tempb=b;
		while(tempa!=0||tempb!=0) {
			long ak=a&k, bk=b&k;
			long carryout=(ak&bk)|(ak&carryin)|(bk&carryin);
			sum |=(ak^bk^carryin);
			carryin=carryout<<1;
			k=k<<1;
			tempa=tempa>>>1;
			tempb=tempb>>>1;
		}
		return sum|carryin;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(multiBit(14,3));
	}

}
