public class Q18 {

  public static int[] merge(int a[], int b[]) {
    int arr[] = new int[a.length + b.length];
    int i = 0, j = 0, k = 0;
    while (i < a.length && j < b.length) {
      if (a[i] <= b[j]) {
        arr[k++] = a[i++];
      } else {
        arr[k++] = b[j++];
      }
    }
    while (i < a.length) {
      arr[k++] = a[i++];
    }
    while (j < b.length) {
      arr[k++] = b[j++];
    }
    return arr;
  }

  public static void main(String[] args) {
    int a[] = { 1, 2, 3, 4, 12 };
    int b[] = { 5, 6, 7, 8 };
    int arr[] = merge(a, b);
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
