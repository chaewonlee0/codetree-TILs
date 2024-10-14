import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static String A, B;
	static int n, m, sum;
	static int [] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(bf.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		arr = new int[n];
		st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		while (m != 1) {
			findIndex();
			if (m % 2 == 0) {
				m /= 2;
			} else {
				m -= 1;
			}
		}
		
		System.out.println(sum+arr[0]);
	}

	static void findIndex() {
		sum += arr[m-1];

	}
}