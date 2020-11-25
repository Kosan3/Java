import java.util.Scanner;

public class DayOfYear {
  static int[][] mdays = {
    {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
    {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
  };

  public static int isLeap(int year) {
    return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
  }

  public static int dayOfYear(int y, int m, int d) {
    while (--m != 0) {
      d += mdays[isLeap(y)][m-1];
    }
    return d;
  }

  public static int leftDayOfYear(int y, int m, int d) {
    int leap = (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) ? 366 : 365;
    leap -= d;
    while (--m > 0) {
      leap -= mdays[isLeap(y)][m-1];
    }
    return leap;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int retry;

    System.out.println("年内の経過日数を求めています。");

    do {
      System.out.print("年："); int year = stdIn.nextInt();
      System.out.print("月："); int month = stdIn.nextInt();
      System.out.print("日："); int day = stdIn.nextInt();

      System.out.printf("年内残り%d日です。\n", leftDayOfYear(year, month, day));
      System.out.print("もう一度しますか？ （１・・・はい/０・・・いいえ） ：");
      retry = stdIn.nextInt();
    } while (retry == 1);
  }
}