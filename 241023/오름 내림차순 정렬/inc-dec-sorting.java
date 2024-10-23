import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Collections;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		Integer arr2[] = new Integer[n];
		int arr[] = new int[n];
		st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			arr2[i] = arr[i];
		}

		Arrays.sort(arr);

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

		Arrays.sort(arr2, Collections.reverseOrder());
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print(arr2[i] + " ");
		}

	}
}