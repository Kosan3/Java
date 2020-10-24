import java.util.Arrays;

public class Sosu {
  public static void main(String[] args) {
    int[] array = new int[101];
    Arrays.fill(array, 1);

    for (int k = 2; k*k <= (array.length-1); k++) {
        for (int i = k; i <= (array.length-1) / k && array[k] == 1; i++) {
          array[i*k] = 0;
        }
    }
    for (int i = 2; i <= (array.length-1); i++) {
      if (array[i] == 1) {
        System.out.println(i);
      }
    }
  }
}