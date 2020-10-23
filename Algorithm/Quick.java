public class Quick {
  public static void main(String[] args) {
    int[] array = {5,4,7,6,8,3,1,2,9};
    int left = 0;
    int right = array.length - 1;
    for (int a : quickSort(array, left, right)) {
      System.out.println(a);
    }
  }

  public static int[] quickSort(int[] array, int left, int right) {
    int k = right;
    int w;
    for (int i = left + 1; i < k;) {
      for (; array[i] < array[left] && i < right; i++) {}
      for (; array[k] >= array[left] && k > left; k--) {}
      if (i < k) {
        w = array[i];
        array[i] = array[k];
        array[k] = w;
      }
    }
    w = array[left];
    array[left] = array[k];
    array[k] = w;
    if (left < k-1) {
      quickSort(array, left, k-1);
    };
    if (k+1 < right) {
      quickSort(array, k+1, right);
    }
    return array;
  }
}