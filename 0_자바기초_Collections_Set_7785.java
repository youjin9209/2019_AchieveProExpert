import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<String> d = new HashSet<String>();
		int N = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= N; i++) {
			String[] token = sc.nextLine().split(" ");
			if (token[1].equals("enter")) {
				d.add(token[0]);
			} else if (token[1].equals("leave")) {
				d.remove(token[0]);
			}
		}
		// 역순으로 정렬 : set -> array -> 역순으로 출력 
		String[] arr = d.toArray(new String[d.size()]);
		Arrays.sort(arr);
		int len = arr.length;
		for (int i = len-1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}
}
