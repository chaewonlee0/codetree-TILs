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

		int k = Integer.parseInt(st.nextToken());

		String T = st.nextToken();

		String[] arr = new String[n];

		int cnt = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(bf.readLine());
			String tmp = st.nextToken();
			if (tmp.substring(0, T.length()).equals(T)) {
				arr[cnt++] = tmp;
			}
		}
		arr = Arrays.copyOf(arr, cnt);

		Arrays.sort(arr);

		System.out.println(arr[k - 1]);

	}
}