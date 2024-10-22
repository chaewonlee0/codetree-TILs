import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	static int n, maxVal, arr[];

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(bf.readLine());

		n = Integer.parseInt(st.nextToken());

		arr = new int[n + 1];

		st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		maxVal = 1;
		sumSquare(0);
		System.out.println(maxVal);

	}

	static void sumSquare(int num) {
		if (arr[num] > maxVal) {
			maxVal = arr[num];
		}
		if (num == n) {

			return;

		}

		sumSquare(num + 1);

	}
}