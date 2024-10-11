import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());
		int sumVal = 0, cnt =0;
		double avg ;

		for (int i = 1; i <= n; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken());

				sumVal += a;
				cnt++;
		}
		
		avg = (double)sumVal / cnt;
		
		System.out.printf("%d %.1f", sumVal, avg);
	}
}