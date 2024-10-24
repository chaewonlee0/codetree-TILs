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

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (i % 2 == 0) {
				int[] arr2 = Arrays.copyOf(arr, i + 1);
				Arrays.sort(arr2);
				System.out.print(arr2[i / 2] + " ");
			}
		}

	}
}