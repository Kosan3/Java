import java.util.Scanner;

public class BinSearchX {
  public static int binSearchX(int[]a, int n, int key) {
    int fi = 0;
    int li = n - 1;
    int ci;
    while (fi <= li) {
      ci = (fi+li) / 2;
      if (a[ci] == key) {
        for (int i = ci - 1; i >= 0; i--) {
          if (a[i] == key) {
            ci = i;
          }
        }
        return ci;
      } else if (a[ci] < key) {
        fi = ci + 1;
      } else {
        li = ci - 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.print("要素数：");
    int n = stdIn.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      System.out.print("a[" + i + "]：");
      a[i] = stdIn.nextInt();
    }
    System.out.print("探す値：");
    int key = stdIn.nextInt();
    int result = binSearchX(a, n, key);
    if (result == -1) {
      System.out.println("なし");
    } else {
      System.out.println(key + "はa[" + result + "]にあり。");
    }
  }
}