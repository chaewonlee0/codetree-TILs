import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(bf.readLine());

		int n = Integer.parseInt(st.nextToken());

		System.out.println(cal(n));

	}

	static int cal(int n) {

		if (n == 1) {
			return 2;
		}
		if (n == 2) {
			return 4;
		}
		return cal(n - 2) * cal(n - 1) % 100;

	}
}