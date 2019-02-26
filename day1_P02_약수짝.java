package Day1;
import java.util.Arrays;
/*
약수 짝 
문제
두 양의 정수 A, B의 약수의 갯수가 같을 경우, 이를 "약수 짝"이라고 부른다. 
N개의 양의 정수가 주어질 때, 가능한 "약수 짝"의 경우의 수를 출력하는 프로그램을 작성하시오. 단, 약수 짝 (A, B)와 약수 짝 (B, A)는 같은 경우로 센다.
입력 
첫 번째 줄에 숫자의 갯수 N이 주어진다. (1 <= N <= 100,000) 그 후 두 번째 줄에 N개의 양의 정수가 주어진다. 각 양의 정수는 1,000,000 이하이다.
출력 
가능한 "약수 짝"의 경우의 수를 출력한다.
예제입력 
3
2 3 4
예제출력 
1  
*/
import java.util.Scanner;

public class day1_P02_약수짝 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] input = new int[N];
		int max = 0;
		for (int i = 0; i < N; i++) {
			input[i] = sc.nextInt();
			if (max < input[i])
				max = input[i];
		}
		int[] arr = new int[max];
		for (int i = 0; i < N; i++) {
			// 1) 약수 개수 구하기 
			int num = input[i];
			int cnt = 0;
			for (int j = 1; j <= num; j++) {
				if (num % j == 0)
					cnt++;
			}
			// 2) arr 에 넣기 
			arr[cnt] += 1;
		}
		// 3) 조합 계산 : xC2 
		Arrays.sort(arr);
		int len = arr.length;
		int result = 0;
		for (int i = len-1; i >= 0; i--) {
			int num = arr[i];
			if (num < 2)
				break;
			else {
				result += num*(num-1)/2; 
			}
		}
		System.out.println(result);
	} 
}
