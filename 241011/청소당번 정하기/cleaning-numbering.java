import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int A = Integer.parseInt(bf.readLine());
		int cnt2 = 0, cnt3 =0, cnt12 = 0;
		for (int i = 1; i <= A; i++) {

			if (i % 12 == 0) {
				cnt12++;
			}
			else if(i % 3 ==0) {
				cnt3++;
			}
			else if(i % 2==0) {
				cnt2++;
			}

		}
		System.out.println(cnt2+ " "+cnt3+" "+ cnt12);
	}
}