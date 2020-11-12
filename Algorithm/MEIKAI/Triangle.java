import java.util.Scanner;

public class Triangle {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.println("左下直角二等辺三角形を表示します");
    System.out.print("段数を入力：");
    int n;
    do {
      System.out.print("段数は：");
      n = stdIn.nextInt();
    } while (n <= 0);
    for (int i = 0; i < n; i++) {
      for (int y = 0; y <= i; y++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}