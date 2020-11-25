public class IntArray {
  public static void main(String[] args) {
    int[] a = new int[5];
    a[1] = 10;
    a[2] = 30;
    a[4] = 40;
    for (int i : a) {
      System.out.println(i);
    }
  }
}
