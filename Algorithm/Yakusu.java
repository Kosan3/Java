public class Yakusu {
  public static void main(String[] args) {
    int a = 221;
    int b = 143;
    int r = 0;
    do {
      
      r = a % b;
      a = b;
      b = r;
    } while (r != 0);
    System.out.println(a);
  }
}