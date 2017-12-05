import java.util.Scanner;

class cashier
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		// 계산대

		// 지불해야할 돈 : 입력 2340원
		// 자신의 돈 : 입력 10000원

		/* 거스름돈 :	5000원권 ?장
					1000원권 ?장
					 500원  ?개
					 100원  ?개
					  50원  ?개
					  10원  ?개
		*/

		int myMoney;		// 내돈
		int price;			// 지불해야 될돈
		int changeMoney;	// 거스름돈

		System.out.print("당신의 돈 = ");	// 10000
		myMoney = sc.nextInt();

		System.out.print("지불해야 될돈 = "); // 2340
		price = sc.nextInt();

		changeMoney = myMoney - price;	// 7660

		int m5000;
		int m1000;
		int m500;
		int m100;
		int m50;
		int m10;

		// 5000		7660 / 5000 -> 1
		m5000 = changeMoney / 5000;

		// 1000		7660 % 5000 -> 2660 / 1000
		m1000 = changeMoney % 5000 / 1000;

		// 500		7660 % 1000 -> 660 / 500
		m500 = changeMoney % 1000 / 500;

		// 100		7660 % 500 -> 160 / 100
		m100 = changeMoney % 500 / 100;

		// 50		7660 % 100 -> 60 / 50
		m50 = changeMoney % 100 / 50;

		// 10		7660 % 50 -> 10 / 10
		m10 = changeMoney % 50 / 10;

		System.out.println("5000원권: " + m5000 + "장");
		System.out.println("1000원권: " + m1000 + "장");
		System.out.println("500원권: " + m500 + "개");
		System.out.println("100원권: " + m100 + "개");
		System.out.println("50원권: " + m50 + "개");
		System.out.println("10원권: " + m10 + "개");



		// 계산기

		int num1, num2;
		int result;

		System.out.print("첫번째 수 = ");
		num1 = sc.nextInt();

		System.out.print("두번째 수 = ");
		num2 = sc.nextInt();

		result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);

		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));

		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));

		System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));


	}
}
