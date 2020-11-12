import java.util.Scanner;

public class Step {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.println("正方形を表示します");
    System.out.print("段数は？");
    int x = stdIn.nextInt();
    for (int i = 0; i < x; i++) {
      for (int y = 0; y < x; y++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}