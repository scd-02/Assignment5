import java.util.Arrays;

public class Q14 {
	
	public static void countNo(int a[]) {
		Arrays.sort(a);
		int count=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				System.out.println(a[i]+" : "+(i+1-count));
				count=i+1;
			}
		}
	}
	
	public static void main(String args[]) {
		int a[]= {1,1,2,2,12,3,39,12,1,5,6,7,3,4,5,7,4,4,(int)Double.POSITIVE_INFINITY};
		countNo(a);
	}
}
