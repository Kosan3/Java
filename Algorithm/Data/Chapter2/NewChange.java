import java.util.Scanner;

public class NewChange {
  public static void changeArray(int[] array) {
    for (int i = 0, y = array.length-1; i < array.length/2; i++, y--) {
      for (int x = 0; x < array.length; x++) {
        System.out.print(array[x] + " ");
      }
      System.out.println("\na[" + i + "]とa[" + y + "]を交換します。");
      int z = array[i];
      array[i] = array[y];
      array[y] = z;
    }
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i]+ " ");
    }
    System.out.println("\n反転が終了しました。");
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
    changeArray(a);
  }
}