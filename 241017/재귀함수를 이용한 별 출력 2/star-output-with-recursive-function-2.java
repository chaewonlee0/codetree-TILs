import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	static int n;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(bf.readLine());

		n = Integer.parseInt(st.nextToken());

		repeat(n);

	}

	static void repeat(int num) {

		if (num == 0) {
			return;
		}
		for (int i = 0; i < num; i++) {
			System.out.print("*" + " ");
		}
		System.out.println();

		repeat(num - 1);

		for (int i = 0; i < num; i++) {
			System.out.print("*" + " ");
		}
		System.out.println();

	}
}