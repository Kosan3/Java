public class Main {
  public static void main(String[] args) {
    Sword s = new Sword();
    s.name = "炎の剣";
    s.damage = 10;
    Hero h = new Hero();
    h.name = "小坂";
    h.hp = 100;
    h.sword = s;
    Hero h2 = new Hero();
    h2.name = "上野";
    h2.hp = 200;
    Wizard w = new Wizard();
    w.name = "魔法使い";
    w.hp = 50;
    w.heal(h);
    w.heal(h2);
    w.heal(h2);
  }
}