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
		String[] str_temp = new String[N];
		String[] str = new String[N];
		sc.nextLine();
		str_temp = sc.nextLine().split("");
		// (1) 중복제거 
		str[0] = str_temp[0];
		int str_idx = 1;
		for (int idx = 1; idx < N; idx++) {
			if (!str[str_idx-1].equals(str_temp[idx])) {
				str[str_idx++] = str_temp[idx];
			}
		}
		// (2) 모음 다 포함했는지 check 
		int cnt = 0;
		String result = "NO"; 
		for (int i = 0; i < str_idx; i++) {
			if (str[i].equals("a") || str[i].equals("e") || str[i].equals("i") || str[i].equals("o") || str[i].equals("u"))
				cnt += 1;
			if (i >= 4) {
				if (cnt == 5) {
					result = "YES";
					break;
				}
			}
		}
		System.out.println(result);
	}
}
