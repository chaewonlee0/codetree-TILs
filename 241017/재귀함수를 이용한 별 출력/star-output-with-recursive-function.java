import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	static int repeat;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(bf.readLine());

		repeat = Integer.parseInt(st.nextToken());

		writeStars(1);

	}

	static void writeStars(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}
		if (num == repeat) {
			return;
		}
		System.out.println();

		writeStars(num + 1);

	}
}