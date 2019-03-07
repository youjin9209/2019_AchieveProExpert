package Day2;
import java.util.Scanner;
/*
<문제>
N개의 정수가 주어질 때, 연속된 부분을 선택하여 합을 최대화 하는 프로그램을 작성하시오. 
<예제입력1>
8
2 3 -5 8 -3 4 2 -9 
<예제출력1>
11 
<예제입력2>
5
-1 -2 3 -2 4 
<예제출력2> 
5
*/
public class day2_DP_연속부분최대합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N+1];
		int[] d = new int[N+1];
		for (int i = 1; i <= N; i++) {
			a[i] = sc.nextInt();
		}
		d[1] = a[1];
		int result = Integer.MIN_VALUE;
		for (int i = 2; i <= N; i++) {
			d[i] = a[i];
			if (d[i] < d[i-1] + a[i]) {
				d[i] = d[i-1] + a[i];
			}
			if (result < d[i])
				result = d[i];
		}
		System.out.println(result);
	}
}
