import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int cnt = 0;
		for (int i = 1; i <= 5; i++) {
			int A = Integer.parseInt(bf.readLine());

			if (A % 2 == 0) {
				cnt++;
			} 
		}
		System.out.println(cnt);
	}
}