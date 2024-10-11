import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());

		int prod = 1;


		for (int i = 1; i <= 10; i++) {


			prod *= i;

			if (prod>=n) {
		
				System.out.print(i);
				break;
			}
			
		}
		
	}
}