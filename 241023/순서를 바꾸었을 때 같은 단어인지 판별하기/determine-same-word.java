import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	static int arr[];
	static int sum, n, cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(bf.readLine());

		char[] word = st.nextToken().toCharArray();

		st = new StringTokenizer(bf.readLine());

		char[] word2 = st.nextToken().toCharArray();

		Arrays.sort(word);
		Arrays.sort(word2);

		if(word.length != word2.length) {
			System.out.println("No");
			return;
		}
		for(int i =0; i<word.length; i++) {
			if(word[i]!=word2[i]) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");

	}
}