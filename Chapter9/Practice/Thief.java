public class Thief {
  String name;
  int hp;
  int mp;
  public Thief(String name, int mp, int hp) {
    
    this.hp = hp;
    this.mp = mp;
    this.name = name;
  }
  public Thief(String name, int hp) {
    this(name, hp, 9);
  }
  public Thief(String name) {
    this(name, 10);
  }
}