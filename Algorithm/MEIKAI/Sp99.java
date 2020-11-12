public class Sp99 {
  public static void main(String[] args) {
    System.out.print("   |");
    for (int i = 1; i < 10; i++) {
      System.out.printf("%3d", i);
    }
    System.out.println("\n---+----------------------------");
    for (int x = 1; x < 10; x++) {
      System.out.printf("%2d |", x);
      for (int y = 1; y < 10; y++) {
        System.out.printf("%3d", x*y);
      }
      System.out.println();
    }
  }
}