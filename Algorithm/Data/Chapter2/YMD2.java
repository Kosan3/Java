import java.util.Scanner;

public class YMD2 {
  int y;
  int m;
  int d;

  static int[][] mdays = {
    {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
    {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
  };

  public static int isLeap(int year) {
    return year % 4 == 0 ? 1 : 0;
  }

  public YMD2(int y, int m, int d) {
    this.y = y;
    this.m = m;
    this.d = d;
  }

  public YMD2 after(int n) {
    YMD2 tmd = new YMD2(this.y, this.m, this.d);

    tmd.d += n;

    while (tmd.d > mdays[isLeap(tmd.y)][tmd.m - 1]) {
      tmd.d -= mdays[isLeap(tmd.y)][tmd.m - 1];
      if (++tmd.m > 12) {
        tmd.y++;
        tmd.m = 1;
      }
    }
    return tmd;
  }

  public YMD2 before(int n) {
    YMD2 tmd = new YMD2(this.y, this.m, this.d);

    tmd.d -= n;

    while (tmd.d <= 0) {
      if (--tmd.m <= 0) {
        tmd.m = 12;
        tmd.y--;
      }
      tmd.d += mdays[isLeap(tmd.y)][tmd.m - 1];
    }
    return tmd;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.print("年：");
    int y = stdIn.nextInt();
    System.out.print("月：");
    int m = stdIn.nextInt();
    System.out.print("日：");
    int d = stdIn.nextInt();
    YMD2 tmd = new YMD2(y, m, d);
    System.out.print("日数：");
    int n = stdIn.nextInt();
    YMD2 d1 = tmd.after(n);
    YMD2 d2 = tmd.before(n);
    System.out.printf("%d年%d月%d日\n", d1.y, d1.m, d1.d);
    System.out.printf("%d年%d月%d日\n", d2.y, d2.m, d2.d);
    System.out.println(tmd.mdays[1][3]);
  }
}