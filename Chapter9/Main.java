public class Main {
  public static void main(String[] args) {
    Sword s = new Sword();
    s.name = "炎の剣";
    s.damage = 10;
    Hero h = new Hero();
    System.out.println("ダミーのhpは" + h.hp);
    h.sword = s;
    Hero h2 = new Hero("上野", 200);
    h2.hp = 200;
    Wizard w = new Wizard();
    w.name = "魔法使い";
    w.hp = 50;
    w.heal(h);
    w.heal(h2);
    w.heal(h2);
  }
}