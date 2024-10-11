import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int prod = 1, cnt =0;
		double avg ;

		for (int i = 1; i <= b; i++) {

			if (i % a ==0) {
		
				prod *= i;

			}
		}
		
		System.out.println(prod);
	}
}