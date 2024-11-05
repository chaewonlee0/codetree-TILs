import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		char [] c = st.nextToken().toCharArray();
		
		Stack<Character> s = new Stack<>();
		
		boolean b = true;
		
		for(int i =0; i< c.length; i++) {
			if(c[i]=='(')
			s.push(c[i]);
			
			else if(c[i]==')' ) {
				if(!s.isEmpty()) {
					s.pop();
				}
				else {
					b = false;
				}
				
			}
		}
		
		if(!b || !s.isEmpty()) {
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
		}
	}
}