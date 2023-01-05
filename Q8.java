public class Q8 {
  public static void main(String[] args) {
    String s = "1233838334";
    String d = "99992172", res = "";
    int i = s.length() - 1, j = d.length() - 1, carry = 0;

    while (i >= 0 && j >= 0) {
      res = (carry + Integer.parseInt("" + s.charAt(i)) + Integer.parseInt("" + d.charAt(j))) % 10 + res;
      carry = (carry + Integer.parseInt("" + s.charAt(i)) + Integer.parseInt("" + d.charAt(j))) / 10;
      i--;
      j--;
    }
    while (i >= 0) {
      res = (carry + Integer.parseInt("" + s.charAt(i))) % 10 + res;
      carry = (carry + Integer.parseInt("" + s.charAt(i))) / 10;
      i--;
    }
    while (j >= 0) {
      res = (carry + Integer.parseInt("" + d.charAt(j))) % 10 + res;
      carry = (carry + Integer.parseInt("" + d.charAt(j))) / 10;
      j--;
    }
    if (carry != 0)
      res = carry + res;
    System.out.println(res);
  }
}
