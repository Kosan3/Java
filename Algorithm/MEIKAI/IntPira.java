import java.util.Scanner;

public class IntPira {
  public static void npira(int n) {
    for (int i = 1; i <= n; i++) {
      for (int y = i; y < n; y++) {
        System.out.print(" ");
      }
      for (int x = 1; x <= (i - 1) * 2 + 1; x++) {
        int z = i % 10;
        System.out.print(z);
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n;

    System.out.println("数字ピラミッドを作ります。");
    do {
      System.out.print("段数を入力：");
      n = stdIn.nextInt();
    } while (n <= 0);
    npira(n);
  }
}