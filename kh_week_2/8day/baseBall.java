import java.util.Scanner;
import java.util.Random;

class baseball
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("--------------------< Baseball >--------------------");

		int r_num[], u_num[];
		String strNum;
		boolean clear;
		boolean swit[] = new boolean[10];	// 원하는 숫자의 갯수

		// init
		r_num = new int[3];
		u_num = new int[3];
		clear = false;
		for(int i = 0;i < swit.length; i++){
			swit[i] = false; // 0 0 0 0 0  0 0 0 0 0
		}

		// random 숫자 3개
		/*
		while(true){
			for(int i = 0;i < 5; i++){
				r_num[i] = (int)(Math.random() * 10); // 0 ~ 9
			}
			if(r_num[0] != r_num[1] && r_num[0] != r_num[2]
				&& r_num[1] != r_num[2]){
				break;
			}
		}*/

		/*
			0 1 2 3 4 5 6 7 8 9
			0 0 0 1 0 0 0 0 0 0
		*/

		// 알고리즘 : 탐색, 정렬, 셔플, 트리

		int r, w;

		w = 0;
		while(w < 3){
			r = (int)(Math.random() * 10);	// 0 ~ 9
			if(swit[r] == false){
				swit[r] = true;	// 0 0 1 0 1  0 0 0 0 0
				r_num[w] = r;	// 1 ~ 10
				w++;
			}
		}

		for(int i = 0;i < 3; i++){
			System.out.println("r_num[" + i + "] = " + r_num[i]);
		}

		int strike, ball;
		int loop = 0;
		////////////////////////// loop
		while(loop < 10){

			// user Input
			w = 0;
			strike = 0;
			ball = 0;
			while(w < 3){
				System.out.print((w + 1) + "번째 수 = ");
				strNum = sc.next();
				char c = strNum.charAt(0);
				if((int)c < 48 || (int)c > 57){
					System.out.println("문자를 입력하셨습니다 다시 입력해 주세요");
					continue;
				}

				int _num = Integer.parseInt(strNum);
				if(_num < 0 || _num > 9){
					System.out.println("범위를 벗어났습니다 다시 입력해 주세요");
					continue;
				}

				u_num[w] = Integer.parseInt(strNum);
				w++;
			}

			// System.out.println("성공적으로 입력!!");

			// 비교
			// ball
			for(int i = 0;i < 3; i++){
				for(int j = 0;j < 3; j++){
					if(u_num[i] == r_num[j] && i != j){
						ball++;
					}
				}
			}

			// strike
			for(int i = 0;i < 3; i++){
				if(u_num[i] == r_num[i]){
					strike++;
				}
			}

			// 판정
			if(strike > 2){
				clear = true;
				break;
			}

			// 메시지
			System.out.println(strike + "스트라이크 " + ball + "볼입니다");

			loop++;
		}

		////////////////////////////////

		// 결과
		if(clear){
			System.out.println("축하합니다 클리어하셨습니다");
		}
		else{
			System.out.println("다시 도전하세요");
		}

	}
}
