import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int n = Integer.parseInt(st.nextToken());
			switch (n) {
			case 1:
				System.out.println("John");
				break;
			case 2:
				System.out.println("Tom");
				break;
			case 3:
				System.out.println("Paul");
				break;
			case 4:
				System.out.println("Sam");
				break;
			default:
				System.out.println("Vacancy");
                return;
			}

		}

	}
}