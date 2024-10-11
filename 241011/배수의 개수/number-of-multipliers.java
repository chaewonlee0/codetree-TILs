import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int cnt3 = 0, cnt5 = 0;
		for (int i = 0; i < 10; i++) {

			int A = Integer.parseInt(bf.readLine());
			if (A % 3 == 0) {
				cnt3++;
			}
			if(A % 5 ==0) {
				cnt5++;
			}
		}
		System.out.println(cnt3+ " "+cnt5);
	}
}