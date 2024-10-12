import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(bf.readLine());

		int n = Integer.parseInt(st.nextToken());
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i*2; j++) {

				System.out.print(" ");
			}
			
			for (int j = i*2; j < 2*n-1; j++) {

				System.out.print("*"+ " ");
			}
			System.out.println();
		}

	}

}