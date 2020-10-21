public class Keisan {
  public static void main(String[] args) {
    int a = 10 - (10/5);
    System.out.println(a);
    a = a - (a / 5);
    System.out.print(a);
    a = a - (a / 5);
    System.out.print(a);
    a = a - (a / 5);
    System.out.print(a);
    a = a - (a / 5);
    System.out.print(a);
    a -= (a / 5);
    System.out.print(a);
  }
}