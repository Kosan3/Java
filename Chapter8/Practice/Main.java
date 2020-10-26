public class Main {
  public static void main(String[] args) {
    Cleric c = new Cleric();
    c.selfAId();
    c.pray(1);
    c.pray(1);
    c.pray(1);
    System.out.println(Cleric.MAX_HP);
  }
}