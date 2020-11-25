import java.util.Scanner;

public class TryCard {
  public static int card(int x, int y, char[] d) {
    int digit = 0;
    String dchar = "0123456789";
    do {
      d[digit++] = dchar.charAt(x % y);
      x /= y;
    } while (x != 0);
    for (int f = 0, l = digit-1; f < digit/2; f++, l--) {
      char ch = d[f];
      d[f] = d[l];
      d[l] = ch;
    }
    return digit;
  }
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.println("数字を入力してください。");
    int num = stdIn.nextInt();
    char[] array = new char[32];
    int dnum = card(num,2,array);
    for (int i = 0; i < dnum; i++) {
      System.out.print(array[i]);
    }
    System.out.print("です。");
  }
}