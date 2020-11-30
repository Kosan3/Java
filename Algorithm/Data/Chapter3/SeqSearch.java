import java.util.Scanner;

public class SeqSearch {

  public static int seqSearch(int[] a, int n, int key) {
    System.out.print("   |");
    for (int i = 0; i < a.length; i++) {
      System.out.printf("%4d", i);
    }
    System.out.print("\n---+");
    for (int k = 0; k < a.length * 4; k++) {
      System.out.print("-");
    }
    System.out.println();
    for (int i = 0; i < a.length; i++) {
      System.out.print("   |");
      System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");
      System.out.print("  " + i + "|");
      for (int y = 0; y < a.length; y++) {
        System.out.printf("%4d", a[y]);
      }
      System.out.println();
      System.out.println("   |");
      if (a[i] == key) { return i; }
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.print("要素数：");
    int num = stdIn.nextInt();
    int[] x = new int[num];

    for (int i = 0; i < num; i++) {
      System.out.print("x[" + i + "]：");
      x[i] = stdIn.nextInt();
    }

    System.out.print("探す値：");
    int ky = stdIn.nextInt();

    int idx = seqSearch(x, num, ky);
    System.out.println();

    if (idx == -1) {
      System.out.println("その値の要素は存在しません。");
    } else {
      System.out.println(ky + "はx[" + idx + "]にあります。");
    }
  }
}