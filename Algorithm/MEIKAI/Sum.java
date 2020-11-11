import java.util.Scanner;

public class Sum {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.println("数字を入力せよ");
    int n = stdIn.nextInt();
    int sum = 0;
    String num = "";
    for (int i = 1; n >= i; i++) {
      sum += i;
      if (n != i) {
        num += (i + " + ");
      } else {
        num += i;
      }
    }
    System.out.println(num + " = " + sum);
  }
}