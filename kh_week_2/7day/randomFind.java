import java.util.Scanner;
import java.util.Random;

class randomFind
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int r_num, u_num;
		boolean clear;		// 게임클리어
		int w;
		// init
		clear = false;
		w = 0;

		// random(1 ~ 100)
		r_num = (int)(Math.random() * 100) + 1;

		System.out.println("r_num = " + r_num);
		/////////////////////////////// loop

		while(w < 10){

			// user input
			System.out.print("예상 숫자는 = ");
			u_num = sc.nextInt();

			// 판정 (너무 큽니다, 너무 작습니다)
			if(u_num > r_num){
				System.out.println("너무 큽니다");
			}
			else if(u_num < r_num){
				System.out.println("너무 작습니다");
			}
			else{
				clear = true;
				break;
			}
			w++;
		}
		///////////////////////////////
		// 결과 (Game Clear, Game Over)
		if(clear){
			System.out.println("Game Clear!!");
		}
		else{
			System.out.println("Game Over~~");
		}
	}
}
