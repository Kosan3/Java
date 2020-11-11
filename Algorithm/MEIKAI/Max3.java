class Max3 {
  static int max(int a, int b, int c, int d) {
    int max = a;
    if (b < max) { max = b; }
    if (c < max) { max = c; }
    if (d < max) { max = d; }
    return max;
  }

  public static void main(String[] args) {
    System.out.println(max(3,5,2,5));
    System.out.println(max(1,9,2,5));
    System.out.println(max(3,22,2,1));
  }
}