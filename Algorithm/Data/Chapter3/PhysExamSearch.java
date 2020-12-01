import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

public class PhysExamSearch {
  static class PhyscData {
    private String name;
    private int height;
    private double vision;

    public PhyscData(String name, int height, double vision) {
      this.name = name;
      this.height = height;
      this.vision = vision;
    }

    public String toString() {
      return name + " " + height + " " + vision;
    }

    public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComp();
    private static class HeightOrderComp implements Comparator<PhyscData> {
      public int compare(PhyscData d1, PhyscData d2) {
        return (d1.height > d2.height) ? 1 : (d1.height < d2.height) ? -1 : 0;
      }
    }

    public static final Comparator<PhyscData> VISION_ORDER = new VisionOrderComp();
    private static class VisionOrderComp implements Comparator<PhyscData> {
      public int compare(PhyscData d1, PhyscData d2) {
        return (d1.vision > d2.vision) ? 1 : (d1.vision < d2.vision) ? -1 : 0;
      }
    }
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    PhyscData[] x = {
      new PhyscData("A", 162, 0.1),
      new PhyscData("B", 168, 0.2),
      new PhyscData("C", 169, 0.6),
      new PhyscData("D", 172, 0.9),
      new PhyscData("E", 173, 1.0),
      new PhyscData("F", 174, 1.2),
      new PhyscData("G", 175, 1.5)
    };
    System.out.print("何cmの人を探しますか？：");
    int height = stdIn.nextInt();
    int idx = Arrays.binarySearch(x, new PhyscData("", height, 0.0), PhyscData.HEIGHT_ORDER);
    if (idx < 0) {
      System.out.println("その値の要素は存在しません。");
    } else {
      System.out.println("その値はx[" + idx + "]にあります。");
      System.out.println("データ：" + x[idx]);
    }
    System.out.println("視力の検索：");
    double vision = stdIn.nextDouble();
    int idxv = Arrays.binarySearch(x, new PhyscData("", 0, vision), PhyscData.VISION_ORDER);
    if (idxv < 0) {
      System.out.println("その値はありません。");
    } else {
      System.out.println("その値はx[" + idxv + "]にあります。");
      System.out.println("データ：" + x[idxv]);
    }
  }
}