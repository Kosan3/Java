public class Main {
  public static void main(String[] args) {
    SuperHero sh = new SuperHero("ジェラード", 300);
    Matango m = new Matango("A");
    sh.fly();
    sh.attack(m);
    System.out.println(sh.name + "の強烈なミドルシュート");
    m.attack(sh);
  }
}