import java.util.Scanner;

public class JudgeSign {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.println("整数を入力してください");
    int n = stdIn.nextInt();
    for (int i = 0; (n+1) != i; i++) {
      if (n == i) {
        System.out.println("入力して数は" + i + "です");
      }
    }
  }
}