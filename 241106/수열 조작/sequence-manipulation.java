import java.io.BufferedReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		int N = Integer.parseInt(st.nextToken());

		Deque<Integer> dq = new ArrayDeque<Integer>();
		
		for(int i =1; i<=N; i++) {
			dq.addLast(i);
		}
		
		while(dq.size()>=2) {
			dq.pollFirst();
			dq.addLast(dq.pollFirst());
		}
		System.out.println(dq.poll());


	}
}