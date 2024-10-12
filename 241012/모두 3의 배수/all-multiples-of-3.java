import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		boolean satisfied = true;
		for (int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int n = Integer.parseInt(st.nextToken());

			if (n % 3 != 0) {
				satisfied = false;
			}

		}
		System.out.println(satisfied ? 1 : 0);

	}

}