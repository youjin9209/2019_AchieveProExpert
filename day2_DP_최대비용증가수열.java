package Day2;
import java.util.Scanner;
/*
<문제>
N개의 숫자로 이루어진 수열 A가 주어진다. 이제 이 수열 A에서 증가 수열을 찾으려 한다.
증가 수열을 만들기 위해 A[i]를 선택하게 되면, 그에 해당하는 비용 C[i]를 얻을 수 있다. 
수열 A에서 만들 수 있는 증가 수열 중에서, 그 비용을 최대화 하려 한다고 할 때, 비용의 최댓값을 출력하는 프로그램을 작성하시오. 
<입력>
첫 번째 줄에 숫자의 갯수 N이 주어진다. (1 ≤ N ≤ 1,000) 두 번째 줄에 N개의 정수로 이루어진 수열 A가 주어진다. 
세 번째 줄에 각 원소를 선택했을 때 얻을 수 있는 비용 C가 주어진다. 각각의 비용은 10,000 이하이다.
<예제입력1>
5
1 5 2 3 4
1 9 2 2 3 
<예제출력1>
10 
<예제설명>
첫 번째 숫자 1, 그리고 두 번째 숫자 5를 선택하면, 그 때 얻을 수 있는 비용은 1+9 = 10이다. 만약 1, 2, 3, 4를 선택한다면, 그 때 얻을 수 있는 비용은 1+2+2+3 = 8이므로 이전 경우가 더 좋은 경우라고 할 수 있다.
*/
public class day2_DP_최대비용증가수열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int[] cost = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			cost[i] = sc.nextInt();
		}
		int[] d = new int[N];
		d[0] = cost[0];
		for (int i = 1; i < N; i++) {
			d[i] = cost[i];
			for (int j = 0; j < i; j++) {
				if (a[i] > a[j] && d[i] < d[j] + cost[i])
					d[i] = d[j] + cost[i];
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
