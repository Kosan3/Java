import java.util.Scanner;

public class SearchReal {
  public static int secSearch(int[] a, int n, int key) {
    System.out.print("   |");
    for (int i = 0; i < n; i++) {
      System.out.printf("%4d", i);
    }
    System.out.print("\n---+");
    for (int i = 0; i < (n * 4) + 1; i++) {
      System.out.print("-");
    }
    System.out.println();
    int fi = 0;
    int li = n-1;
    int ce;
    while (fi <= li) {
      ce = (fi + li) / 2;
      System.out.print("   |");
      System.out.printf(String.format("%%%ds", (fi+1)*4-1 ), "<-");
      System.out.printf(String.format("%%%ds", (ce-fi)*4+1), "+");
      System.out.printf(String.format("%%%ds\n", (li-ce)*4+2), "->");
      System.out.printf("%3d|", ce);
      for (int i = 0; i < n; i++) {
        System.out.printf("%4d", a[i]);
      }
      System.out.println("\n   |");
      if (a[ce] == key) {
        return ce;
      } else if (a[ce] > key) {
        li = ce-1;
      } else {
        fi = ce+1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.print("要素数を入力してください。");
    int n = stdIn.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < a.length; i++) {
      System.out.print("a[" + i + "]：");
      System.out.println(a[i] = i+1);
    }
    System.out.print("探したい要素：");
    int key = stdIn.nextInt();
    int idx = secSearch(a, n, key);
    if (idx == -1) {
      System.out.println("そんなものはありません。");
    } else {
      System.out.println("\n" + key + "はa[" + idx + "]にあります。");
    }

  }
}