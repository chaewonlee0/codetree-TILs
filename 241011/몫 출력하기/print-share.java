import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int cnt = 0;
		while (true) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int n = Integer.parseInt(st.nextToken());
			if (n % 2 == 0) {
				System.out.println(n / 2);
				cnt++;
				if (cnt == 3) {
					break;
				}

			}

		}

	}
}