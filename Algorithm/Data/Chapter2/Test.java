import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    boolean a = stdIn.nextBoolean();
    boolean b = stdIn.nextBoolean();
    boolean c = stdIn.nextBoolean();
    System.out.println();
    System.out.println(a && b || c);
  }
}