import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int sum = 0, cnt = 0;
		double avg = 0;
		while (true) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken());

			if (a / 10 != 2) {
				break;

			}

			sum += a;
			cnt++;

		}
		avg = (double) sum / cnt;
		System.out.printf("%.2f", avg);

	}
}