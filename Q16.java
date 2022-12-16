
public class Q16 {
	
	public static int[] rotateArray(int a[],int k) {
		int rot[]=new int [a.length];
		for(int i=0;i<a.length;i++) {
			rot[i]=a[(i+k)%a.length];
		}
		return rot;
	}
	
	public static void main(String args[]) {
		int a[]= {1,2,3,4,5,6};
		a=rotateArray(a,3);
		for(int e:a) {
			System.out.print(e+" ");
		}
	}
}
