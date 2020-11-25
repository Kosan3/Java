public class PrimeNumber {
  public static void main(String[] args) {
    int[] prime = new int[500];
    int ptr = 0;
    int counter = 0;

    prime[ptr++] = 2;
    prime[ptr++] = 3;

    for (int n = 5; n <= 1000; n += 2) {
      int i;
      boolean flag = true;
      for (i = 1; prime[i] * prime[i] <= n; i++) {
        counter += 2;
        if (n % prime[i] == 0) {
          flag = false;
          break;
        }
      }
      if (flag) {
        prime[ptr++] = n;
        counter++;
      }
    }

    for (int i = 0; i < ptr; i++) {
      System.out.println(prime[i]);
    }
    System.out.println("計算回数は" + counter + "です。");
  }
}