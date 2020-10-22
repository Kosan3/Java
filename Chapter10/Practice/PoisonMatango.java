public class PoisonMatango extends Matango {
  int poisonPoint = 5;
  public PoisonMatango(char suffix) {
    super(suffix);
  }

  public void attack(Hero h) {
    super.attack(h);
    if (this.poisonPoint > 0) {
      System.out.println("さらに猛毒の胞子をばらまいた！");
      int dmg = h.hp / 5;
      h.hp -= dmg;
      System.out.println(dmg + "ポイントのダメージ！");
      this.poisonPoint--;
      System.out.println("残りHP:" + h.hp);
    }
  }


}