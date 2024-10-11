import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int cnt = 0;
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		boolean exist = false;
		for (int i = a; i <= b; i++) {

			if (i % c == 0) {
				a = a * 3 + 1;
				exist = true;
				break;
			}
		}

		System.out.println(exist ? "YES" : "NO");

	}
}