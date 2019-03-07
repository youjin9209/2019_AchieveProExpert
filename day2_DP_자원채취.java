package Day2;
import java.util.Scanner;
/*
<문제> 
이동방향 : 오른쪽/아래쪽 만 가능 
채취할수 있는 최대 양 구하기 
<예제>
5 6
1 7 3 2 8 0
9 2 3 4 5 4
3 4 7 8 2 2
1 4 3 1 4 1
3 2 5 5 3 8 
<출력>
49 
*/
public class day2_DP_자원채취 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1) initialize 
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] a = new int[N+1][M+1];
		int[][] d = new int[N+1][M+1];
		for (int i = 0; i <= N; i++) {
			for (int j = 0; j <= M; j++) {
				if (i >= 1 && j >= 1) {
					a[i][j] = sc.nextInt();
				}
			}
		}
		// 2) process  
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				d[i][j] = Math.max(d[i][j-1], d[i-1][j]) + a[i][j];
 			}
		}
		// 3) get answer
		int answer = d[N][M];
		System.out.println(answer);
	}
}
