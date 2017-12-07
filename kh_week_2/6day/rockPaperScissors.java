import java.util.Scanner;
import java.util.Random;

class rockPaperScissors
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		// 가위 바위 보 게임을 작성한다
		int userNum, comNum;
		int win, lose, draw;

		// init
		win = lose = draw = 0;

		System.out.println("--------------<가위 바위 보Game>--------------");

		while(true){

			// random(com)
			comNum = (int)(Math.random() * 3);	// 0 1 2

			// user input
			System.out.print("입력해 주십시오(가위=0, 바위=1, 보=2) = ");
			userNum = sc.nextInt();

			// 비교
			/*
				(가위 == 0)(바위 == 1)(보 == 2)

				com		user	win
				2	-	0	+2 = 4		% 3	-> 1
				0	-	1	+2 = 1		% 3	-> 1
				1	-	2   +2 = 1		% 3	-> 1

				com		user	lose
				0   -   2	+2 = 0		% 3 -> 0
				1	-	0	+2 = 3		% 3 -> 0
				2	-	1	+2 = 3		% 3 -> 0

				com		user	draw
				0	-	0	+2 = 2		% 3 -> 2
				1	-	1	+2 = 2		% 3	-> 2
				2	-	2	+2 = 2		% 3	-> 2

			*/

			int result = (comNum - userNum + 2) % 3;

			// 결과
			String userStr = "";
			String comStr = "";

			String resultStr = "";

			switch(result){
				case 1:		// 승
					win++;
					resultStr = "승리!!";
					break;
				case 0:		// 패
					lose++;
					resultStr = "패배~~~";
					break;
				case 2:		// 무
					draw++;
					resultStr = "비겼음..";
					break;
			}

			if(userNum == 0)	userStr = "가위";
			else if(userNum == 1)	userStr = "바위";
			else				userStr = "보";

			if(comNum == 0)	comStr = "가위";
			else if(comNum == 1)	comStr = "바위";
			else				comStr = "보";

			// 판정
			System.out.println("User:" + userStr + " Com:" + comStr);
			System.out.println("판정:" + resultStr);

			System.out.println("전적: " + win + "승 " + lose + "패 " + draw + "무");

			System.out.print("한판 더 하시겠습니까? (y/n) = ");
			String aw = sc.next();

			if(aw.equals("n")||aw.equals("N")){
				System.out.println("안녕히 가십시오");
				break;
			}
			System.out.println("다시 시작합니다");
		}


	}
}
