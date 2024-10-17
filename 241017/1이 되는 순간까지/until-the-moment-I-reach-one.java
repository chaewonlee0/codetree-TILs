import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int n, cnt;
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(bf.readLine());
		n = Integer.parseInt(st.nextToken());

		System.out.println(re(n));
	}

	static int re(int a) {
		if (a == 1) {
			return cnt;
		}
		cnt++;

		if (a % 2 == 0) {
			return re(a / 2);
		} else {
			return re(a / 3);
		}

	}

}