import java.util.Scanner;

public class PhysicalExamination {
  static final int VMAX = 21;

  public static class PhyscData {
    String name;
    int height;
    double vision;

    PhyscData(String name, int height, double vision) {
      this.name = name;
      this.height = height;
      this.vision = vision;
    }
  }

  public static double aveHeight(PhyscData[] dat) {
    double sum = 0;

    for (int i = 0; i < dat.length; i++) {
      sum += dat[i].height;
    }
    return sum / dat.length;
  }

  public static void distVision(PhyscData[] dat, int[] dist) {
    int i = 0;
    dist[i] = 0;
    for (i = 0; i < dat.length; i++) {
      if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0) {
        dist[(int)(dat[i].vision * 10)]++;
      }
    }
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    PhyscData[] x = {
      new PhyscData("aaa", 162, 0.3),
      new PhyscData("bbb", 170, 0.7),
      new PhyscData("ccc", 157, 1.5),
      new PhyscData("ddd", 180, 0.3),
      new PhyscData("eee", 177, 0.4),
      new PhyscData("fff", 169, 1.0),
      new PhyscData("ggg", 177, 0.3),
    };
    int[] vdist = new int[VMAX];

    System.out.println("身体検査一覧表");
    System.out.println("氏名      身長　視力");
    System.out.println("-------------------");
    for (int i = 0; i < x.length; i++) {
      System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
    }

    System.out.printf("\n平均身長：%5.1fcm\n", aveHeight(x));

    distVision(x, vdist);

    System.out.println("\n視力の分布");
    for (int i = 0; i < VMAX; i++) {
      System.out.printf("%3.1f～：", i / 10.0);
      for (int y = 0; y < vdist[i]; y++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}