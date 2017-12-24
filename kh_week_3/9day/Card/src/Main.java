
public class Main {
	public static void main(String[] args) {
		/*
		 * 트럼프 카드는 총 52장 구성 1 ~ 52
		 * 
		 * ( A,2,3,4,5,6,7,8,9 10 J Q K ) * 4 (스페이드, 다이아, 하트, 클로버)
		 * 
		 * 1 스페이드 A 2 스페이드 2 12 스페이드 Q 13 스페이드 K 14 다이아 1 위처럼 임의의 숫자를 지정하여 카드덱 구성
		 */
		
		
		
		// @@@ 문제 요구사항중 배열인덱스숫자 % 13 의 규칙을 찾는게 가장 중요 A J Q K 처리 .

		// 52장의 트럼프 카드가 저장될 배열
		int card[] = new int[52];
		// 카드를 모두 섞기 위한 boolean 배열 선언
		boolean swit[] = new boolean[52];

		int w = 0, r = 0;
		int num;

		// 카드를 모두 섞기 위한 boolean Array init;
		for (int i = 0; i < swit.length; i++) {
			swit[i] = false;
		}

		// random 1 ~ 52 shuffle
		// 52번 반복 0 ~ 51
		// boolean Array 를 활용하여 모든 값이 다 들어갈수 있도록 init
		while (w < 52) {
			r = (int) (Math.random() * 52); // 0 ~ 51
			if (swit[r] == false) { // !swit[r]
				swit[r] = true;
				card[w] = r; // 0 ~ 51
				w++;
			}
		}

		// 0 ~ 51 까지의 값이 다 들어갔는지 확인
		for (int i = 0; i < card.length; i++) {
			System.out.println("card[" + i + "] = " + card[i]);
		}

		
		int cardNum; // 0 ~ 51 1 ~ 10 J Q K -> 13 * 4

		int cardPic; // 0 ~ 12 -> % 13 13 -> 0

		for (int i = 0; i < card.length; i++) {

			// 숫자 산출
			cardNum = card[i] % 13 + 1; // 1 ~ 13 * 4
			// A 2 3 4 5 ~ 10 J Q K 

			if (cardNum == 1) {
				System.out.print("card Number:" + card[i] + " 숫자:" + "A");
			} else if (cardNum == 11) { // J
				System.out.print("card Number:" + card[i] + " 숫자:" + "J");
			} else if (cardNum == 12) {
				System.out.print("card Number:" + card[i] + " 숫자:" + "Q");
			} else if (cardNum == 13) {
				System.out.print("card Number:" + card[i] + " 숫자:" + "K");
			} else {
				System.out.print("card Number:" + card[i] + " 숫자:" + cardNum);
			}

			// 그림 (스페이드, 다이아, 하트, 클로버)
			// 0 ~ 12 13 ~ 25
			cardPic = card[i] / 13;
			// 0 ~ 51
			// 0 ~ 12 / 13 -> 0
			// 13 ~ 25 / 13 -> 1

			switch (cardPic) {
			case 0:
				System.out.println(" 스페이드");
				break;
			case 1:
				System.out.println(" 다이아");
				break;
			case 2:
				System.out.println(" 하트");
				break;
			case 3:
				System.out.println(" 클로버");
				break;
			}
		}

	}
}
