import java.util.Random;

public class Cleric {
  int hp = 50;
  static final int MAX_HP = 50;
  int mp = 10;
  static final int MAX_MP = 10;

  public void selfAId() {
    System.out.println("セルフエイドを発動");
    System.out.println("HPを全回復");
    this.mp -= 5;
    this.hp = this.MAX_HP;
    System.out.println("mpは" + this.mp + "に減少");
  }

  public int pray(int sec) {
    System.out.println("祈った");
    int recovery = new Random().nextInt(3) + sec;
    int realRecovery = Math.min(recovery, this.MAX_MP - this.mp);
    this.mp += realRecovery;
    System.out.println("mpは" + this.mp + "に回復");
    return realRecovery;
  }

}