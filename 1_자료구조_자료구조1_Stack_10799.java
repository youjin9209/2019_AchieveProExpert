import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split("");
		int len = line.length;
		Stack<String> stack = new Stack<String>();
		int result = 0;
		for (int i = 0; i < len; i++) {
			String token = line[i]; 
			if (token.equals("(")) {
				stack.push(line[i]);
			} else if (token.equals(")")) {
				if (line[i-1].equals("(")) {
					stack.pop();
					result += stack.size();
				} else {
					stack.pop();
					result += 1;
				}
			}
		}
		System.out.println(result);
	}
}
