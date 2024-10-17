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

		System.out.println(re(n));
	}

	static int re(int a) {
		if (a < 10) {
			return a * a;
		}
		return  (a % 10) * (a % 10) + re(a / 10);

	}

}