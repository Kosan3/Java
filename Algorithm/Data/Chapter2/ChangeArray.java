import java.util.Scanner;
import java.util.Random;

public class ChangeArray {
  public static int[] changeArray(int[] a) {
    for (int i = 0, l = a.length-1; i <= (l/2); i++, l--) {
      int n = a[i];
      a[i] = a[l];
      a[l] = n;
    }
    return a;
  }

  public static void main(String[] args) {
    System.out.println("配列を作成してください。");
    System.out.print("配列の要素数：");
    Scanner stdIn = new Scanner(System.in);
    int num = stdIn.nextInt();
    int[] a = new int[num];
    for (int i = 0; i < a.length; i++) {
      System.out.print((i+1) + "個めの要素：");
      a[i] = stdIn.nextInt();
    }
    System.out.println("通常の配列");
    System.out.print("[");
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + ",");
    }
    System.out.print("]\n");

    System.out.println("配列を逆にします");
    System.out.print("[");
    int[] c = changeArray(a);
    for (int i = 0; i < c.length; i++) {
      System.out.print(c[i] + ",");
    }
    System.out.print("]");

  }
}