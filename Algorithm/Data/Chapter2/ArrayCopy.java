import java.util.Scanner;

public class ArrayCopy {
  public static void copy(int[] a, int[] b) {
    int num = a.length < b.length ? a.length : b.length;
    for (int i = 0, y = b.length-1; i < num; i++, y--) {
      a[i] = b[y];
    }
  }
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.print("aの配列数：");
    int aNum = stdIn.nextInt();
    int[] a = new int[aNum];
    System.out.print("bの配列数：");
    int bNum = stdIn.nextInt();
    int[] b = new int[bNum];
    for (int i = 0; i < b.length; i++) {
      System.out.print("b[" + i + "]：");
      b[i] = stdIn.nextInt();
    }
    copy(a, b);
    System.out.print("[");
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]+" ");
    }
    System.out.println("]");
  }
}