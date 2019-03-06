package Day2;
import java.util.Scanner;
/*
<문제> 
철수와 영희는 구슬 게임이 구슬 게임을 하려 한다. 이 구슬 게임의 규칙은 다음과 같다.

철수와 영희는 번갈아가며 구슬을 가져간다. 맨 처음에는 철수가 구슬을 가져간다.
구슬을 가져갈 때에는, 최소 1개에서 최대 3개까지 구슬을 가져갈 수 있다.
가져갈 구슬이 없는 사람이 진다.
예를 들어 5개의 구슬이 있다고 하자. 여기서 철수가 1개의 구슬을 가져가고, 영희가 3개의 구슬을 가져간 후, 철수가 마지막으로 1개의 구슬을 가져갔다고 가정하면 이 게임의 승자는 철수가 된다. 
물론, 각자가 어떻게 구슬을 가져가느냐에 따라 승패가 달라질 수 있다. 
철수와 영희는 이기기 위해서 최선을 다해서 게임을 플레이 한다. n개의 구슬을 시작으로 게임을 진행한다고 할 때, 철수가 이 게임을 이길 수 있다면 YES, 그렇지 않다면 NO를 출력하는 프로그램을 작성하시오.
<예제1> 3
<출력1> YES
<예제2> 5
<출력2> YES 
<예제3> 191124
<출력3> NO 
*/
public class day2_구슬게임 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if (N%4 == 0)
			System.out.println("NO");
		else
			System.out.println("YES");
	}
}
