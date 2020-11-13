import java.util.Scanner;

public class Pira {
  public static void spira(int n) {
    for (int i = 1; i <= n; i++) {
      for (int x = i; n > x; x++) {
        System.out.print(" ");
      }
      for (int y = 1; y <= (i-1) * 2 + 1; y++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.println("ピラミッドを作ります。");
    int n;
    while (true) {
      System.out.print("数字を入力してください：");
      n = stdIn.nextInt();
      if (n > 0) { break; }
      System.out.println("0より大きい数字を入力してください");
    }
    spira(n);
  }
}