import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		int sumVal = 0;
		int n = Integer.parseInt(st.nextToken());

		for (int i = n; i <= 100; i++) {
				sumVal+=i;
		}
		System.out.println(sumVal);
	}
}