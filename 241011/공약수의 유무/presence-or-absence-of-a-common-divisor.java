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
		
		boolean exist = false;
		for (int i = a; i <= b; i++) {

			if (1920 % i == 0 && 2880 % i ==0) {
				exist = true;
				break;
			}
		}

		System.out.println(exist ? 1 : 0);

	}
}