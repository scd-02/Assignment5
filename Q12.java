
public class Q12 {

	public static int[] countFreq(int a) {
		int arr[]= new int [10];
		while(a!=0) {
			arr[a%10]++;
			a=a/10;
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=366548521;
		int freqArr[]=countFreq(n);
		for(int i=0;i<freqArr.length;i++) {
			if(freqArr[i]!=0) {
				System.out.println(i+" -> "+freqArr[i]);
			}
		}
	}

}
