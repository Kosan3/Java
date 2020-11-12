import java.util.Scanner;

class Digit {

   public static void main(String[] args) {
      Scanner stdIn = new Scanner(System.in);

      System.out.println("正の整数値の桁数を求めます。");

      int n;
      do {
         System.out.print("整数値：");
         n = stdIn.nextInt();
      } while (n <= 0);

      int no = 0;         // 桁数
      while (n > 0) {
         n /= 10;         // nを10で割る
         System.out.println(n);
         no++;
      }

      System.out.println("その数は" + no + "桁です。");

      boolean x = true;
      boolean y = true;
      boolean z = false;

      System.out.println(z || x);
      System.out.println(!(!z && !x));
   }
}