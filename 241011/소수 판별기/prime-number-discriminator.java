import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());

		boolean satisfied = true;
		for (int i = 2; i <= Math.sqrt(n); i++) {

			if (n % i == 0) {
				satisfied = false;
				break;
			}
		}

		System.out.println(satisfied ? "P" : "C");

	}
}