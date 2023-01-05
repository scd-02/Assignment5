
import java.util.ArrayList;

public class Q17 {

  public static ArrayList<Integer> removeDup(int a[]) {

    ArrayList<Integer> al = new ArrayList<>();
    al.add(a[0]);
    for (int i = 1; i < a.length; i++) {
      if (a[i] != a[i - 1]) {
        al.add(a[i]);
      }
    }
    return al;
  }

  public static void main(String[] args) {
    int a[] = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 6, 7, 7 };
    ArrayList<Integer> al = removeDup(a);
    System.out.println(al);
  }
}

