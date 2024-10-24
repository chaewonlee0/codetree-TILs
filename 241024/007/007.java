import java.io.BufferedReader;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		Secret secret = new Secret(st.nextToken(), st.nextToken(), Integer.parseInt(st.nextToken()));

		System.out.println("secret code : " + secret.code);
		System.out.println("meeting point : " + secret.point);
		System.out.println("time : " + secret.time);

	}
}

class Secret {
	String code;
	String point;
	int time;

	public Secret(String code, String point, int time) {
		this.code = code;
		this.point = point;
		this.time = time;
	}
}