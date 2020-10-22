public class Matango {
  String name;
  int hp;
  int dmg;
  public Matango(String name) {
    this.name = name;
    this.hp = 20;
    this.dmg = 250;
  }
  public void attack(Hero h) {
    System.out.println("メタンゴの攻撃");
    System.out.println(this.dmg + "のダメージ");
    h.hp -= this.dmg;
    System.out.println(h.name + "の残りHPは" + h.hp);
  }
}