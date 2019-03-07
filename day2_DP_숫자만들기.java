package Day2;
import java.util.Scanner;
/*
<문제> 
숫자 1, 2, 3을 이용하여 숫자 N을 만드는 경우의 수를 출력하는 프로그램을 작성하시오. 
예를 들어, N이 4일 경우에는 다음의 7가지 경우가 존재한다. 단, 경우의 수가 매우 많을 수 있으므로, 경우의 수를 1,000,007 로 나눈 나머지를 출력한다.
1+1+1+1
1+1+2
1+2+1
2+1+1
2+2
1+3
3+1 
<입력> 
4
<예제출력>
7
*/
public class day2_숫자만들기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int div = 1000007;
		int[] d = new int[100001];
		d[1] = 1; d[2] = 2; d[3] = 4;
		for (int i = 4; i <= N; i++) {
			d[i] = d[i-1] + d[i-2] + d[i-3];
			d[i] %= div;
		}
		System.out.println(d[N]);
	}
}
