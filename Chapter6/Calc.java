public class Calc {
  public static void main(String[] args) {
    int a = 10;
    int b = 6;
    int total = CalcLogic.tasu(a, b);
    int delta = CalcLogic.hiku(a, b);
    System.out.println("足すと" + total + "、引くと" + delta);
  }
}