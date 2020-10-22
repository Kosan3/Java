public class BabuleSort {
  public static void main(String[] args) {
    int[] array = {3, 4, 1, 5, 2, 123, 45, 42, 11};
    for (int k = 0; k < array.length - 1; k++) {
      for (int i = array.length - 1; k < i; i--) {
        if (array[i] < array[i - 1]) {
          int w = array[i];
          array[i] = array[i - 1];
          array[i - 1] = w;
        }
      }
    }
    for (int a : array) {
      System.out.println(a);
    }
  }
}