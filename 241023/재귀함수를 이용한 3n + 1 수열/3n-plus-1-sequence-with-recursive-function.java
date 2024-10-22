import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	static int cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(bf.readLine());

		int n = Integer.parseInt(st.nextToken());

		cal(n);
		System.out.println(cnt);

	}

	static int cal(int n) {

		if (n == 1) {
			return 1;
		}
		cnt++;
		if (n % 2 == 0) {
			return (cal(n / 2));
		} else {
			return (cal(n * 3 + 1));
		}

	}
}