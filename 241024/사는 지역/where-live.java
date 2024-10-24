import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Collections;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		int n = Integer.parseInt(st.nextToken());
		hello[] h = new hello[n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(bf.readLine());
			String name = st.nextToken();
			String addr = st.nextToken();
			String city = st.nextToken();
			h[i] = new hello(name, addr, city);
		}

		Arrays.sort(h);

		System.out.println("name " + h[n - 1].name);
		System.out.println("addr " + h[n - 1].addr);
		System.out.println("city " + h[n - 1].city);

	}
}

class hello implements Comparable<hello> {
	String name;
	String addr;
	String city;

	public hello(String name, String addr, String city) {
		this.name = name;
		this.addr = addr;
		this.city = city;
	}

	@Override
	public int compareTo(hello o) {
		return name.compareTo(o.name);
	}
}