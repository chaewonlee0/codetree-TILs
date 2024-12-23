import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		Queue<Integer> queue = new LinkedList<>();

		for (int i = 1; i <= N; i++) {
			queue.add(i);
		}

		while (!queue.isEmpty()) {

			for (int i = 1; i < K; i++) {
				queue.add(queue.poll());

			}
			System.out.print(queue.poll()+ " ");
		}

	}
}