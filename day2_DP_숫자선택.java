package Day2;
import java.util.Scanner;
/*
<문제>
첫 번째 줄에 숫자의 갯수 N이 주어진다. (1 ≤ N ≤ 100,000) 그 후 두 번째 줄에 N개의 숫자가 주어진다. 
각 숫자는 1,000 이하의 음이 아닌 정수이다.
<예제입력>
5
9 3 4 8 2 
<예제출력>
17
*/
/*
<풀이>
i번째 수를 선택하냐 마냐 : d[i][0] / d[i][1]
*/
public class day2_DP_숫자선택 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N+1];
		int[][] d = new int[N+1][2];
		for (int i = 1; i <= N; i++) {
			a[i] = sc.nextInt();
		}
		d[1][0] = a[1]; d[1][1] = 0;
		for (int i = 2; i <= N; i++) {
			d[i][0] = d[i-1][1] + a[i];
			d[i][1] = Math.max(d[i-1][0], d[i-1][1]);
		}
		int result = 0;
		result = (d[N][0] > d[N][1]) ? d[N][0] : d[N][1];
		System.out.println(result);
	}
}
