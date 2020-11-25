import java.util.Scanner;

public class Card {
  public static int cardConvR(int x, int r, char[] d) {
    int digits = 0;
    String dchar = "0123456789";

    do {
      d[digits++] = dchar.charAt(x % r);
      x /= r;
    } while (x != 0);
    return digits;
  }
  public static void main(String[] args) {
    char[] d = new char[32];
    Scanner stdIn = new Scanner(System.in);

    System.out.print("変換する数字：");
    int num = stdIn.nextInt();
    int dno = cardConvR(num, 2, d);

    for (int i = dno-1; i >= 0; i--) {
      System.out.print(d[i]);
    }
  }
}