import java.util.Scanner;

public class TrianglePractice {
  public static void triangleB(int n) {
    Scanner stdIn = new Scanner(System.in);
    System.out.println("左下直角二等辺三角形を表示します。");
    for (int i = 1; i <= n; i++) {
      for (int y = 1; y <= i; y++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void triangleA(int n) {
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
    triangleB(10);
    triangleA(10);
    triangleC(10);
    triangleD(10);
  }
}