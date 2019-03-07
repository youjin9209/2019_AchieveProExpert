package Day2;
/*
<예제입력1>
5
1 4 2 3 5 
<출력1>
4
*/
import java.util.Scanner;

public class day2_DP_최장증가부분수열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		int[] d = new int[N];
		d[0] = 1;
		for (int i = 1; i < N; i++) {
			d[i] = 1;
			for (int j = 0; j < i; j++) { // 현재 시점에서 다시 처음부터 돌아야함 
				if (a[i] > a[j] && d[i] < d[j] + 1)
					d[i] = d[j] + 1;
			}
		}
		int max = 0;
		for (int i = 0; i < N; i++) {
			if (max < d[i])
				max = d[i];
		}
		System.out.println(max);
	}
}
