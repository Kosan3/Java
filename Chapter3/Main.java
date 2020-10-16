public class Main {
  public static void main(String[] args) {
    int height = 169;
    int weight = 59;
    if (height >= 170) {
      if (weight <= 68) {
        System.out.println("合格です。");
      } else {
        System.out.println("不合格です。");
      }
    } else {
      System.out.println("不合格です。");
    }
  }
}