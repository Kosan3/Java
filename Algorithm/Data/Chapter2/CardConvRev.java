import java.util.Scanner;

public class CardConvRev {
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
    Scanner stdIn = new Scanner(System.in);
    int no;
    int cd;
    int dno;
    int retry;
    char[] cno = new char[32];

    System.out.println("10進法を変換します。");
    do {
      do {
        System.out.print("変換する整数：");
        no = stdIn.nextInt();
      } while (no < 0);

      do {
        System.out.print("何進法に変換しますか？：");
        cd = stdIn.nextInt();
      } while (cd < 2 || cd > 36);

      dno = cardConvR(no, cd, cno);

      System.out.print(cd + "進法では");
      for (int i = dno -1; i >= 0; i--) {
        System.out.print(cno[i]);
      }
      System.out.println("です。");

      System.out.print("もう一度しますか （１・・・はい/０・・・いいえ）：");
      retry = stdIn.nextInt();
    } while (retry == 1);
  }
}