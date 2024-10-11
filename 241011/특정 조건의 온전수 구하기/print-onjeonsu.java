import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int prod = 1, cnt =0;


		for (int i = 1; i <= n; i++) {

			if (i % 2 ==0 || i % 10==5 || (i % 3 ==0 && i%9!=0)) {
				continue;
			}
			System.out.print(i+ " ");
		}

}
}