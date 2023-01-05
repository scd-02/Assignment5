import java.util.Scanner;

public class Q7 {

  public static String password(String n, String d) {
    String pass = n.substring(0, 2) + d.substring(2, 4);
    return pass;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Name: ");
    String name = sc.nextLine();
    System.out.println("Enter your DOB in DDMMYYYY Format:");
    String dob = sc.nextLine();
    System.out.println(password(name, dob));
    sc.close();
  }
}