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
		while (true) {

			if (a % 2 == 0) {
				a = a * 3 + 1;
			} else {
				a = a * 2 + 2;

			}
			cnt++;
			if (a >= 1000) {
				System.out.println(cnt);
				break;
			}

		}

	}
}