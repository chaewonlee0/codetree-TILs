import java.io.BufferedReader;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		char [] arr= st.nextToken().toCharArray();

		Arrays.sort(arr);
		
		String srr = new String(arr);
		
		System.out.println(srr);

		
	}
}