
public class Q15 {

	public static boolean checkPrime(int n) {
		for(int i=2;i<Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static int countPrime(int a[]) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(checkPrime(a[i])) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int a[]= {2,7,13,12,55,164,111,999,3,5};
		System.out.println(countPrime(a));
	}

}
