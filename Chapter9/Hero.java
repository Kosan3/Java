public class Hero {
  String name;
  int hp;
  Sword sword;
  public void attack() {
    System.out.println(this.name + "は" + this.sword.name + "で攻撃した！");
  }
  public Hero(String name, int hp) {
    this.hp = hp;
    this.name = name;
  }
  public Hero() {
    this("ダミー", 333);
  }
}