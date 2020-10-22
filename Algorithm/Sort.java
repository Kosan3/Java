public class Sort {
  public static void main(String[] args) {
    int[] array = {12, 10, 11, 14, 13};
    for (int i = 0; i < array.length - 1; i++) {
      int indexMin = i;
      for (int k = i + 1; k < array.length; k++) {
        if (array[k] < array[indexMin]) {
          indexMin = k;
        }
      }
      int w = array[i];
      array[i] = array[indexMin];
      array[indexMin] = w;
    }
    for (int a : array) {
      System.out.println(a);
    }
  }
}