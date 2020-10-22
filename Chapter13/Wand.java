public class Wand {
  private String name;
  private double power;

  public String getName() { return this.name; }
  public void setName(String name) {
    if (name > 2) {
      this.name = name;
    } else {
      throw new IllegalArgumentException("処理を中断");
    }
  }

  public double getPower() {
    return this.power;
  }

  public void setPower(double power) {
    if (power >= 0.5 && power <= 100) {
      this.power = power;
    } else {
      throw new IllegalAccessException("処理を中断");
    }
  }
}