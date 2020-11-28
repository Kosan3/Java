import java.util.Scanner;

public class YMD {
  int y;
  int m;
  int d;

  static int[][] mdays = {
    {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
    {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
  };

  public YMD(int y, int m, int d) {
    this.y = y;
    this.m = m;
    this.d = d;
  }

  public YMD after(int n) {
    YMD tmd = new YMD(this.y, this.m, this.d);
    int yearType = tmd.y % 4 == 0 ? 1 : 0;
    int nokori = this.d + n;
    int m = tmd.m - 1;
    for (; nokori > mdays[yearType][m]; m++) {
      nokori -= mdays[yearType][m];
      if (m == 11) {
        m = -1;
        tmd.y++;
      }
    }
    tmd.d = nokori;
    tmd.m = m+1;

    return tmd;
  }

  public YMD before(int n) {
    YMD tmd = new YMD(this.y, this.m, this.d);
    int yearType = tmd.y % 4 == 0 ? 1 : 0;
    int leave = this.d - n;
    int m = tmd.m - 1;
    for (; leave <= 0; m--) {
      if (m == 0) {
        m = 12;
        tmd.y--;
      }
      leave = mdays[yearType][m-1] + leave;
    }
    tmd.m = m+1;
    tmd.d = leave;
    return tmd;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    YMD time = new YMD(2019,1,1);
    System.out.print("入力：");
    int x = stdIn.nextInt();
    YMD d1 = time.after(x);
    System.out.printf("%d年%d月%d日\n", d1.y, d1.m, d1.d);
    YMD d2 = time.before(x);
    System.out.printf("%d年%d月%d日", d2.y, d2.m, d2.d);
  }
}