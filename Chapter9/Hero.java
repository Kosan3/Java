public class Hero {
  String name;
  int hp;
  Sword sword;
  public void attack() {
    System.out.println(this.name + "は" + this.sword.name + "で攻撃した！");
  }
  public Hero(String name) {
    this.hp = 100;
    this.name = name;
  }
  public Hero() {
    this("名無し");
  }
}