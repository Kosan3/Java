public class Sumof {
  public static int sumof(int a, int b) {
    int difference;
    int sum = 0;
    if (a > b) {
      for (; a >= b; b++) {
        sum += b;
      }
    } else if (b > a) {
      for (; b >= a; a++) {
        sum += a;
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    System.out.println(sumof(3,4));
    System.out.println(sumof(3,9));
    System.out.println(sumof(9,4));
    System.out.println(sumof(2,6));
  }
}