import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int sumVal = 0, cnt =0;
		double avg ;

		for (int i = 1; i <= 10; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken());

			if (a >= 0 && a <= 200) {
				sumVal += a;
				cnt ++;

			}
		}
		
		avg = (double)sumVal/cnt;

		System.out.printf("%d %.1f" ,sumVal, avg);
	}
}