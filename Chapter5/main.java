public class Main {
  public static double calcTriangleArea(double bottom, double height) {
    return bottom * height / 2;
  }
  public static double calcCircleArea(double radius) {
    return radius * radius * 3.14;
  }
  public static void main(String[] args) {
    double triangleArea = calcTriangleArea(10.0, 5.0);
    double circleArea = calcCircleArea(5.0);
    System.out.println("三角形の面積は" + triangleArea + "cm\n円の面積は" + circleArea + "cm");
  }
}