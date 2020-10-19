public class Hash {
  public static void main(String[] args) {
    int[] arrayD = {12, 25, 36, 20, 30, 8, 42};
    int[] arrayH = new int[11];
    for (int i = 0; i < arrayD.length; i++) {
      int k = arrayD[i] % 11;
      for (; ; k = (k+1) % arrayH.length) {
        if (arrayH[k] == 0) {
          arrayH[k] = arrayD[i];
          break;
        }
      }
    }
    System.out.print("検索番号は？：");
    int x = new java.util.Scanner(System.in).nextInt();
    int k = x % arrayH.length;
    for (; ; k = (k + 1) % arrayH.length) {
      if (arrayH[k] != 0) {
        if (arrayH[k] == x) {
          System.out.println(k + 1 + "番目の要素です");
          break;
        }
      } else {
        System.out.println("該当なし");
        break;
      }
    }
  }
}