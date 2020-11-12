public class Multi99 {
  public static void main(String[] args) {
    System.out.println("-----九九の表-------");

    for (int i = 1; i < 10; i++) {
      for (int x = 1; x < 10; x++) {
        System.out.printf("%3d", i*x);
      }
      System.out.println();
    }
  }
}