import java.util.Random;

public class Cleric {
  String name;
  int hp = 50;
  final int MAX_HP = 50;
  int mp = 10;
  final int MAX_MP = 10;

  public void selfAid() {
    this.mp -= 5;
    System.out.println("MPを5消費し" + this.mp + "MP");
    this.hp = this.MAX_HP;
    System.out.println(this.name + "のHPは全回復");
  }

  public void pray(int sec) {
    System.out.println(this.name + "は" + sec + "秒間祈った...");
    Random random = new Random();
    int recovery = sec + random.nextInt(3);
    int real_recovery = Math.min(this.MAX_MP - this.mp, recovery);
    this.mp += real_recovery;
    System.out.println(this.name + "は" + real_recovery + "回復し" + this.mp + "MP");
  }
}