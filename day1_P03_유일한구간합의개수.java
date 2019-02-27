package Day1;
/* 유일한 구간합의 개수 
문제 
N개의 정수로 이루어진 배열 A가 주어진다. 여기에서 구간합이란, 배열 A의 특정 연속된 구간의 합을 의미한다. 
예를 들어, 배열 A의 정수가 [2, 3, -1, 4] 로 주어진 경우, 가능한 구간합으로써 (2+3+(-1)) = 4, (3+(-1)+4) = 6 등이 있을 수 있다. 구간의 길이는 1이 될 수도 있다.
N개의 정수로 이루어진 배열 A가 주어질 때, 구간합으로 가능한 값의 갯수를 구하는 프로그램을 작성하시오. 
예를 들어, 위의 배열 [2, 3, -1, 4] 의 경우 가능한 구간합은 다음과 같다.

-1 2 3 4 5 6 8

따라서 가능한 값의 갯수는 7개이다. 
입력 
첫 번째 줄에 숫자의 갯수 N이 주어진다. (1 <= N <= 1,000) 그 후 두 번째 줄에 N개의 정수가 주어진다. 
출력 
구간합으로 가능한 값의 갯수를 출력한다.
예제 입력 
4
2 3 -1 4 
예제 출력 
7
 
*/
import java.util.Scanner;

public class day1_P03_유일한구간합의개수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		Set<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			a[i] = num;
			s.add(num);
		}
		for (int i = 0; i < N-1; i++) {
			int sum = a[i];
			for (int j = i+1; j < N; j++) {
				sum += a[j];
				s.add(sum);
			}
		}
		System.out.println(s.size());
		
	}
}
