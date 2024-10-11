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

		for (int i = 1; i <= n/2; i++) {

			if (n % i ==0) {
				sumVal += i;

			}
		}
		System.out.println(sumVal == n ? "P":"N");
	}
}