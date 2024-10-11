import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int sumVal = 0;
		int n = Integer.parseInt(bf.readLine());

		for (int i = 1; i <= n; i++) {
		int b = Integer.parseInt(bf.readLine());

			if (b % 2 != 0 && b %3 ==0) {
				sumVal+=b;
			} 
		}
		System.out.println(sumVal);
	}
}