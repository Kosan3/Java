import java.util.Scanner;

public class SumArray {
  public static int sum(int[] array) {
    int sumArray = 0;
    for (int i = 0; i < array.length; i++) {
      sumArray += array[i];
    }
    return sumArray;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.println("配列の計算をします。");
    System.out.print("配列数：");
    int num = stdIn.nextInt();
    int[] array = new int[num];
    for (int i = 0; i < array.length; i++) {
      System.out.print("array[" + i + "]：");
      array[i] = stdIn.nextInt();
    }
    System.out.println("合計は" + sum(array) + "です。");
  }
}