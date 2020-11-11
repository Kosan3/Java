import java.util.Scanner;

public class Gaus {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.println("数字を入力");
    double n = stdIn.nextDouble();
    double half = n / 2;
    double result = (1+n) * half;
    System.out.println((int)result);
  }
}