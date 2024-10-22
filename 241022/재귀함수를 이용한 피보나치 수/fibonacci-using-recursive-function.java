import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(bf.readLine());

		int n = Integer.parseInt(st.nextToken());

		System.out.println(pibonachi(n));

	}

	static int pibonachi(int n) {

		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 1;
		}

		return pibonachi(n - 2) + pibonachi(n - 1);

	}

}