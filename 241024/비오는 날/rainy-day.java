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
			String date = st.nextToken();
			String day = st.nextToken();
			String weather = st.nextToken();
			h[i] = new hello(date, day, weather);
		}

		Arrays.sort(h);
		
		
		for (int i = 0; i < n; i++) {
			if(h[i].weather.equals("Rain")) {
				System.out.println(h[i].date+" "+ h[i].day+" " + h[i].weather);
				return;
			}
		}

	}
}

class hello implements Comparable<hello> {
	String date;
	String day;
	String weather;

	public hello(String date, String day, String weather) {
		this.date = date;
		this.day = day;
		this.weather = weather;
	}

	@Override
	public int compareTo(hello o) {
		return date.compareTo(o.date);
	}
}