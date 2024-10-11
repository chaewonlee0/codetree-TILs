import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int A = Integer.parseInt(bf.readLine());
		int cnt = 0;
		for (int i = 1; i <= A; i++) {

			if (i % 100 == 0 && i % 400 != 0) {
				continue;
			} else if (i % 4 == 0) {
				cnt++;
			}

		}
		System.out.println(cnt);
	}
}