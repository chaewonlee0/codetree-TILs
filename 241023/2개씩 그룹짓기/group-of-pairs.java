import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	static int arr[];
	static int sum, n, cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(bf.readLine());

		int n = Integer.parseInt(st.nextToken());

		arr = new int[2 * n];

		st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < 2 * n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		int sum = 0, maxVal = 0;
		for (int i = 0; i < n; i++) {
			sum = arr[i] + arr[2 * n - i - 1];
			maxVal = Math.max(sum, maxVal);

		}
		System.out.println(maxVal);
	}
}