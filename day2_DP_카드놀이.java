package Day2;
import java.util.Scanner;
/*
<문제> 
N개의 카드가 주어지고, 각각은 자연수의 점수를 가진다. 철수는 이제 이 카드를 가져감으로써 카드에 적혀있는 수 만큼의 점수를 얻는다. 
단, 카드를 가져갈 때 한가지 규칙이 있는데, 이는 연속하여 3개의 카드는 가져갈 수 없다는 것이다. 
예를 들어, 6개의 카드 “1 3 5 2 7 3”가 주어질 경우, 3+5+7+3 = 18 만큼의 점수를 얻는 것이 최대이다. 
N개의 카드가 주어질 때, 얻을 수 있는 점수의 최댓값을 출력하는 프로그램을 작성하시오. 
<예제입력>
6 (1 ≤ N ≤ 100,000) 
1 3 5 2 7 3 
<출력> 
18
*/
/*
풀이 
0) 중요 포인트 : i 번째 카드의 선택 유무 
1) 점화식 테이블 정의 
d[i][0] : i번째 카드를 선택 했을 경우 / d[i][1] : i번째 카드를 선택 안 했을 경우 
d[i][0] = max(d[i-1][1] + a[i], d[i-2][1] + a[i] + a[i-1]) 
d[i][1] = max(d[i-1][0], d[i-1][1]) 
*/
public class day2_카드놀이 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N+1];
		for(int i = 1; i <= N; i++) {
			a[i] = sc.nextInt();
		}
		int[][] d = new int[N+1][2];
		d[1][0] = a[1]; d[1][1] = 0;
		for(int i = 2; i <= N; i++) {
			d[i][0] = Math.max(d[i-1][1] + a[i], d[i-2][1] + a[i] + a[i-1]); 
			d[i][1] = Math.max(d[i-1][0], d[i-1][1]);
		}
		int result = Math.max(d[N][0], d[N][1]);
		System.out.println(result);
	}
}
