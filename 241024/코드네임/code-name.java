import java.io.BufferedReader;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		hello[] h = new hello[5];

		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(bf.readLine());
			String grade = st.nextToken();
			int score = Integer.parseInt(st.nextToken());
			h[i] = new hello(grade, score);
		}

		int minVal = 100;
		for (int i = 0; i < 5; i++) {
			if (minVal > h[i].score) {
				minVal = h[i].score;
			}
		}

		for (int i = 0; i < 5; i++) {
			if (h[i].score == minVal) {
				System.out.println(h[i].grade + " " + h[i].score);
			}
		}

	}
}

class hello {
	String grade;
	int score;

	public hello(String grade, int score) {
		this.grade = grade;
		this.score = score;
	}
}