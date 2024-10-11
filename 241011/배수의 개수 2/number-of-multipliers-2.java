import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int cnt = 0, i =0;
		while(i<10){

			int A = Integer.parseInt(bf.readLine());
			if (A % 2 != 0) {
				cnt++;
			}
            i++;

		}
		System.out.println(cnt);
	}
}