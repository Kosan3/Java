import java.util.Scanner;

public class MaxOfArray {
  public static int maxOf(int[] a) {
    int max = a[0];
    for (int i = 1; i < a.length; i++) {
      if (max < a[i]) {
        max = a[i];
      }
    }
    return max;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.println("身長の最大値を求めます。");
    System.out.print("人数は：");
    int num = stdIn.nextInt();
    int[] height = new int[num];
    for (int i = 0; i < height.length; i++) {
      System.out.print("height[" + (i + 1) + "人目]：");
      height[i] = stdIn.nextInt();
    }
    System.out.println("最大値は" + maxOf(height) + "です。");
  }
}