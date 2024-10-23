import java.io.BufferedReader;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		int n = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(bf.readLine());

		int[] arr = new int[n];
		int[] arr2 = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(bf.readLine());

		for (int i = 0; i < n; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		Arrays.sort(arr2);

		for (int i = 0; i < n; i++) {
			if (arr[i] != arr2[i]) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");

	}
}