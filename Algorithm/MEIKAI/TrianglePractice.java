import java.util.Scanner;

public class TrianglePractice {
  public static void triangleA(int n) {
    Scanner stdIn = new Scanner(System.in);
    System.out.println("左下直角二等辺三角形を表示します。");
    for (int i = 1; i <= n; i++) {
      for (int y = 1; y <= i; y++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void triangleB(int n) {
    System.out.println("左上側が直角の二等辺三角形を表示します。");
    for (int i = n; i >= 0; i--) {
      for (int y = i; y >= 0; y--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void triangleC(int n) {
    System.out.println("右上が直角の二等辺三角形を表示します。");
    for (int i = n; i >= 0; i--) {
      for (int y = i; y >= 0; y--) {
        System.out.print("*");
      }
      System.out.println();
      for (int z = n; z >= i; z--) {
        System.out.print(" ");
      }
    }
    System.out.println();
  }

  public static void triangleD(int n) {
    System.out.println("右下直角二等辺三角形を表示します。");
    for (int i = 1; i <= n; i++) {
      for (int z = n; z >= i; z--) {
        System.out.print(" ");
      }
      for (int y = 1; y <= i; y++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }


  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.println("どの二等辺三角形を作りたいですか？");
    System.out.println("1.左下直角  2.左上直角  3.右上直角  4.右下直角");
    System.out.print("番号：");
    int n = stdIn.nextInt();
    System.out.print("段数：");
    int x = stdIn.nextInt();
    switch (n) {
      case 1:
        triangleA(x);
        break;
      case 2:
        triangleB(x);
        break;
      case 3:
        triangleC(x);
        break;
      case 4:
        triangleD(x);
        break;
    }
  }
}