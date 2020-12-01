import java.util.Scanner;

public class SearchIdx {
	public static int searchIdx(int[] a, int n, int key, int[] idx) {
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				idx[k++] = i;
			}
		}
		return k;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数：");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		int[] idx = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "]：");
			a[i] = stdIn.nextInt();
		}
		System.out.print("探す値：");
		int key = stdIn.nextInt();
		int k = searchIdx(a, n, key, idx);
		System.out.println("合致した要素数は" + k + "個です。");

	}
}