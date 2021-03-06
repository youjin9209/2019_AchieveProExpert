package Day1;

import java.util.Scanner;

/*
문제 
알파벳에서 'a', 'e', 'i', 'o', 'u'는 모음에 속한다. 
길이 N의 문자열이 주어질 때, 이 문자열 내에 모든 모음 알파벳이 포함되어 있는지를 판단하는 프로그램을 작성하시오.
입력 
첫 번째 줄에 문자열의 길이 N이 주어진다. (1 <= N <= 100,000) 그 후 두 번째 줄에 문자열이 주어진다.
출력 
문자열이 모든 모음 알파벳을 포함하는 경우 YES, 그렇지 않은 경우 NO를 출력한다.
예제 입력 
8
atuongih
예제 출력 
NO
*/
public class day1_P01_모음을모두갖는문자열인지판단 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] arr = new char[N];
		sc.nextLine();
		arr = sc.nextLine().toCharArray();
		boolean[] alphabet = new boolean[26]; // 모음 check 하기 위함 
		int result = 0;
		for (int i = 0; i < N; i++) {
			int idx = arr[i] - 'a';
			if (!alphabet[idx]) { // 중복 체크 방지 
				alphabet[idx] = true;
				if (idx == 0 || idx == 4 || idx == 8 || idx == 14 || idx == 20)
					result += 1;
			}
		}
		if (result == 5)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
