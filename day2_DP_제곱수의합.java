package Day2;
import java.util.Scanner;
/*
<문제>
숫자 N을 제곱수의 합으로 표현하고자 할 때, 사용해야 하는 제곱 수의 최소 개수를 출력하는 프로그램을 작성하시오. 
예를 들어, 숫자 45를 제곱수의 합으로 표현하고자 할 때 필요한 제곱 수의 최소 개수는 2개이며, 이는 다음과 같다.
45 = 3^2 + 6^2
<예제입력1> 45
<예제출력1> 2 
<예제입력2> 38
<예제출력2> 3 
*/
public class day2_DP_제곱수의합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] d = new int[100002];
		d[1] = 1;
		d[2] = 2;
		d[3] = 3;
		for (int i = 4; i <= N; i++) {
			d[i] = i;
			for (int k = 1; k*k <= i; k++) {
				if (d[i] > d[(int) (i-Math.pow(k, 2))] + 1)
					d[i] = d[(int) (i-Math.pow(k, 2))] + 1;
			}
		}
		System.out.println(d[N]);
	}
}
