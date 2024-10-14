import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static String A, B;
	static int n, m, sum;
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(bf.readLine());
		n = Integer.parseInt(st.nextToken());

		re(1);
		System.out.println();
		reDesc(n);
	}

	static void re(int i) {
		System.out.print(i + " ");

		if (i == n) {
			return;
		}
		re(i + 1);

	}

	static void reDesc(int i) {
		System.out.print(i + " ");

		if (i == 1) {
			return;
		}
		reDesc(i - 1);

	}
}