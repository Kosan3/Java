public class Hero {
  String name;
  int hp;

  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃！");
    m.hp -= 5;
    System.out.println("5ポイントのダメージ！");
  }

  public void run() {
    System.out.println(this.name + "は逃げ出した！");
  }

  public Hero(String name, int hp) {
    this.name = name;
    this.hp = hp;
  }
}