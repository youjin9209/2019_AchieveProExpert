import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= N; i++) {
			String[] line = sc.nextLine().split("");
			int len = line.length;
			int sum = 0;
			for (int j = 0; j < len; j++) {
				if (line[j].equals("(")) {
					sum += 1;
				} else if (line[j].equals(")")) {
					sum -= 1;
				}
				if (sum < 0) break;
			}
			if (sum == 0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
