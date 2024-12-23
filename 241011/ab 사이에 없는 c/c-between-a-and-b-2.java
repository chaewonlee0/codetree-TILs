import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		boolean satisfied = true;
		for (int i = a; i <= b; i++) {

			if (i % c == 0) {
				satisfied = false;
				break;
			}
		}

		System.out.println(satisfied ? "YES" : "NO");

	}
}